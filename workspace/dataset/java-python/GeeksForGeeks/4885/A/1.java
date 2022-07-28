

// Java implementation of the approach 
import java.util.*; 
   
class solution 
{ 
    // Utility function to print  
    // the contents of the array 
    void printArr(int b[], int n) 
    { 
        for (int i = 0; i < n; i++) 
        { 
             System.out.print(" " + b[i] + " "); 
         } 
    } 
  
    // Function to build array B[] 
    void ModifiedArray(int a[], int n) 
    { 
        // Lower and upper limits 
        int l = 0, r = Integer.MAX_VALUE; 
  
        // To store the required array 
        int[] b = new int[n]; 
          
    // Apply greedy approach 
    for (int i = 0; i < n / 2; i++) { 
        b[i] = Math.max(l, a[i] - r); 
        b[n - i - 1] = a[i] - b[i]; 
        l = b[i]; 
        r = b[n - i - 1]; 
    } 
  
    // Print the built array b[] 
    printArr(b, n); 
}     
// Driver code 
public static void main(String args[]) 
{ 
   int a[] = { 5, 6 }; 
   int n = a.length ; 
   solution s=new solution(); 
   s.ModifiedArray(a, 2 * n); 
  
} 
} 
//This code is contributed by Shivi_Aggarwal 

