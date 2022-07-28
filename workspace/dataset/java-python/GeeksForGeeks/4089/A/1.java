

// Java implementation of the above approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
  
// Recursive function to find  
// gcd using euclidean algorithm  
static int gcd(int a, int b)  
{  
    if (a == 0)  
        return b;  
    return gcd(b % a, a);  
}  
  
// Function to find lcm  
// of two numbers using gcd  
static int lcm(int n, int m)  
{  
    return (n * m) / gcd(n, m);  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int n = 2, m = 3, k = 5;  
  
    System.out.print( k / lcm(n, m)); 
}  
} 
  
// This code is contributed by mohit kumar 29 

