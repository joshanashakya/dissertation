

// Java implementation of  
// above approach 
import java.io.*; 
  
class GFG  
{ 
  
// Recursive function to  
// return gcd of a and b  
static int __gcd(int a, int b)  
{  
    // Everything divides 0  
    if (a == 0 || b == 0)  
    return 0;  
      
    // base case  
    if (a == b)  
        return a;  
      
    // a is greater  
    if (a > b)  
        return __gcd(a - b, b);  
    return __gcd(a, b - a);  
}  
  
// Calculating GCD of an array. 
static int find_Gcd(int crr[], int n) 
{ 
    int i; 
    int result = crr[0]; 
    for (i = 1; i < n; i++) 
        result = __gcd(crr[i], result); 
  
    return result; 
} 
  
// Function to calculate the Share 
static void profitRatio(int amountArr[],  
                        int timeTrr[], 
                        int n) 
{ 
    int i; 
    int crr[] = new int[n] ; 
    for (i = 0; i < n; i++) 
        crr[i] = amountArr[i] *  
                 timeTrr[i]; 
  
    int Share = find_Gcd(crr, n); 
  
    for (i = 0; i < n - 1; i++) 
    System.out.print(crr[i] / Share + " : "); 
    System.out.print(crr[i] / Share); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int amountArr[] = {5000, 6000, 1000}; 
    int timeTrr[] = {6, 6, 12}; 
      
    int n = amountArr.length; 
      
    profitRatio(amountArr, timeTrr, n); 
} 
} 
  
// This code is contributed  
// by inder_verma. 

