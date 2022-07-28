

// Java program to find if number N is divisible by a 
// number that contains only a and b as it's digits 
  
import java.util.*; 
class solution 
{ 
  
// Function to check whether n is divisible  
// by a number whose digits are either a or b 
static boolean isDivisibleRec(int x, int a, int b, int n) 
{ 
    // base condition 
    if (x > n) 
        return false; 
  
    if (n % x == 0) 
        return true; 
  
    // recursive call 
    return (isDivisibleRec(x * 10 + a, a, b, n)  
            || isDivisibleRec(x * 10 + b, a, b, n)); 
} 
  
static boolean isDivisible(int a, int b, int n) 
{ 
// Check for all numbers beginning with 'a' or 'b' 
return isDivisibleRec(a, a, b, n)  
        ||isDivisibleRec(b, a, b, n); 
} 
  
// Driver program 
public static void main(String args[]) 
{ 
    int a = 3, b = 5, n = 53; 
  
    if (isDivisible(a, b, n)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
  
} 
  
} 
//contributed by Arnab Kundu 

