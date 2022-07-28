

// Java implementation of the approach 
class GFG 
{ 
  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
}  
  
// Function to find the smallest divisor  
static int smallestDivisor(int x)  
{  
    // if divisible by 2  
    if (x % 2 == 0)  
        return 2;  
  
    // iterate from 3 to sqrt(n)  
    for (int i = 3; i * i <= x; i += 2)  
    {  
        if (x % i == 0)  
            return i;  
    }  
  
    return x;  
}  
  
// Function to return smallest possible integer 
// which divides the whole array 
static int smallestInteger(int []arr, int n) 
{ 
    // To store the GCD of all the array elements 
    int gcd = 0; 
    for (int i = 0; i < n; i++) 
        gcd = __gcd(gcd, arr[i]); 
  
    // Return the smallest prime factor 
    // of the gcd calculated 
    return smallestDivisor(gcd); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int []arr = { 2, 4, 8 }; 
    int n = arr.length; 
    System.out.println(smallestInteger(arr, n)); 
} 
} 
  
// This code is contributed by Code_Mech. 

