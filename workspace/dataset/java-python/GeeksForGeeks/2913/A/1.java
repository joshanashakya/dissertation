

// Java program to find single digit  
// sum of a^n.  
  
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
      
      
// This function finds single digit  
// sum of n.  
static int digSum(int n)  
{  
    if (n == 0)  
    return 0;  
    return (n % 9 == 0) ? 9 : (n % 9);  
}  
  
// Returns single digit sum of a^n.  
// We use modular exponentiation technique.  
static int powerDigitSum(int a, int n)  
{  
    int res = 1;  
    while (n>0) {  
        if (n % 2 == 1) {  
            res = res * digSum(a);  
            res = digSum(res);  
        }  
        a = digSum(digSum(a) * digSum(a));  
        n /= 2;  
    }  
  
    return res;  
}  
  
// Driver code 
public static void main(String args[])  
{  
    int a = 9, n = 4;  
    System.out.print(powerDigitSum(a, n));  
} 
}  

