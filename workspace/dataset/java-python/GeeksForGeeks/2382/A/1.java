

// Java program to find n-th number in the 
// sorted list of multiples of two numbers. 
import java.io.*; 
  
public class GFG{ 
      
// Recursive function to return  
// gcd of a and b 
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
  
// Return the Nth number in the sorted 
// list of multiples of two numbers. 
static int nthElement(int a, int b, int n) 
{ 
    // Finding LCM of a and b. 
    int lcm = (a * b) / __gcd(a, b); 
  
    // Binary Search. 
    int l = 1, r = Math.min(a, b) * n; 
    while (l <= r) 
    { 
        // Finding the middle element. 
        int mid = (l + r) >> 1; 
  
        // count of number that are less than 
        // mid and multiples of a and b 
        int val = mid / a + mid / b -  
                  mid / lcm; 
  
        if (val == n) 
            return Math.max((mid / a) * a,  
                            (mid / b) * b); 
  
        if (val < n) 
            l = mid + 1; 
        else
            r = mid - 1; 
    } 
    return 0; 
} 
  
// Driver Code 
static public void main (String[] args) 
{ 
    int a = 5, b = 3, n = 5; 
    System.out.println(nthElement(a, b, n)); 
} 
} 
  
// This code is contributed by vt_m.  

