

// Java program to implement 
// the above approach 
  
class GFG  
{ 
  
// Function to get the prime factors 
// and its count of times it divides 
static void primeFactors(int n, int freq[]) 
{ 
  
    int cnt = 0; 
  
    // Count the number of 2s that divide n 
    while (n % 2 == 0)  
    { 
        cnt++; 
        n = n / 2; 
    } 
  
    freq[2] = cnt; 
  
    // n must be odd at this point. So we can skip 
    // one element (Note i = i +2) 
    for (int i = 3; i <= Math.sqrt(n); i = i + 2) 
    { 
        cnt = 0; 
  
        // While i divides n, count i and divide n 
        while (n % i == 0) 
        { 
            cnt++; 
            n = n / i; 
        } 
  
        freq[i] = cnt; 
    } 
  
    // This condition is to handle the case when n 
    // is a prime number greater than 2 
    if (n > 2) 
        freq[n] = 1; 
} 
  
// Function to return the highest power 
static int getMaximumPower(int n, int m) 
{ 
  
    // Initialize two arrays 
    int freq1[] = new int[n + 1], freq2[] = new int[m + 1]; 
  
    // Get the prime factors of n and m 
    primeFactors(n, freq1); 
    primeFactors(m, freq2); 
  
    int maxi = 0; 
  
    // Iterate and find the maximum power 
    for (int i = 2; i <= m; i++) 
    { 
  
        // If i not a prime factor of n and m 
        if (freq1[i] == 0 && freq2[i] == 0) 
            continue; 
  
        // If i is a prime factor of n and m 
        // If count of i dividing m is more 
        // than i dividing n, then power will be 0 
        if (freq2[i] > freq1[i]) 
            return 0; 
  
        // If i is a prime factor of M 
        if (freq2[i] != 0)  
        { 
  
            // get the maximum power 
            maxi = Math.max(maxi, freq1[i] / freq2[i]); 
        } 
    } 
  
    return maxi; 
} 
  
// Drivers code 
public static void main(String[] args)  
{ 
    int n = 48, m = 4; 
    System.out.println(getMaximumPower(n, m)); 
  
} 
} 
  
// This code contributed by Rajput-Ji 

