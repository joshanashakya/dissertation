

# Python 3 implementation of the approach 
  
# Function to return the number 
# of chicks on the nth day 
def getChicks( n): 
  
    chicks = pow(3, n - 1) 
  
    return chicks 
  
# Driver code 
if __name__ == "__main__": 
    n = 3
  
    print ( getChicks(n)) 
  
# This code is contributed by ChitraNayal 

