

// Java implementation of the approach 
class GFG 
{ 
  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
}  
  
// Function to return the maximum profit 
static int maxProfit(int n, int a, int b,  
                            int x, int y) 
{ 
    int res = x * (n / a); 
    res += y * (n / b); 
  
    // min(x, y) * n / lcm(a, b) 
    res -= Math.min(x, y) * (n / ((a * b) / __gcd(a, b))); 
    return res; 
} 
  
// Driver code 
public static void main (String[] args) 
{ 
    int n = 6, a = 6, b = 2, x = 8, y = 2; 
    System.out.println(maxProfit(n, a, b, x, y)); 
} 
} 
  
// This code is contributed by mits 

