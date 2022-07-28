

// Java implementation of above approach 
import java.io.*; 
  
class GFG { 
      
static int MAX = 1000000; 
  
// the sieve of prime number and 
// count of minimum prime factor 
static int sieve_Prime[] = new int[MAX + 4]; 
static int sieve_count[] =  new int[MAX + 4]; 
  
// form the prime sieve 
static void form_sieve() 
{ 
    // 1 is not a prime number 
    sieve_Prime[1] = 1; 
  
    // form the sieve 
    for (int i = 2; i <= MAX; i++) { 
  
        // if i is prime 
        if (sieve_Prime[i] == 0) { 
            for (int j = i * 2; j <= MAX; j += i) { 
  
                // if i is the least prime factor 
                if (sieve_Prime[j] == 0) { 
  
                    // mark the number j as non prime 
                    sieve_Prime[j] = 1; 
  
                    // count the numbers whose least prime factor is i 
                    sieve_count[i]++; 
                } 
            } 
        } 
    } 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
        // form the sieve 
    form_sieve(); 
  
    int n = 2; 
  
    // display 
    System.out.println( "Count = " + (sieve_count[n] + 1)); 
  
    n = 3; 
  
    // display 
    System.out.println ("Count = "  +(sieve_count[n] + 1)); 
    } 
} 
// This code was contributed 
// by inder_mca 

