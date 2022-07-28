

// Java program to find Array formed by adding 
// each element of given array with largest 
// element in new array to its left 
  
public class GFG 
{ 
      
// Function to find array B from array  
// A such that Ai = Bi – max(B0…Bi-1) 
static void find_array(int []a, int n) 
{ 
    // Initialising as 0 as first  
    // element will remain same 
    int x = 0; 
      
    for (int i = 0; i < n; i++) { 
  
        // restoring values of B 
        a[i] += x; 
  
        System.out.print(a[i] + " "); 
          
        // Find max value 
        x = Math.max(x, a[i]); 
    } 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int []a = {40, 12, 62}; 
    int n = a.length ; 
      
    // Function call 
    find_array(a, n); 
} 
} 
  
// This code is contributed by Yash_R 

