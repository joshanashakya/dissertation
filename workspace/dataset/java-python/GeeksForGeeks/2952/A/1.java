

// Java implementation of the approach 
class GFG  
{ 
  
static int MAX = 100005;  
  
// To store the smallest prime factor  
static int spf[] = new int[MAX];  
  
// Function to store spf of integers  
static void sieve()  
{  
    spf[0] = 1;  
  
    // When gcd is 1 then the answer is -1  
    spf[1] = -1;  
    for (int i = 2; i * i < MAX; i++)  
    {  
        if (spf[i] == 0)  
        {  
            for (int j = i * 2; j < MAX; j += i) 
            {  
                if (spf[j] == 0)  
                {  
                    spf[j] = i;  
                }  
            }  
        }  
    }  
    for (int i = 2; i < MAX; i++)  
    {  
        if (spf[i] != 1)  
            spf[i] = i;  
    }  
}  
  
// Function to return smallest possible integer  
// which divides the whole array  
static int smallestInteger(int[] arr, int n)  
{  
  
    // To store the GCD of all the array elements  
    int gcd = 0;  
    for (int i = 0; i < n; i++)  
        gcd = __gcd(gcd, arr[i]);  
  
    // Return the smallest prime factor  
    // of the gcd calculated  
    return spf[gcd];  
} 
  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
      
} 
  
// Driver code  
public static void main(String[] args)  
{ 
    sieve();  
    int arr[] = { 2, 4, 8 };  
    int n = arr.length;  
    System.out.println(smallestInteger(arr, n));  
} 
} 
  
/* This code contributed by PrinciRaj1992 */

