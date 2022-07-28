

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
  
static class primeFactorization  
{ 
  
    // to store the prime factor 
    // and its highest power 
    int countOfPf, primeFactor; 
  
    public primeFactorization(int countOfPf,  
                              int primeFactor) 
    { 
        this.countOfPf = countOfPf; 
        this.primeFactor = primeFactor; 
    } 
} 
  
// Recursive function to generate all the 
// divisors from the prime factors 
static void generateDivisors(int curIndex, int curDivisor, 
                           Vector<primeFactorization> arr) 
{ 
  
    // Base case i.e. we do not have more 
    // primeFactors to include 
    if (curIndex == arr.size())  
    { 
        System.out.print(curDivisor + " "); 
        return; 
    } 
  
    for (int i = 0; i <= arr.get(curIndex).countOfPf; ++i) 
    { 
        generateDivisors(curIndex + 1, curDivisor, arr); 
        curDivisor *= arr.get(curIndex).primeFactor; 
    } 
} 
  
// Function to find the divisors of n 
static void findDivisors(int n) 
{ 
  
    // To store the prime factors along 
    // with their highest power 
    Vector<primeFactorization> arr = new Vector<>(); 
  
    // Finding prime factorization of n 
    for (int i = 2; i * i <= n; ++i) 
    { 
        if (n % i == 0) 
        { 
            int count = 0; 
            while (n % i == 0)  
            { 
                n /= i; 
                count += 1; 
            } 
  
            // For every prime factor we are storing 
            // count of it's occurenceand itself. 
            arr.add(new primeFactorization(count, i )); 
        } 
    } 
  
    // If n is prime 
    if (n > 1) 
    { 
        arr.add(new primeFactorization( 1, n )); 
    } 
  
    int curIndex = 0, curDivisor = 1; 
  
    // Generate all the divisors 
    generateDivisors(curIndex, curDivisor, arr); 
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int n = 6; 
  
    findDivisors(n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

