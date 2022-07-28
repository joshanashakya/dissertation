

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
} 
  
// Function to return the LCM of two numbers 
static int lcm(int x, int y) 
{ 
    int temp = (x * y) / __gcd(x, y); 
    return temp; 
} 
  
// Function to print the requried numbers 
static void findNumbers(int a[], int n,  
                        int b[], int m) 
{ 
  
    // To store the lcm of array a[] elements 
    // and the gcd of array b[] elements 
    int lcmA = 1, gcdB = 0; 
  
    // Finding LCM of first array 
    for (int i = 0; i < n; i++) 
        lcmA = lcm(lcmA, a[i]); 
  
    // Finding GCD of second array 
    for (int i = 0; i < m; i++) 
        gcdB = __gcd(gcdB, b[i]); 
  
    // No such element exists 
    if (gcdB % lcmA != 0)  
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    // All the multiples of lcmA which are 
    // less than or equal to gcdB and evenly 
    // divide gcdB will satisfy the conditions 
    int num = lcmA; 
    while (num <= gcdB)  
    { 
        if (gcdB % num == 0) 
            System.out.print(num + " "); 
        num += lcmA; 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int a[] = { 1, 2, 2, 4 }; 
    int b[] = { 16, 32, 64 }; 
  
    int n = a.length; 
    int m = b.length; 
  
    findNumbers(a, n, b, m); 
} 
} 
  
// This code is contributed by 29AjayKumar 

