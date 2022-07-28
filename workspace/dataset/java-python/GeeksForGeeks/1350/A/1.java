

//Java implementation of above approach  
  
import java.io.*; 
  
class GFG { 
      
// Function to calculate gcd of two numbers  
static int gcd(int a, int b)  
{  
    if (a == 0)  
        return b;  
    return gcd(b % a, a);  
}  
  
// Function to calculate all common divisors  
// of two given numbers  
// a, b --> input integer numbers  
static int sumcommDiv(int a, int b)  
{  
    // find gcd of a, b  
    int n = gcd(a, b);  
  
    // Find the sum of divisors of n.  
    int sum = 0;  
    for (int i = 1; i <= Math.sqrt(n); i++) {  
  
        // if 'i' is factor of n  
        if (n % i == 0) {  
  
            // check if divisors are equal  
            if (n / i == i)  
                sum += i;  
            else
                sum += (n / i) + i;  
        }  
    }  
  
    return sum;  
}  
  
// Driver program to run the case  
    public static void main (String[] args) { 
      
    int a = 10, b = 15;  
    System.out.println("Sum = " + sumcommDiv(a, b));  
    } 
} 

