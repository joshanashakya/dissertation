

# Python3 implementation of  
# above approach 
  
# function that calculates the 
# maximum no. of cuts 
def numberOfCuts(M, N): 
    result = 0
      
    result = (M - 1) * (N - 1) 
      
    return result 
  
# Driver code 
if __name__=='__main__': 
      
    M, N = 4, 4
      
    # Calling function. 
    Cuts = numberOfCuts(M, N) 
      
    print("Maximum cuts = ", Cuts) 
  
# This code is contributed by 
# Kriti_mangal 

