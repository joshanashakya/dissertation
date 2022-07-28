

// Java program for finding reemainder set 
import java.util.*; 
class GFG  
{ 
  
// function to find remainder set 
static void findSet(int arr[], int n, 
                    int k, int m) 
{ 
    Vector<Integer> []remainder_set = new Vector[k]; 
    for (int i = 0; i < k; i++) 
    { 
        remainder_set[i] = new Vector<Integer>(); 
    } 
      
    // calculate remainder set array 
    // and push element as per their remainder 
    for (int i = 0; i < n; i++)  
    { 
        int rem = arr[i] % k; 
        remainder_set[rem].add(arr[i]); 
    } 
      
    // check whether sizeof any remainder set 
    // is equal or greater than m 
    for (int i = 0; i < k; i++) 
    { 
        if (remainder_set[i].size() >= m) 
        { 
            System.out.println("Yes"); 
            for (int j = 0; j < m; j++)  
                    System.out.print(remainder_set[i].get(j) + " ");      
            return; 
        } 
    } 
    System.out.print("No"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = {5, 8, 9, 12, 13, 7, 11, 15}; 
    int k = 4; 
    int m = 3; 
    int n = arr.length; 
    findSet(arr, n, k, m); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

