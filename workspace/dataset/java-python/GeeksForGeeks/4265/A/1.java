

// Java program to find minimum number to 
// insert in array so their sum is prime 
  
class GFG 
{ 
static int MAX = 100005; 
  
// Array to store primes 
static boolean[] isPrime = new boolean[MAX]; 
  
// function to calculate primes  
// using sieve of eratosthenes 
static void sieveOfEratostheneses() 
{ 
    isPrime[1] = true; 
    for (int i = 2; i * i < MAX; i++)  
    { 
        if (!isPrime[i])  
        { 
            for (int j = 2 * i; j < MAX; j += i) 
                isPrime[j] = true; 
        } 
    } 
} 
  
// Find prime number greater  
// than a number 
static int findPrime(int n) 
{ 
    int num = n + 1; 
  
    // To return prime number 
    // greater than n 
    while (num > 0)  
    { 
        // check if num is prime 
        if (!isPrime[num]) 
            return num; 
  
        // increment num 
        num = num + 1; 
    } 
    return 0; 
} 
  
// To find number to be added  
// so sum of array is prime 
static int minNumber(int arr[], int n) 
{ 
    // call sieveOfEratostheneses 
    // to calculate primes 
    sieveOfEratostheneses(); 
  
    int sum = 0; 
  
    // To find sum of array elements 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
  
    if (!isPrime[sum]) 
        return 0; 
  
    // To find prime number 
    // greater then sum 
    int num = findPrime(sum); 
  
    // Return difference of  
    // sum and num 
    return num - sum; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 4, 6, 8, 12 }; 
    int n = arr.length; 
  
    System.out.println(minNumber(arr, n)); 
} 
} 
  
// This code is contributed by mits 

