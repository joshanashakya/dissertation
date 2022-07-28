

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static class pair 
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
} 
  
// Sieve of prime numbers 
static void primesieve(boolean []prime) 
{ 
    // Sieve to store whether a 
    // number is prime or not in 
    // O(nlog(log(n))) 
    prime[1] = false; 
  
    for (int p = 2; p * p <= 650; p++) 
    { 
        if (prime[p] == true) 
        { 
            for (int i = p * 2; i <= 650; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to return sum of digit 
// and sum of square of digit 
static pair sum_sqsum(int n) 
{ 
    int sum = 0; 
    int sqsum = 0; 
    int x; 
  
    // Until number is not 
    // zero 
    while (n > 0) 
    { 
        x = n % 10; 
        sum += x; 
        sqsum += x * x; 
        n /= 10; 
    } 
    return (new pair(sum, sqsum)); 
} 
  
// Function to return the count 
// of number form L to R 
// whose sum of digits and 
// sum of square of digits 
// are prime 
static int countnumber(int L, int R) 
{ 
    boolean []prime = new boolean[651]; 
  
    Arrays.fill(prime, true); 
    primesieve(prime); 
  
    int cnt = 0; 
  
    // Iterate for each value 
    // in the range of L to R 
    for (int i = L; i <= R; i++)  
    { 
  
        // digit.first stores sum of digits 
        // digit.second stores sum of 
        // square of digit 
        pair digit = sum_sqsum(i); 
  
        // If sum of digits and sum of 
        // square of digit both are 
        // prime then increment the count 
        if (prime[digit.first] &&  
            prime[digit.second])  
        { 
            cnt += 1; 
        } 
    } 
    return cnt; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int L = 10; 
    int R = 20; 
  
    System.out.println(countnumber(L, R)); 
} 
}  
  
// This code is contributed by PrinciRaj1992 

