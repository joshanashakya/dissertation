

# Python3 program to find the maximum  
# score after flipping a Binary Matrix 
# atmost K times  
  
n = 3
m = 4
  
# Function to find maximum score of matrix  
def maxMatrixScore(A, K):  
  
    update = {} 
  
    # Find value of rows having first  
    # column value equal to zero  
    for i in range(0, n):  
        if A[i][0] == 0: 
              
            ans = 0
            for j in range(1, m):  
                ans = ans + A[i][j] * 2 ** (m - j - 1)  
  
            update[ans] = i  
          
    # update those rows which lead to  
    # maximum score after toggle  
    for idx in update.values():  
  
        for j in range(0, m):  
            A[idx][j] = (A[idx][j] + 1) % 2
  
        K -= 1
        if K <= 0: 
            break
  
    # Calculating answer  
    ans = 0
    for j in range(0, m):  
          
        zero, one = 0, 0
  
        for i in range(0, n):  
            if A[i][j] == 0: zero += 1
            else: one += 1
  
        # check if K > 0 we can  
        # toggle if necessary.  
        if K > 0 and zero > one:  
            ans += zero * 2 ** (m - j - 1)  
            K -= 1
          
        else: 
            ans += one * 2 ** (m - j - 1)  
      
    # return max answer possible  
    return ans  
  
# Driver Code 
if __name__ == "__main__":  
  
    A = [[0, 0, 1, 1],  
         [1, 0, 1, 0],  
         [1, 1, 0, 0]]  
      
    K = 2
      
    # function call to print required answer  
    print(maxMatrixScore(A, K))  
  
# This code is contributed by Rituraj Jain 

