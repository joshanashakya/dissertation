

# Python3 program to find the minimum 
# positive X such that the given 
# equation holds true 
import sys 
  
# This function gives the required 
# answer 
def minimumX(n, k): 
  
    mini = sys.maxsize 
  
    # Iterate for all the factors 
    i = 1
    while i * i <= n : 
  
        # Check if i is a factor 
        if (n % i == 0) : 
            fir = i 
            sec = n // i 
            num1 = fir * k + sec 
  
            # Consider i to be A and n/i to be B 
            res = (num1 // k) * (num1 % k) 
            if (res == n): 
                mini = min(num1, mini) 
  
            num2 = sec * k + fir 
            res = (num2 // k) * (num2 % k) 
  
            # Consider i to be B and n/i to be A 
            if (res == n): 
                mini = min(num2, mini) 
  
        i += 1
  
    return mini 
  
# Driver Code 
if __name__ == "__main__": 
  
    n = 4
    k = 6
    print (minimumX(n, k)) 
  
    n = 5
    k = 5
    print (minimumX(n, k)) 
  
# This code is contributed by ita_c      

