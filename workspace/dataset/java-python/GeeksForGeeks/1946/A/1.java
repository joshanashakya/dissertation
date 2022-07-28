

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// To store the final ans 
static int ans; 
  
// Function to sum of all subsets of a 
// given array 
static void subsetSum(Vector<Integer> c) 
{ 
    int L = c.size(); 
    int mul = (int)Math.pow(2, L - 1); 
    for (int i = 0; i < c.size(); i++) 
        ans += c.get(i) * mul; 
} 
  
// Function to generate the subsets 
static void subsetGen(int []arr, int i,  
                      int n, Vector<Integer> c) 
{ 
    // Base-case 
    if (i == n)  
    { 
  
        // Finding the sum of all the subsets 
        // of the generated subset 
        subsetSum(c); 
        return; 
    } 
  
    // Recursively accepting and rejecting 
    // the current number 
    subsetGen(arr, i + 1, n, c); 
    c.add(arr[i]); 
    subsetGen(arr, i + 1, n, c); 
    c.remove(0); 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int arr[] = { 1, 1 }; 
    int n = arr.length; 
  
    Vector<Integer> c = new Vector<Integer>(); 
  
    subsetGen(arr, 0, n, c); 
    System.out.println(ans); 
} 
} 
  
// This code is contributed by 29AjayKumar 

