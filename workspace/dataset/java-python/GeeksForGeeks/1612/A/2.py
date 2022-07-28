

# Python3 program to find sum of matrix  
# in which each element is absolute  
# difference of its corresponding 
# row and column number row. 
  
# Return the sum of matrix in which each  
# element is absolute difference of its  
# corresponding row and column number row 
def findSum(n): 
  
    # Generate matrix 
    arr = [[0 for x in range(n)] 
              for y in range (n)] 
    for i in range (n): 
        for j in range (n): 
            arr[i][j] = abs(i - j) 
  
    # Compute sum 
    sum = 0
    for i in range (n): 
        for j in range(n): 
            sum += arr[i][j] 
  
    return sum
  
# Driver Code 
if __name__ == "__main__": 
  
    n = 3
    print (findSum(n)) 
      
# This code is contributed by ita_c 

