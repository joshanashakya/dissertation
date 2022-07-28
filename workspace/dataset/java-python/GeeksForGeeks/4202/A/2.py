

# Simple Python 3 program to  
# count passing cars 
  
# Returns count of passing cars 
def getPassingCars(A, n): 
    result = 0
    for i in range(0, n - 1, 1): 
        if (A[i] == 0): 
            for j in range(i + 1, n, 1): 
                if (A[j]): 
                    result += 1
          
    return result 
  
# Driver Code 
if __name__ == '__main__': 
    A = [0, 1, 0, 1, 1] 
    n = len(A) 
    print(getPassingCars(A, n)) 
      
# This code is contributed by 
# Sanjit_Prasad 

