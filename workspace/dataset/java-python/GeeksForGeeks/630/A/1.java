

// Java program to search the element 
// in an array for every query and 
// move the searched element to 
// the front after every query 
import java.util.*; 
  
class GFG{ 
   
// Function to find the indices 
static Vector<Integer> processQueries(int Q[], int m, int n) 
{ 
    int []a = new int[m + 1]; 
    int []pos = new int[m + 1]; 
   
    for (int i = 1; i <= m; i++) { 
        a[i - 1] = i; 
        pos[i] = i - 1; 
    } 
   
    Vector<Integer> ans = new Vector<Integer>(); 
   
    // iterate in the query array 
    for (int i = 0; i < n; i++) { 
        int q = Q[i]; 
   
        // store current element 
        int p = pos[q]; 
   
        ans.add(p); 
   
        for (int j = p; j > 0; j--) { 
   
            // swap positions of the element 
            a[j] = a[j] + a[j - 1]; 
            a[j - 1] = a[j] - a[j - 1]; 
            a[j] = a[j] - a[j - 1]; 
   
            pos[a[j]] = j; 
        } 
   
        pos[a[0]] = 0; 
    } 
   
    // return the result 
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // initialise array 
    int Q[] = { 3, 1, 2, 1 }; 
    int n = Q.length; 
   
    int m = 5; 
   
    Vector<Integer> ans = new Vector<Integer>(); 
   
    // Function call 
    ans = processQueries(Q, m, n); 
   
    // Print answers to queries 
    for (int i = 0; i < ans.size(); i++) 
        System.out.print(ans.get(i)+ " "); 
   
} 
} 
  
// This code is contributed by sapnasingh4991 

