

// Java program to print 
// all prime points 
import java.io.*; 
  
class GFG  
{ 
// Function to count  
// number of digits 
static int countDigits(int n) 
{ 
    int count = 0; 
    while (n > 0) 
    { 
        count++; 
        n = n / 10; 
    } 
    return count; 
} 
  
// Function to check whether 
// a number is prime or not. 
// Returns 0 if prime else -1 
static int checkPrime(int n) 
{ 
    // Corner cases 
    if (n <= 1) 
        return -1; 
    if (n <= 3) 
        return 0; 
  
    // This is checked so that 
    // we can skip middle five 
    // numbers in below loop 
    if (n % 2 == 0 || n % 3 == 0) 
        return -1; 
  
    for (int i = 5;  
             i * i <= n; i = i + 6) 
        if (n % i == 0 ||  
            n % (i + 2) == 0) 
            return -1; 
  
    return 0; 
} 
  
// Function to print  
// prime points 
static void printPrimePoints(int n) 
{ 
    // counting digits 
    int count = countDigits(n); 
  
    // As single and double  
    // digit numbers do not 
    // have left and right  
    // number pairs 
    if (count == 1 || count == 2) 
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    // Finding all left and right  
    // pairs. Printing the prime  
    // points accordingly. Discarding 
    // first and last index point 
    boolean found = false; 
    for (int i = 1; i < (count - 1); i++) 
    { 
        // Calculating left number 
        int left = n / ((int)Math.pow(10,  
                                  count - i)); 
  
        // Calculating right number 
        int right = n % ((int)Math.pow(10,  
                                   count - i - 1)); 
  
        // Prime point condition 
        if (checkPrime(left) == 0 && 
            checkPrime(right) == 0) 
        { 
                System.out.print(i + " "); 
            found = true; 
        } 
    } 
  
    // No prime point found 
    if (found == false) 
            System.out.print("-1"); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int n = 2317; 
    printPrimePoints(n); 
} 
} 
  
// This code is contributed by ajit 

