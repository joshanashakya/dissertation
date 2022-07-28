

// Java implementation of above approach 
// Returns sum of digits of x 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
static int sumOfDigitsSingle(int x) 
{ 
    int ans = 0; 
    while (x != 0) 
    { 
        ans += x % 10; 
        x /= 10; 
    } 
    return ans; 
} 
  
// Returns closest number to x  
// in terms of 9's. 
static int closest(int x) 
{ 
    int ans = 0; 
    while (ans * 10 + 9 <= x) 
        ans = ans * 10 + 9; 
  
    return ans; 
} 
  
static int sumOfDigitsTwoParts(int N) 
{ 
    int A = closest(N); 
    return sumOfDigitsSingle(A) +  
           sumOfDigitsSingle(N - A); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int N = 35; 
    System.out.print(sumOfDigitsTwoParts(N)); 
} 
} 
  
// This code is contributed by 
// Subhadeep Gupta 

