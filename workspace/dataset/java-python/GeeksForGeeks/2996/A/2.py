

# Python 3 program to print terms of binomial 
# series and also calculate sum of series. 
  
# Function to print the series 
def series(A, X, n): 
  
    # Calculating and printing first term 
    term = pow(A, n) 
    print(term, end = " ") 
  
    # Computing and printing remaining terms 
    for i in range(1, n+1):  
  
        # Find current term using previous terms 
        # We increment power of X by 1, decrement 
        # power of A by 1 and compute nCi using  
        # previous term by multiplying previous 
        # term with (n - i + 1)/i 
        term = int(term * X * (n - i + 1)/(i * A)) 
  
        print(term, end = " ") 
      
# Driver Code 
A = 3; X = 4; n = 5
series(A, X, n) 
  
# This code is contributed by Smitha Dinesh Semwal. 

