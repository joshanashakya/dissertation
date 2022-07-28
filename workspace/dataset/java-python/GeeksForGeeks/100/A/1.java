

// Java implementation of the approach 
class GFG 
{ 
      
static int N =100005; 
  
// To store number of divisors and 
// Prefix sum of such numbers 
static int d[] = new int[N], pre[] = new int[N]; 
  
// Function to find the number of integers 
// 1 < x < N for which x and x + 1 have 
// the same number of positive divisors 
static void Positive_Divisors() 
{ 
    // Count the number of divisors 
    for (int i = 1; i < N; i++) 
    { 
  
        // Run a loop upto sqrt(i) 
        for (int j = 1; j * j <= i; j++)  
        { 
  
            // If j is divisor of i 
            if (i % j == 0) 
            { 
  
                // If it is perfect square 
                if (j * j == i) 
                    d[i]++; 
                else
                    d[i] += 2; 
            } 
        } 
    } 
  
    int ans = 0; 
  
    // x and x+1 have same number of 
    // positive divisors 
    for (int i = 2; i < N; i++) 
    { 
        if (d[i] == d[i - 1]) 
            ans++; 
        pre[i] = ans; 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // Function call 
    Positive_Divisors(); 
  
    int n = 15; 
  
    // Required answer 
    System.out.println(pre[n]); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

