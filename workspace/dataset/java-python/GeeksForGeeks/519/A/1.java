

// Java program to find sum of n and 
// it's largest prime factor 
import java.io.*; 
  
class GFG 
{ 
  
// Function to return the sum of n 
// and it's largest prime factor 
static int maxPrimeFactors(int n) 
{ 
int num = n; 
  
// Initialise maxPrime to -1. 
int maxPrime = -1; 
  
while (n % 2 == 0) 
{ 
maxPrime = 2; 
n /= 2; 
} 
  
// n must be odd at this point, 
// thus skip the even numbers and 
// iterate only odd numbers 
for (int i = 3; i <= Math.sqrt(n); i += 2) { 
      
    while (n % i == 0) {  
        maxPrime = i; n = n / i; 
        }  
      
}  
        // This condition is to handle the case  
        // when n is a prime number greater than 2  
        if (n > 2) { 
            maxPrime = n; 
        } 
// finally return the sum. 
int sum = maxPrime + num; 
return sum; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
int n = 19; 
  
System.out.println(maxPrimeFactors(n)); 
} 
} 
// This code is contributed by anuj_67 

