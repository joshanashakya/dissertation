

// Java program to print nearest element  
// with at least one common prime factor. 
import java.util.*; 
import java.lang.*; 
  
class GFG  
{ 
static void nearestGcd(int []arr, int n)  
{  
    // Loop covers the every 
    // element of arr[]  
    for (int i = 0; i < n; ++i)  
    {  
        int closest = -1;  
  
        // Loop that covers from 0 to  
        // i-1 and i+1 to n-1 indexes  
        // simultaneously  
        for (int j = i - 1, k = i + 1;  
                 j > 0 || k <= n; --j, ++k)  
        {  
            if (j >= 0 && __gcd(arr[i], arr[j]) > 1)  
            {  
                closest = j + 1;  
                break;  
            }  
            if (k < n && __gcd(arr[i], arr[k]) > 1)  
            {  
                closest = k + 1;  
                break;  
            }  
        }  
  
        // print position of closest element  
        System.out.print(closest + " ");  
    }  
}  
  
// Recursive function to return  
// gcd of a and b  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);  
}  
  
// Driver Code  
public static void main(String args[])  
{  
    int []arr = {2, 9, 4, 3, 13};  
    int n = arr.length;  
    nearestGcd(arr, n);  
}  
} 
  
// This code is contributed  
// by Akanksha Rai 

