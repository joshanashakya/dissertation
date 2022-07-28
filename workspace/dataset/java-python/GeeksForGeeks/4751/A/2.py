

# Python 3 program to count pairs 
# with even OR 
  
def findEvenPair(A, N) : 
    evenPair = 0
  
    for i in range(N) : 
        for j in range(i+1, N): 
  
            # find OR operation  
            # check odd or even  
            if (A[i] | A[j]) % 2 == 0 : 
                evenPair += 1
  
    # return count of even pair 
    return evenPair 
  
# Driver Code 
if __name__ == "__main__" : 
  
    A = [ 5, 6, 2, 8] 
    N = len(A) 
  
    # function calling 
    print(findEvenPair(A, N)) 
  
# This code is contributed by ANKITRAI1 

