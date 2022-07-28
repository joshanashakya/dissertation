

// Java program to find sum  
// of prime divisors of N 
import java.io.*; 
import java.util.*; 
  
class GFG 
{ 
// Function to check if the 
// number is prime or not. 
static boolean isPrime(int n) 
{ 
    // Corner cases 
    if (n <= 1) 
        return false; 
    if (n <= 3) 
        return true; 
  
    // This is checked so that 
    // we can skip middle five 
    // numbers in below loop 
    if (n % 2 == 0 || n % 3 == 0) 
        return false; 
  
    for (int i = 5;  
             i * i <= n; i = i + 6) 
        if (n % i == 0 ||  
            n % (i + 2) == 0) 
            return false; 
  
    return true; 
} 
  
// function to find  
// sum of prime 
// divisors of N 
static int SumOfPrimeDivisors(int n) 
{ 
    int sum = 0; 
    for (int i = 1; 
             i <= n; i++)  
    { 
        if (n % i == 0) 
        { 
            if (isPrime(i)) 
                sum += i; 
        } 
    } 
    return sum; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 60; 
    System.out.print("Sum of prime divisors of 60 is " +  
                          SumOfPrimeDivisors(n) + "\n"); 
} 
} 

