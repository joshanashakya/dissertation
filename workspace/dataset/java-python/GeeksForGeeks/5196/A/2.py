

# Python 3 implementation of the approach  
  
# Function to return the final element  
def getFinalElement(n): 
  
    finalNum = 2
    while finalNum * 2 <= n:  
        finalNum *= 2
    return finalNum 
  
# Driver code 
if __name__ =="__main__": 
  
    N = 12
    print( getFinalElement(N)) 
  
# This code is contributed  
# by ChitraNayal 

