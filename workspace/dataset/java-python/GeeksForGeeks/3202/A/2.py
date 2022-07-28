

# Python 3 code for improved implementation 
  
# Function for printing all elements of B[] 
# that are not divisible by any element of A[] 
def printNonDivisible(A, B, n, m): 
      
    # Find maximum element in B[] 
    maxB = 0
    for i in range(0, m, 1): 
        if (B[i] > maxB): 
            maxB = B[i] 
  
    # Initialize all multiples as marked 
    mark = [0 for i in range(maxB)] 
  
    # Marking the multiples of all  
    # the elements of the array. 
    for i in range(0, n, 1): 
        for x in range(A[i], maxB, A[i]): 
            mark[x] += 1
  
    # Print not marked elements 
    for i in range(0, m - 1, 1): 
        if (mark[B[i]] == 0): 
            print(B[i]) 
  
# Driver Code 
if __name__ == '__main__': 
    A = [100, 200, 400, 100] 
    n = len(A) 
    B = [190, 200, 87, 600, 800] 
    m = len(B) 
    printNonDivisible(A, B, n, m) 
  
# This code is contributed by 
# Shashank_Sharma 

