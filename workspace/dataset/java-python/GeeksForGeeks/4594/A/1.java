

// Java implementation of the approach 
class GFG  
{ 
  
// Recursive function to return 
// the gcd of a and b 
static int gcd(int a, int b) 
{ 
    // Everything divides 0 
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
} 
  
// Function to print the number of 
// flips for both the sand timers 
static void flip(int a, int b) 
{ 
    int lcm = (a * b) / gcd(a, b); 
    a = lcm / a; 
    b = lcm / b; 
    System.out.print((a - 1) + " " + (b - 1)); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a = 10; 
    int b = 5; 
    flip(a, b); 
} 
}  
  
// This code is contributed by 29AjayKumar 

