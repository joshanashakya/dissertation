

// Java Program to find number  
// of Divisors which on integer  
// division produce quotient  
// having less set bit than divisor 
import java .io.*; 
  
class GFG  
{ 
  
// Return the count of set bit. 
static int bit(int x) 
{ 
    int ans = 0; 
    while (x > 0) 
    { 
        x /= 2; 
        ans++; 
    } 
  
    return ans; 
} 
  
// check if q and d have  
// same number of set bit. 
static boolean check(int d, int x) 
{ 
    if (bit(x / d) <= bit(d)) 
        return true; 
  
    return false; 
} 
  
// Binary Search to find  
// the point at which 
// number of set in q is  
// less than or equal to d. 
static int bs(int n) 
{ 
    int l = 1, r = (int)Math.sqrt(n); 
  
    // while left index is  
    // less than right index 
    while (l < r)  
    { 
        // finding the middle. 
        int m = (l + r) / 2; 
  
    // check if q and d have 
    // same number of 
    // set it or not. 
        if (check(m, n)) 
            r = m; 
        else
            l = m + 1; 
    } 
  
    if (!check(l, n)) 
        return l + 1; 
  
    else
        return l; 
} 
  
static int countDivisor(int n) 
{ 
    return n - bs(n) + 1; 
} 
  
    // Driver Code 
    static public void main (String[] args) 
    { 
        int n = 5; 
        System.out.println(countDivisor(n)); 
    } 
} 
  
// This code is contributed by anuj_67. 

