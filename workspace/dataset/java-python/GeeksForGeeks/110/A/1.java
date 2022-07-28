

// Java program to count number of Co-prime pairs 
// from 1 to N with product equals to N 
import java.io.*; 
  
public class GFG { 
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
  
// Function to count number of Co-prime pairs 
// from 1 to N with product equals to N 
static void countCoprimePairs(int n) 
{ 
    int count = 0; 
  
    System.out.println( "The co- prime pairs are: "); 
  
    // find all the co- prime pairs 
    // Traverse from 2 to sqrt(N) and check 
    // if i, N/i are coprimes 
    for (int i = 2; i <= Math.sqrt(n); i++) { 
  
        // check if N is divisible by i, 
        // so that the other term in pair i.e. N/i 
        // is integral 
        if (n % i == 0) { 
  
            // Check if i and N/i are coprime 
            if (__gcd(i, (n / i)) == 1) { 
  
                // Display the co- prime pairs 
                System.out.print( "(" +i + ", " + (n / i) + ")\n"); 
                count++; 
            } 
        } 
    } 
  
    System.out.println("\nNumber of coprime pairs : " + count); 
} 
  
// Driver code 
    public static void main (String[] args) { 
            int N = 120; 
  
    countCoprimePairs(N); 
    } 
} 
  
// This code is contributed by shs.. 

