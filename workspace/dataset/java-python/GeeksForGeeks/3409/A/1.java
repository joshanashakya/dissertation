

// Java program to count Twin 
// Prime pairs in array 
  
import java.util.*; 
  
class GFG{ 
   
// To store check the prime 
// number 
static boolean []Prime; 
   
// A utility function that find 
// the Prime Numbers till N 
static void computePrime(int N) 
{ 
   
    // Resize the Prime Number 
    Prime = new boolean[N + 1]; 
    Arrays.fill(Prime, true); 
    Prime[0] = Prime[1] = false; 
   
    // Loop till Math.sqrt(N) to find 
    // prime numbers and make their 
    // multiple false in the bool 
    // array Prime 
    for (int i = 2; i * i <= N; i++) { 
        if (Prime[i]) { 
            for (int j = i * i; j < N; j += i) { 
                Prime[j] = false; 
            } 
        } 
    } 
} 
   
// Function that returns the count 
// of Twin Prime Pairs 
static int countTwinPairs(int arr[], int n) 
{ 
   
    // Find the maximum element in 
    // the given array arr[] 
    int maxE = Arrays.stream(arr).max().getAsInt(); 
   
    // Function to calculate the 
    // prime numbers till N 
    computePrime(maxE); 
   
    // To store the count of pairs 
    int count = 0; 
   
    // To store the frequency of 
    // element in the array arr[] 
    int freq[] = new int[maxE + 1]; 
   
    for (int i = 0; i < n; i++) { 
        freq[arr[i]]++; 
    } 
   
    // Sort before traversing the array 
    Arrays.sort(arr); 
   
    // Traverse the array and find 
    // the pairs with Twin Primes 
    for (int i = 0; i < n; i++) { 
   
        // If current element is 
        // Prime, then check for 
        // (current element + 2) 
        if (Prime[arr[i]]) { 
            if (arr[i] + 2 < freq.length && freq[arr[i] + 2] > 0
                && Prime[arr[i] + 2]) { 
                count++; 
            } 
        } 
    } 
   
    // Return the count of pairs 
    return count; 
} 
   
// Driver's code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 4, 3, 5, 7 }; 
    int n = arr.length; 
   
    // Function call to find 
    // Twin Primes pair 
    System.out.print(countTwinPairs(arr, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

