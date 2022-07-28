

// Java program to find two numbers  
// whose sum and GCD is given  
import java.util.*; 
class Solution{ 
  
//function to find gcd of two numbers 
static int __gcd(int a,int b) 
{ 
    if (b==0) return a; 
   return __gcd(b,a%b); 
} 
      
// Function to find two numbers  
// whose sum and gcd is given  
static void findTwoNumbers(int sum, int gcd)  
{  
    // sum != gcd checks that both the  
    // numbers are positive or not  
    if (__gcd(gcd, sum - gcd) == gcd && sum != gcd)  
        System.out.println(  "a = " + Math.min(gcd, sum - gcd)  
            + ", b = " + (int)(sum - Math.min(gcd, sum - gcd)) );  
    else
        System.out.println( -1 );  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int sum = 8;  
    int gcd = 2;  
  
    findTwoNumbers(sum, gcd);  
  
}  
  
  
} 
//contributed by Arnab Kundu 

