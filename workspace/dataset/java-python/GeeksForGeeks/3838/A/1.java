

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
      
static int mod = 1000000007; 
static int N = 1000005; 
  
// To store least prime factors 
// of all the numbers 
static int lpf[] = new int[N]; 
  
// Function to find the least prime 
// factor of all the numbers 
static void least_prime_factor() 
{ 
    for (int i = 1; i < N; i++) 
        lpf[i] = i; 
  
    for (int i = 2; i < N; i++) 
        if (lpf[i] == i) 
            for (int j = i * 2; j < N; j += i) 
                if (lpf[j] == j) 
                    lpf[j] = i; 
} 
  
// Function to return the ((a^m1) % mod) 
static long power(long a, long m1) 
{ 
    if (m1 == 0) 
        return 1; 
    else if (m1 == 1) 
        return a; 
    else if (m1 == 2) 
        return (1l * a * a) % mod; 
    else if ((m1 & 1) != 0) 
        return (1l * a * power(power(a, m1 / 2), 2)) % mod; 
    else
        return power(power(a, m1 / 2), 2) % mod; 
} 
  
// Function to return the sum of 
// elements of array B 
static long sum_of_elements(long a[], int n) 
{ 
    // Find the prime factors of 
    // all the numbers 
    least_prime_factor(); 
  
    // To store each prime count in lcm 
    HashMap<Long, Long> prime_factor  
            = new HashMap<>(); 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // Current number 
        long temp = a[i]; 
  
        // Map to store the prime count 
        // of a single number 
        HashMap<Long, Long> single_number 
            = new HashMap<>(); 
  
        // Basic way to calculate all prime factors 
        while (temp > 1)  
        { 
            long x = lpf[(int)temp]; 
            single_number.put(x,(single_number.get(x) ==  
                        null ? 1:single_number.get(x) + 1)); 
            temp /= x; 
        } 
  
        // If it is the first number in the array 
        if (i == 0) 
            prime_factor = single_number; 
  
        // Take the maximum count of  
        // prime in a number 
        else { 
            for (Map.Entry<Long,Long> x : single_number.entrySet() ) 
                prime_factor.put(x.getKey(), Math.max(x.getValue(),  
                                (prime_factor.get(x.getKey()) ==  
                                null ? 0:prime_factor.get(x.getKey())))); 
        } 
    } 
  
    long ans = 0, lcm = 1; 
  
    // Calculate lcm of given array 
    for (Map.Entry<Long,Long> x : prime_factor.entrySet()) 
        lcm = (lcm * power(x.getKey(), x.getValue())) % mod; 
  
    // Calculate sum of elements of array B 
    for (int i = 0; i < n; i++) 
        ans = (ans + (lcm * power(a[i],  
                    mod - 2)) % mod) % mod; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    long a[] = { 2, 3, 4 }; 
    int n = a.length; 
  
    System.out.println(sum_of_elements(a, n)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

