

// Java implementation of the approach 
class GFG 
{ 
      
static int MAXN = 1000001; 
  
// Stores smallest prime factor for every number 
static int[] spf = new int[MAXN]; 
  
// Hash to store prime factors count 
static int[] hash1 = new int[MAXN]; 
  
// Function to calculate SPF (Smallest Prime Factor) 
// for every number till MAXN 
static void sieve() 
{ 
    spf[1] = 1; 
    for (int i = 2; i < MAXN; i++) 
  
        // Marking smallest prime factor for every 
        // number to be itself 
        spf[i] = i; 
  
    // Separately marking spf for every even 
    // number as 2 
    for (int i = 4; i < MAXN; i += 2) 
        spf[i] = 2; 
  
    // Checking if i is prime 
    for (int i = 3; i * i < MAXN; i++)  
    { 
  
        // Marking SPF for all numbers divisible by i 
        if (spf[i] == i)  
        { 
            for (int j = i * i; j < MAXN; j += i) 
  
                // Marking spf[j] if it is not 
                // previously marked 
                if (spf[j] == j) 
                    spf[j] = i; 
        } 
    } 
} 
  
// Function to store the prime factors after dividing 
// by the smallest prime factor at every step 
static void getFactorization(int x) 
{ 
    int temp; 
    while (x != 1)  
    { 
        temp = spf[x]; 
        if (x % temp == 0)  
        { 
  
            // Storing the count of 
            // prime factors in hash 
            hash1[spf[x]]++; 
            x = x / spf[x]; 
        } 
        while (x % temp == 0) 
            x = x / temp; 
    } 
} 
  
// Function that returns true if there are 
// no common prime factors between x 
// and other numbers of the array 
static boolean check(int x) 
{ 
    int temp; 
    while (x != 1)  
    { 
        temp = spf[x]; 
  
        // Checking whether it common 
        // prime factor with other numbers 
        if (x % temp == 0 && hash1[temp] > 1) 
            return false; 
        while (x % temp == 0) 
            x = x / temp; 
    } 
    return true; 
} 
  
// Function that returns true if there is 
// an element in the array which is coprime 
// with all the other elements of the array 
static boolean hasValidNum(int []arr, int n) 
{ 
  
    // Using sieve for generating prime factors 
    sieve(); 
  
    for (int i = 0; i < n; i++) 
        getFactorization(arr[i]); 
  
    // Checking the common prime factors 
    // with other numbers 
    for (int i = 0; i < n; i++) 
        if (check(arr[i])) 
            return true; 
  
    return false; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
  
    int []arr = { 2, 8, 4, 10, 6, 7 }; 
    int n = arr.length; 
  
    if (hasValidNum(arr, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by chandan_jnu 

