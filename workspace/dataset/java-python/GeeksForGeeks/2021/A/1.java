

// Java program to find tan(x) expansion 
class GFG 
{ 
  
// Function to find factorial of a number 
static int fac(int num) 
{ 
    if (num == 0) 
        return 1; 
  
    // To store factorial of a number 
    int fact = 1; 
    for (int i = 1; i <= num; i++) 
        fact = fact * i; 
  
    // Return the factorial of a number 
    return fact; 
} 
  
// Function to find tan(x) upto n terms 
static void Tanx_expansion(int terms, int x) 
{ 
    // To store value of the expansion 
    double sum = 0; 
  
    for (int i = 1; i <= terms; i += 1) 
    { 
          
        // This loops here calculate Bernoulli number 
        // which is further used to get the coefficient 
        // in the expansion of tan x 
        double B = 0; 
        int Bn = 2 * i; 
        for (int k = 0; k <= Bn; k++)  
        { 
            double temp = 0; 
            for (int r = 0; r <= k; r++) 
                temp = temp + Math.pow(-1, r) * fac(k) *  
                              Math.pow(r, Bn) / (fac(r) *  
                                                 fac(k - r)); 
  
            B = B + temp / ((double)(k + 1)); 
        } 
        sum = sum + Math.pow(-4, i) *  
               (1 - Math.pow(4, i)) * B *  
                    Math.pow(x, 2 * i - 1) / fac(2 * i); 
    } 
  
    // Print the value of expansion 
    System.out.printf("%.9f", sum); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 6, x = 1; 
  
    // Function call 
    Tanx_expansion(n, x); 
} 
} 
  
// This code is contributed by Rajput-Ji 

