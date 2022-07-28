

// Java program to count pair in  
// range of natural number having  
// GCD equal to given number. 
import java.util.*; 
  
class GFG { 
      
// Return the GCD of two numbers. 
static int gcd(int a, int b)  
{ 
    return b > 0 ? gcd(b, a % b) : a;  
} 
  
// Return the count of pairs 
// having GCD equal to g. 
static int countGCD(int L, int R, int g) { 
      
    // Setting the value of L, R. 
    L = (L + g - 1) / g; 
    R = R / g; 
  
    // For each possible pair check if GCD is 1. 
    int ans = 0; 
    for (int i = L; i <= R; i++) 
    for (int j = L; j <= R; j++) 
        if (gcd(i, j) == 1) 
        ans++; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args) { 
      
    int L = 1, R = 11, g = 5; 
    System.out.println(countGCD(L, R, g)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

