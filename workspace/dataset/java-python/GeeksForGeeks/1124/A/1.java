

// Java Program to construct an array whose 
// GCD of every consecutive element is the 
// given array 
  
import java.io.*; 
  
class GFG { 
      
    // Recursive function to return gcd of 
    // a and b 
    static int __gcd(int a, int b) 
    { 
          
        // Everything divides 0  
        if (a == 0 || b == 0) 
        return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return __gcd(a - b, b); 
              
        return __gcd(a, b - a); 
    } 
  
    // Return the LCM of two numbers. 
    static int lcm(int a, int b) 
    { 
        return (a * b) / __gcd(a, b); 
    } 
      
    // Print the required constructed array 
    static void printArray(int a[], int n) 
    { 
          
        // printing the first element. 
        System.out.print( a[0] + " "); 
      
        // finding and printing the LCM of  
        // consecutive element of given array. 
        for (int i = 0; i < n - 1; i++) 
            System.out.print(lcm(a[i], 
                            a[i + 1]) + " "); 
      
        // printing the last element of the 
        // given array. 
        System.out.print(a[n - 1]); 
    } 
      
    // Driven Program 
    public static void main (String[] args) 
    { 
        int a[] = { 1, 2, 3 }; 
        int n = a.length; 
        printArray(a, n); 
    } 
} 
  
// This code is contributed by anuj_67. 

