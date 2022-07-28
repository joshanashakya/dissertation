

// Java program for the above approach 
class GFG{ 
  
// Function to check if n is prime 
static boolean isPrime(int n) 
{ 
    for (int i = 2; i * i <= n; i++) { 
        if (n % i == 0) { 
            return false; 
        } 
    } 
    return true; 
} 
  
// Function to count the minimum 
// prime required for given sum N 
static void printMinCountPrime(int N) 
{ 
  
    int minCount; 
  
    // Case 1: 
    if (isPrime(N)) { 
        minCount = 1; 
    } 
  
    // Case 2: 
    else if (N % 2 == 0) { 
        minCount = 2; 
    } 
  
    // Case 3: 
    else { 
  
        // Case 3a: 
        if (isPrime(N - 2)) { 
            minCount = 2; 
        } 
  
        // Case 3b: 
        else { 
            minCount = 3; 
        } 
    } 
  
    System.out.print(minCount +"\n"); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 100; 
  
    // Function Call 
    printMinCountPrime(N); 
} 
} 
  
// This code is contributed by 29AjayKumar 

