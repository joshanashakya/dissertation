

// Java implementation of the approach 
class GFG 
{ 
static int sz = (int) 1e5; 
static boolean []isPrime = new boolean[sz + 1]; 
  
// Function for Sieve of Eratosthenes 
static void sieve() 
{ 
    for (int i = 0; i < sz + 1; i++) 
        isPrime[i] = true; 
      
    isPrime[0] = isPrime[1] = false; 
  
    for (int i = 2; i * i <= sz; i++)  
    { 
        if (isPrime[i])  
        { 
            for (int j = i * i; j < sz; j += i)  
            { 
                isPrime[j] = false; 
            } 
        } 
    } 
} 
  
// Function to print the elements of the array 
static void printArray(int arr[], int len) 
{ 
    for (int i = 0; i < len; i++)  
    { 
        System.out.print(arr[i] + " "); 
    } 
} 
  
// Function to remove all the prime numbers 
static void removePrimes(int arr[], int len) 
{ 
    // Generate primes 
    sieve(); 
  
    // Traverse the array 
    for (int i = 0; i < len; i++)  
    { 
  
        // If the current element is prime 
        if (isPrime[arr[i]])  
        { 
  
            // Shift all the elements on the 
            // right of it to the left 
            for (int j = i; j < len-1; j++) 
            { 
                arr[j] = arr[j + 1]; 
            } 
  
            // Decrease the loop counter by 1 
            // to check the shifted element 
            i--; 
  
            // Decrease the length 
            len--; 
        } 
    } 
  
    // Print the updated array 
    printArray(arr, len); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 4, 6, 5, 3, 8, 7, 
                  10, 11, 14, 15 }; 
    int len = arr.length; 
  
    removePrimes(arr, len); 
} 
} 
   
// This code is contributed by PrinciRaj1992 

