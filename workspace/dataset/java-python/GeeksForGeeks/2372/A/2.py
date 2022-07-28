

# Python 3 implementation of the approach 
  
# Function to return the 
# required rate percentage 
def Rate( N1, N2): 
    rate = (N2 - N1) * 100 // (N1); 
  
    return rate 
  
# Driver code 
if __name__ == "__main__": 
    N1 = 100
    N2 = 120
  
    print(Rate(N1, N2) ," %") 
  
# This code is contributed by ChitraNayal     

