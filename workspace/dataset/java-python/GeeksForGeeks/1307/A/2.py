

# Python3 implementation of  
# the approach  
  
# Function to count possible  
# pairs 
def CountPair(L,R): 
  
    # total count of numbers  
    # in range 
    x=(R-L+1) 
  
    # Note that if 'x' is odd then  
    # there will be '1' element left  
    # which can't form a pair 
    # printing count of pairs 
    print(x//2) 
  
# Driver code 
if __name__=='__main__': 
    L,R=1,8
    CountPair(L,R) 
      
# This code is contributed by  
# Indrajit Sinha. 

