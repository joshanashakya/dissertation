

# Python 3program to count pairs with odd OR 
  
# Function to count pairs with odd OR 
def countOddPair(A, N): 
      
    # Count total even numbers in 
    # array 
    count = 0
    for i in range(0, N): 
        if (A[i] % 2 != 1): 
            count+=1
  
    # Even pair count 
    evenPairCount = count * (count - 1) / 2
  
    # Total pairs 
    totPairs = N * (N - 1) / 2
  
    # Return Odd pair count 
    return (int)(totPairs - evenPairCount) 
      
# Driver Code 
A = [ 5, 6, 2, 8 ] 
  
N = len(A) 
  
print(countOddPair(A, N)) 
  
# This code is contributed by PrinciRaj1992  

