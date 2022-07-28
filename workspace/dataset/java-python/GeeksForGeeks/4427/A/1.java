

// Java program to possible prime number 
import java.util.*; 
class GFG 
{ 
  
// Function to check if a  
// number is prime or not 
static boolean Prime(int n) 
{ 
    for (int j = 2;  
             j <= Math.sqrt(n); j++) 
        if (n % j == 0) 
            return false; 
  
    return true;  
} 
  
// Function to find possible prime number 
static int find_prime(int x, int xsqmodp ,  
                      int y, int ysqmodp) 
{ 
    int n = x * x - xsqmodp; 
    int n1 = y * y - ysqmodp; 
      
    // Find a possible prime number 
    for (int j = 2;  
             j <= Math.max(Math.sqrt(n),  
                           Math.sqrt(n1)); j++)  
    { 
        if (n % j == 0 && (x * x) % j == xsqmodp &&  
            n1 % j == 0 && (y * y) % j == ysqmodp) 
            if (Prime(j)) 
                return j; 
                  
        int j1 = n / j; 
        if (n % j1 == 0 && (x * x) % j1 == xsqmodp &&  
            n1 % j1 == 0 && (y * y) % j1 == ysqmodp) 
            if (Prime(j1)) 
                return j1; 
          
        j1 = n1 / j; 
        if (n % j1 == 0 && (x * x) % j1 == xsqmodp &&  
            n1 % j1 == 0 && (y * y) % j1 == ysqmodp) 
            if (Prime(j1)) 
                return j1; 
    } 
      
    // Last condition 
    if (n == n1) 
        return n; 
    return Integer.MIN_VALUE; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int x = 3, xsqmodp = 0,  
        y = 5, ysqmodp = 1; 
      
    // Function call 
    System.out.println(find_prime(x, xsqmodp,  
                                  y, ysqmodp)); 
} 
} 
  
// This code is contributed by PrinciRaj1992  

