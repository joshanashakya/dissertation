

// Java  program to do Primality test  
// for the sum of digits at  
// odd places of a number  
  
import java.io.*; 
  
class GFG { 
    // Function that return sum  
// of the digits at odd places  
static int sum_odd(int n)  
{  
    int sum = 0, pos = 1;  
    while (n>0) {  
        if (pos % 2 == 1)  
            sum += n % 10;  
        n = n / 10;  
        pos++;  
    }  
    return sum;  
}  
  
// Function that returns true  
// if the number is prime  
// else false  
static boolean check_prime(int n)  
{  
    // Corner cases  
    if (n <= 1)  
        return false;  
    if (n <= 3)  
        return true;  
  
    // This condition is checked so that  
    // we can skip middle five  
    // numbers in the below loop  
    if (n % 2 == 0 || n % 3 == 0)  
        return false;  
  
    for (int i = 5; i * i <= n; i = i + 6)  
        if (n % i == 0 || n % (i + 2) == 0)  
            return false;  
  
    return true;  
}  
  
// Driver code  
    public static void main (String[] args) { 
      
    int n = 223;  
    // Get the sum of the  
    // digits at odd places  
    int sum = sum_odd(n);  
    if (check_prime(sum))  
        System.out.println ("YES" );  
    else
        System.out.println("NO");  
    } 
} 

