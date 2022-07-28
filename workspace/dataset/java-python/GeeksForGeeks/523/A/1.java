

// Java program to find the number of 
// primitive roots modulo prime 
  
import java.io.*; 
  
class GFG { 
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
  
// Function to return the count of 
// primitive roots modulo p 
static int countPrimitiveRoots(int p) 
{ 
    int result = 1; 
    for (int i = 2; i < p; i++) 
        if (__gcd(i, p) == 1) 
            result++; 
  
    return result; 
} 
  
// Driver code 
    public static void main (String[] args) { 
            int p = 5; 
  
    System.out.println( countPrimitiveRoots(p - 1)); 
    } 
} 
// This code is contributed by anuj_67.. 

