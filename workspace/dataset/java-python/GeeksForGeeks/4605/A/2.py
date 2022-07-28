

# Python program to find the count of 
# Fibonacci pairs (x, y) which 
# satisfy the equation Ax+By=N 
import math 
size = 101
  
# Array to store the Fibonacci numbers 
fib = [0]*100010
  
# Array to store the number of ordered pairs 
freq = [0]*(100010) 
  
# Function to find if a number 
# is a perfect square 
def isPerfectSquare(x): 
    s = int(math.sqrt(x)) 
      
    return (s * s) == x 
  
# Function that returns 1 
# if N is non-fibonacci number else 0 
def isFibonacci(n): 
      
    # N is Fibinacci if one of 
    # 5*n*n + 4 or 5*n*n - 4 or both 
    # are perferct square 
    if (isPerfectSquare(5 * n * n + 4) or isPerfectSquare(5 * n * n - 4)): 
        return 1; 
    return 0; 
  
# Function to store the fibonacci numbers 
# and their frequency in form a * x + b * y 
def compute( a, b): 
  
    # Storing the Fibonacci numbers 
    for i in range(1, 100010): 
        fib[i] = isFibonacci(i) 
  
    # For loop to find all the possible 
    # combinations of the Fibonacci numbers 
    for x in range(1, 100010): 
        for y in range(1, size): 
  
            # Finding the number of ordered pairs 
            if (fib[x] == 1 and fib[y] == 1 and a * x + b * y < 100010):  
                freq[a * x + b * y] += 1
              
# Driver code 
  
Q = 2
A = 5
B = 10
compute(A, B); 
arr = [ 50, 150 ] 
  
# Find the ordered pair for every query 
for i in range(Q): 
        print(freq[arr[i]], end=" ") 
          
# This code is contributed by ANKITKUMAR34 

