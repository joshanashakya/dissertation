

// Java program to find the count of 
// Fibonacci pairs (x, y) which 
// satisfy the equation Ax+By=N 
class GFG{ 
      
static final int size = 10001; 
  
// Array to store the Fibonacci numbers 
static long []fib = new long[100010]; 
   
// Array to store the number of ordered pairs 
static int []freq = new int[100010]; 
   
// Function to find if a number 
// is a perfect square 
static boolean isPerfectSquare(int x) 
{ 
    int s = (int) Math.sqrt(x); 
    return (s * s == x); 
} 
   
// Function that returns 1 
// if N is non-fibonacci number else 0 
static int isFibonacci(int n) 
{ 
    // N is Fibinacci if one of 
    // 5*n*n + 4 or 5*n*n - 4 or both 
    // are perferct square 
    if (isPerfectSquare(5 * n * n + 4) 
        || isPerfectSquare(5 * n * n - 4)) 
        return 1; 
    return 0; 
} 
   
// Function to store the fibonacci numbers 
// and their frequency in form a * x + b * y 
static void compute(int a, int b) 
{ 
    // Storing the Fibonacci numbers 
    for (int i = 1; i < 100010; i++) { 
        fib[i] = isFibonacci(i); 
    } 
   
    // For loop to find all the possible 
    // combinations of the Fibonacci numbers 
    for (int x = 1; x < 100010; x++) { 
        for (int y = 1; y < size; y++) { 
   
            // Finding the number of ordered pairs 
            if (fib[x] == 1 && fib[y] == 1
                && a * x + b * y < 100010) { 
                freq[a * x + b * y]++; 
            } 
        } 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int Q = 2, A = 5, B = 10; 
    compute(A, B); 
    int arr[] = { 50, 150 }; 
   
    // Find the ordered pair for every query 
    for (int i = 0; i < Q; i++) { 
        System.out.print(freq[arr[i]]+ " "); 
    } 
} 
} 
  
// This code is contributed by PrinciRaj1992 

