

// Java program to find the number 
// of interesting primes up to N 
class GFG{ 
   
// Function to check if a number 
// is prime or not 
static boolean isPrime(int n) 
{ 
   
    int flag = 1; 
   
    // If n is divisible by any 
    // number between 2 and Math.sqrt(n), 
    // it is not prime 
    for (int i = 2; i * i <= n; i++) { 
        if (n % i == 0) { 
            flag = 0; 
            break; 
        } 
    } 
   
    return (flag == 1 ? true : false); 
} 
   
// Function to check if a number 
// is perfet square or not 
static boolean isPerfectSquare(int x) 
{ 
    // Find floating point value of 
    // square root of x. 
    double sr = Math.sqrt(x); 
   
    // If square root is an integer 
    return ((sr - Math.floor(sr)) == 0); 
} 
   
// Function to find the number of interesting 
// primes less than equal to N. 
static int countInterestingPrimes(int n) 
{ 
   
    int answer = 0; 
    for (int i = 2; i <= n; i++) { 
   
        // Check whether the number 
        // is prime or not 
        if (isPrime(i)) { 
   
            // Iterate for values of b 
            for (int j = 1; 
                 j * j * j * j <= i; 
                 j++) { 
   
                // Check condition for a 
                if ( 
                    isPerfectSquare( 
                        i - j * j * j * j)) { 
                    answer++; 
                    break; 
                } 
            } 
        } 
    } 
   
    // Return the required answer 
    return answer; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 10; 
   
    System.out.print(countInterestingPrimes(N)); 
} 
} 
  
// This code is contributed by Princi Singh 

