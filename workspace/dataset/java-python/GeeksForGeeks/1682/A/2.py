

# Python 3 program to count the number of pairs 
# (i,j) such that sum of elements in j-th column 
# is greater than sum of elements in i-th row 
  
N = 3
  
# Function to count the number of pairs 
# (i,j) such that sum of elements in j-th column 
# is greater than sum of elements in i-th row 
def countPairs(a): 
      
    # Initialize row sum and column 
    # sum to zero 
    sumr = [0 for i in range(N)] 
    sumc = [0 for i in range(N)]  
      
    # Calculate row sum and column sum 
    for i in range(N): 
        for j in range(N): 
            sumr[i] += a[i][j] 
            sumc[j] += a[i][j] 
          
    count = 0
      
    # Count the number of pairs that are valid 
    for i in range(N): 
        for j in range(N): 
            if (sumc[i] > sumr[j]): 
                count += 1
                  
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    a = [[1, 2, 3],[4, 5, 6], [7, 8, 9]] 
      
    print(countPairs(a)) 
      
# This code is contributed by 
# Surendra_Gangwar 

