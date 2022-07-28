

// Java program for the above approach 
class GFG{ 
   
// Function to check whether N is 
// Perfect Square or not 
static boolean isPerfectSquare(int N) 
{ 
   
    // Find sqrt 
    double sr = Math.sqrt(N); 
   
    return (sr - Math.floor(sr)) == 0; 
} 
   
// Function to check whether the given 
// pairs of numbers is Betrothed Numbers 
// or not 
static void BetrothedNumbers(int n, int m) 
{ 
    int Sum1 = 1; 
    int Sum2 = 1; 
   
    // For finding the sum of all the 
    // divisors of first number n 
    for (int i = 2; i <= Math.sqrt(n); i++) { 
        if (n % i == 0) { 
            Sum1 += i 
                    + (isPerfectSquare(n) 
                           ? 0
                           : n / i); 
        } 
    } 
   
    // For finding the sum of all the 
    // divisors of second number m 
    for (int i = 2; i <= Math.sqrt(m); i++) { 
        if (m % i == 0) { 
            Sum2 += i 
                    + (isPerfectSquare(m) 
                           ? 0
                           : m / i); 
        } 
    } 
   
    if ((n + 1 == Sum2) 
        && (m + 1 == Sum1)) { 
        System.out.print("YES" +"\n"); 
    } 
    else { 
        System.out.print("NO" +"\n"); 
    } 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 9504; 
    int M = 20734; 
   
    // Function Call 
    BetrothedNumbers(N, M); 
} 
} 
  
// This code is contributed by 29AjayKumar 

