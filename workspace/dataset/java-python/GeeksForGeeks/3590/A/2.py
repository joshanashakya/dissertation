

# Python3 implementation of the approach  
  
# Function to return the minimum  
# number of operations required  
def minOperations(n, m, k, matrix):  
  
    # Create another array to store the  
    # elements of matrix  
    arr = [0] * (n * m)  
  
    mod = matrix[0][0] % k  
  
    for i in range(0, n):  
        for j in range(0, m):  
            arr[i * m + j] = matrix[i][j]  
  
            # If not possible  
            if matrix[i][j] % k != mod:  
                return -1
  
    # Sort the array to get median  
    arr.sort()  
  
    median = arr[(n * m) // 2]  
  
    # To count the minimum operations  
    minOperations = 0
    for i in range(0, n * m):  
        minOperations += abs(arr[i] - median) // k  
  
    # If there are even elements, then there  
    # are two medians. We consider the best  
    # of two as answer.  
    if (n * m) % 2 == 0: 
      
        median2 = arr[(n * m) // 2]  
        minOperations2 = 0
        for i in range(0, n * m):  
            minOperations2 += abs(arr[i] - median2) // k  
  
        minOperations = min(minOperations, 
                            minOperations2)  
      
    # Return minimum operations required  
    return minOperations  
  
# Driver code  
if __name__ == "__main__":  
  
    matrix = [[2, 4, 6],  
              [8, 10, 12],  
              [14, 16, 18],  
              [20, 22, 24]] 
              
    n = len(matrix)  
    m = len(matrix[0])  
    k = 2
    print(minOperations(n, m, k, matrix))  
  
# This code is contributed by Rituraj Jain 

