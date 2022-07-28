

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
  
    // Recursive function to return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        // Everything divides 0  
        if (a == 0)  
        return b;  
        if (b == 0)  
        return a;  
          
        // base case  
        if (a == b)  
            return a;  
          
        // a is greater  
        if (a > b)  
            return __gcd(a-b, b);  
        return __gcd(a, b-a);  
    }  
  
    // Function to return the minimum 
    // deletions required 
    static int MinDeletion(int a[], int n) 
    { 
      
        // To store the GCD of the array 
        int gcd = 0; 
        for (int i = 0; i < n; i++) 
            gcd = __gcd(gcd, a[i]); 
      
        // GCD cannot be 1 
        if (gcd > 1) 
            return -1; 
      
        // GCD of the elements is already 1 
        else
            return 0; 
    } 
  
  
    // Driver code 
    public static void main (String[] args)  
    { 
        int a[] = { 3, 6, 12, 81, 9 }; 
        int n = a.length; 
  
        System.out.print(MinDeletion(a, n)); 
    } 
} 
  
// This code is contributed by anuj_67.. 

