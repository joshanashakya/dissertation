

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to return the gcd of two numbers 
static int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Function to return the minimum 
// possible health for the monster 
static int solve(int health[], int n) 
{ 
    // gcd of first and second element 
    int currentgcd = gcd(health[0], health[1]); 
  
    // gcd for all subsequent elements 
    for (int i = 2; i < n; ++i)  
    { 
        currentgcd = gcd(currentgcd, health[i]); 
    } 
    return currentgcd; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int health[] = { 4, 6, 8, 12 }; 
    int n = health.length; 
    System.out.println(solve(health, n)); 
} 
} 
  
// This code is contributed by 
// Surendra_Gangwar 

