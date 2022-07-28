

// Java program to find 
// number of co-prime  
// pairs in array 
import java.io.*; 
  
class GFG { 
      
    // Recursive function to 
    // return gcd of a and b 
    static int gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0 || b == 0) 
        return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return gcd(a-b, b); 
              
        return gcd(a, b-a); 
    } 
      
    // function to check for gcd 
    static boolean coprime(int a, int b) 
    { 
        return (gcd(a, b) == 1); 
    } 
      
    // Returns count of co-prime 
    // pairs present in array 
    static int numOfPairs(int arr[], int n)  
    {  
          
        int count = 0;  
        for (int i = 0; i < n - 1; i++)  
            for (int j = i + 1; j < n; j++) 
                if (coprime(arr[i], arr[j])) 
                    count++; 
                      
        return count; 
    } 
      
    // driver code 
    public static void main(String args[]) 
                            throws IOException 
    { 
        int arr[] = { 1, 2, 5, 4, 8, 3, 9 }; 
        int n = arr.length;  
          
        System.out.println(numOfPairs(arr, n)); 
    } 
} 
  
/* This code is contributed by Nikita Tiwari.*/

