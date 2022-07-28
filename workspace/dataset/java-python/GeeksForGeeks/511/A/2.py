

# Python3 program to find summation 
# of series 
  
def summingSeries(n): 
  
    # use of loop to calculate 
    # sum of each term 
    S = 0
    for i in range(1, n+1):  
        S += i * i - (i - 1) * (i - 1) 
      
    return S 
  
# Driver Code 
n = 100
print("The sum of n term is: ",  
           summingSeries(n), sep = "") 
# This code is contributed by Smitha. 

