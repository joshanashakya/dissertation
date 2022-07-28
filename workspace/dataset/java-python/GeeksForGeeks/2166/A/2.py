

# Python3 implementation of the above approach  
MAXN = 100000
MOD = 1000000007
  
# Initialize an array to store 
# factorial values  
fact = [0] * MAXN;  
  
# Function to calculate and store X! values  
def factorial() : 
    fact[0] = 1
    for i in range(1, MAXN) : 
        fact[i] = (fact[i - 1] * i) % MOD 
  
# Iterative Function to calculate 
# (x^y)%p in O(log y)  
def power(x, y, p) :  
  
    res = 1 # Initialize result  
  
    x = x % p # Update x if it is more than   
              # or equal to p  
  
    while (y > 0) : 
          
        # If y is odd, multiply x with result  
        if (y & 1) : 
            res = (res * x) % p  
  
        # y must be even now  
        y = y >> 1; # y = y/2  
        x = (x * x) % p 
      
    return res 
  
# Function that return modular  
# inverse of x under modulo p  
def modInverse(x, p) :  
    return power(x, p - 2, p)  
  
# Function that returns the count of  
# different number possible by using  
# all the digits its frequency times  
def countDifferentNumbers(arr, P) :  
  
    # Preprocess factorial values  
    factorial();  
  
    # Initialize the result and sum  
    # of aint the frequencies  
    res = 0; X = 0;  
  
    # Calculate the sum of frequencies  
    for i in range(10) : 
        X += arr[i]  
  
    # Putting res equal to x!  
    res = fact[X]  
  
    # Multiplying res with modular  
    # inverse of X0!, X1!, .., X9!  
    for i in range(10) : 
        if (arr[i] > 1) : 
            res = (res * modInverse(fact[arr[i]], P)) % P;  
  
    return res;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    arr = [1, 0, 2, 0, 0, 7, 4, 0, 0, 3 ] 
    print(countDifferentNumbers(arr, MOD))  
      
# This code is contributed by Ryuga 

