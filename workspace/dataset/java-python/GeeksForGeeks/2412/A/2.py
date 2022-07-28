

# Python3 Program to find even indexed  
# Fibonacci Sum in O(Log n) time. 
MAX = 1000; 
  
# Create an array for memoization 
f = [0] * MAX; 
  
# Returns n'th Fibonacci number 
# using table f[] 
def fib(n): 
      
    # Base cases 
    if (n == 0): 
        return 0; 
    if (n == 1 or n == 2): 
        f[n] = 1; 
        return f[n]; 
  
    # If fib(n) is already computed 
    if (f[n]): 
        return f[n]; 
  
    k = (n + 1) // 2 if (n % 2 == 1) else n // 2; 
  
    # Applying above formula [Note value n&1 is 1 
    # if n is odd, else 0]. 
    f[n] = (fib(k) * fib(k) + fib(k - 1) * fib(k - 1)) \ 
    if (n % 2 == 1) else (2 * fib(k - 1) + fib(k)) * fib(k); 
  
    return f[n]; 
  
# Computes value of even-indexed Fibonacci Sum 
def calculateEvenSum(n): 
    return (fib(2 * n + 1) - 1); 
  
# Driver Code 
if __name__ == '__main__': 
      
    # Get n 
    n = 8; 
  
    # Find the alternating sum 
    print("Even indexed Fibonacci Sum upto",  
          n, "terms:", calculateEvenSum(n)); 
  
# This code is contributed by PrinciRaj1992 

