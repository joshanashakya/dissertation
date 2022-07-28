

// Java Program to find three integers 
// less than N whose LCM is maximum 
  
import java.io.*; 
  
class GFG { 
   // Recursive function to return gcd of a and b  
static int __gcd(int a, int b)  
{  
    // Everything divides 0   
    if (a == 0)  
       return b;  
    if (b == 0)  
       return a;  
     
    // base case  
    if (a == b)  
        return a;  
     
    // a is greater  
    if (a > b)  
        return __gcd(a-b, b);  
    return __gcd(a, b-a);  
}  
  
// function to find three integers 
// less than N whose LCM is maximum 
static void MaxLCM(int n) 
{ 
    // if n is odd 
    if (n % 2 != 0) 
        System.out.print(n + " " + (n - 1) + " " + (n - 2)); 
  
    // if n is even and n, n-3 gcd is 1 
    else if (__gcd(n, (n - 3)) == 1) 
        System.out.print( n + " " +(n - 1)+ " " + (n - 3)); 
  
    else
        System.out.print((n - 1) + " " + (n - 2) + " " + (n - 3)); 
} 
  
// Driver code 
public static void main (String[] args) { 
    int n = 12; 
  
    // function call 
    MaxLCM(n); 
    } 
} 
// This code is contributed by anuj_67.. 

