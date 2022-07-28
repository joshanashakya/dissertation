

# Python 3 program to count pair with 
# bitwise-AND as even number 
  
# Function to count number of  
# pairs EVEN bitwise AND 
def findevenPair(A, N): 
  
    # variable for counting even pairs 
    evenPair = 0
  
    # find all pairs 
    for i in range(0, N): 
        for j in range(i + 1, N): 
              
            # find AND operation to  
            # check evenpair 
            if ((A[i] & A[j]) % 2 == 0): 
                evenPair += 1
  
    # return number of even pair 
    return evenPair 
  
# Driver Code 
a = [ 5, 1, 3, 2 ] 
n = len(a) 
  
print(findevenPair(a, n)) 
  
# This code is contributed  
# by PrinciRaj1992 

