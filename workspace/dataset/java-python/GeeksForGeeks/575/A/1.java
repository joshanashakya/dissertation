

// Java program to find the largest 
// number that cannot be formed  
// from given two coins 
import java.io.*; 
  
class GFG 
{ 
// Utility function to find gcd 
    static int gcd(int a, int b) 
    { 
        int c; 
        while (a != 0) 
        { 
            c = a; 
            a = b % a; 
            b = c; 
        } 
        return b; 
    } 
  
    // Function to print the 
    // desired output 
    static void forbenius(int X,  
                          int Y) 
    { 
        // Solution doesn't exist  
        // if GCD is not 1 
        if (gcd(X, Y) != 1) 
        { 
            System.out.println( "NA"); 
            return; 
        } 
      
        // Else apply the formula 
        int A = (X * Y) - (X + Y); 
        int N = (X - 1) * (Y - 1) / 2; 
      
        System.out.println("Largest Amount = " + A ); 
        System.out.println("Total Count = " + N ); 
    } 
      
    // Driver Code 
    public static void main(String[] args) 
    { 
        int X = 2,Y = 5; 
        forbenius(X, Y); 
        X = 5; 
        Y = 10; 
        System.out.println(); 
        forbenius(X, Y); 
          
    } 
} 
  
// This code is contributed by Sam007 

