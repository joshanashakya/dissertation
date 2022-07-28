

# Python3 Program to find sum  
# of even-indiced Fibonacci numbers  
  
# Computes value of first fibonacci 
# numbers and stores the even-indexed sum  
def calculateEvenSum(n) : 
  
    if n <= 0 : 
        return 0
  
    fibo = [0] * (2 * n + 1) 
    fibo[0] , fibo[1] = 0 , 1
  
    # Initialize result 
    sum = 0
  
    # Add remaining terms  
    for i in range(2, 2 * n + 1) : 
  
        fibo[i] = fibo[i - 1] + fibo[i - 2] 
  
        # For even indices  
        if i % 2 == 0 : 
            sum += fibo[i] 
  
    # Return the alternting sum  
    return sum
  
# Driver code 
if __name__ == "__main__" : 
  
    # Get n  
    n = 8
  
    # Find the even-indiced sum  
    print("Even indexed Fibonacci Sum upto", 
           n, "terms:", calculateEvenSum(n)) 
  
# This code is contributed  
# by ANKITRAI1 

