

// Java implementation of above approach 
class GFG 
{ 
      
// Function to calculate gcd  
// of two numbers 
static int gcd(int a, int b) 
{ 
    if (a == 0) 
        return b; 
    return gcd(b % a, a); 
} 
  
// Function to calculate all common  
// divisors of two given numbers 
// a, b --> input integer numbers 
static void commDiv(int a, int b) 
{ 
    // find gcd of a, b 
    int n = gcd(a, b); 
  
    a = a / n; 
    b = b / n; 
  
    System.out.println("A = " + a +  
                       ", B = " + b); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a = 10, b = 15; 
    commDiv(a, b); 
}  
} 
  
// This code is contributed 
// by Code_Mech 

