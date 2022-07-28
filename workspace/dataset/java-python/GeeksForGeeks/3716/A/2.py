

# Python 3 code to delete element 
# in given range 
  
# Delete L to R element 
def deleteElement(A, L, R, N): 
    B = [] 
  
    for i in range(0, N, 1): 
        if (i <= L or i >= R): 
            B.append(A[i])  
      
    return B 
  
# Driver Code 
if __name__ == '__main__': 
    A = [3, 5, 3, 4, 9, 3, 1, 
             6, 3, 11, 12, 3]  
    L = 2
    R = 7
    n = len(A) 
    res = deleteElement(A, L, R, n) 
    for i in range(len(res)): 
        print(res[i], end = " ") 
  
# THis code is implemented by 
# Surendra_Gangwar 

