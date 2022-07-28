

# Python 3 program  to delete element  
# in given range 
  
# Function to delete L to R element  
def deleteElement(A, L, R, N) : 
  
    j = 0
    for i in range(N) : 
        if i <= L or i >= R : 
            A[j] = A[i] 
            j += 1
  
    # Return size of Array  
    # after delete element  
    return j 
      
# Driver Code 
if __name__ == "__main__" : 
  
    A = [5, 8, 11, 15, 26, 14, 19, 17, 10, 14] 
    L, R = 2,7
  
    n = len(A) 
    res_size = deleteElement(A, L, R, n) 
  
    for i in range(res_size) : 
        print(A[i],end = " ") 
  
# This code is contributed by ANKITRAI1 

