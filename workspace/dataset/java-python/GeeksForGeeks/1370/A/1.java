

// Java implementation of the approach  
class GFG 
{ 
      
static int gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return gcd(b, a % b);  
}  
  
// Function to return the count of common factors  
// of a and b such that all the elements  
// are co-prime to one another  
static int maxCommonFactors(int a, int b)  
{  
      
    // GCD of a and b  
    int __gcd = gcd(a, b);  
  
    // Include 1 initially  
    int ans = 1;  
  
    // Find all the prime factors of the gcd  
    for (int i = 2; i * i <= __gcd; i++) 
    {  
        if (__gcd % i == 0) 
        {  
            ans++;  
            while (__gcd % i == 0)  
                __gcd /= i;  
        }  
    }  
  
    // If gcd is prime  
    if (__gcd != 1)  
        ans++;  
  
    // Return the required answer  
    return ans;  
}  
  
// Driver code  
public static void main (String[] args)  
{  
    int a = 12, b = 18;  
  
    System.out.println(maxCommonFactors(a, b));  
}  
} 
  
// This code is contributed by AnkitRai01 

