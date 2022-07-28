

// Java program to find numbers with exactly n distinct 
// prime factor numbers from a to b 
import java.util.*; 
  
class GFG 
{ 
      
// Stores all primes less than and  
// equals to sqrt(10^8) = 10000 
static ArrayList<Integer> primes = new ArrayList<Integer>(); 
  
// Generate all prime numbers less  
// than or equals to sqrt(10^8) 
// = 10000 using sieve of sundaram 
static void segmentedSieve() 
{ 
    int n = 10000; // Square root of 10^8 
  
    // In general Sieve of Sundaram,  
    // produces primes smaller 
    // than (2*x + 2) for a number  
    // given number x. Since we want  
    // primes smaller than n=10^4,  
    // we reduce n to half 
    int nNew = (n - 2)/2; 
  
    // This array is used to separate  
    // numbers of the form i+j+2ij  
    // from others where 1 <= i <= j 
    boolean[] marked=new boolean[nNew + 1]; 
  
    // Main logic of Sundaram. Mark all  
    // numbers of the form i + j + 2ij 
    // as true where 1 <= i <= j 
    for (int i = 1; i <= nNew; i++) 
        for (int j = i; (i + j + 2 * i * j) <= nNew; j++) 
            marked[i + j + 2 * i * j] = true; 
  
    // Since 2 is a prime number 
    primes.add(2); 
  
    // Remaining primes are of the form 2*i + 1 such that 
    // marked[i] is false. 
    for (int i = 1; i <= nNew; i++) 
        if (marked[i] == false) 
            primes.add(2 * i + 1); 
} 
  
// Function to count all numbers from a to b having exactly 
// n prime factors 
static int Nfactors(int a, int b, int n) 
{ 
    segmentedSieve(); 
  
    // result --> all numbers between a and b having 
    // exactly n prime factors 
    int result = 0; 
  
    // check for each number 
    for (int i = a; i <= b; i++) 
    { 
        // tmp --> stores square root of current number because 
        //     all prime factors are always less than and 
        //     equal to square root of given number 
        // copy --> it holds the copy of current number 
        int tmp = (int)Math.sqrt(i), copy = i; 
  
        // count --> it counts the number of distinct prime 
        // factors of number 
        int count = 0; 
  
        // check divisibility of 'copy' with each prime less 
        // than 'tmp' and divide it until it is divisible by 
        // current prime factor 
        for (int j = 0; primes.get(j) <= tmp; j++) 
        { 
            if (copy % primes.get(j) == 0) 
            { 
                // increment count for distinct prime 
                count++; 
                while (copy % primes.get(j) == 0) 
                    copy = copy/primes.get(j); 
            } 
        } 
  
        // if number is completely divisible then at last 
        // 'copy' will be 1 else 'copy' will be prime, so 
        // increment count by one 
        if (copy != 1) 
            count++; 
  
        // if number has exactly n distinct primes then 
        // increment result by one 
        if (count == n) 
            result++; 
    } 
    return result; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a = 1, b = 100, n = 3; 
    System.out.println(Nfactors(a, b, n)); 
} 
} 
  
// This code is contributed by chandan_jnu 

