

# Python 3 Program to find alternate sum 
# of Fibonacci numbers 
  
# Computes value of first fibonacci numbers 
# and stores their alternate sum 
def calculateAlternateSum(n): 
  
    if (n <= 0): 
        return 0
  
    fibo = [0]*(n + 1) 
    fibo[0] = 0
    fibo[1] = 1
  
    # Initialize result 
    sum = pow(fibo[0], 2) + pow(fibo[1], 2) 
  
    # Add remaining terms 
    for i in range(2, n+1) : 
        fibo[i] = fibo[i - 1] + fibo[i - 2] 
  
        # For even terms 
        if (i % 2 == 0): 
            sum -= fibo[i] 
  
        # For odd terms 
        else: 
            sum += fibo[i] 
  
    # Return the alternating sum 
    return sum
  
# Driver program to test above function 
if __name__ == "__main__": 
    # Get n 
    n = 8
  
    # Find the alternating sum 
    print( "Alternating Fibonacci Sum upto "
        , n ," terms: "
        , calculateAlternateSum(n)) 
  
# this code is contributed by 
# ChitraNayal 

