

# Python3 implementation of the approach  
  
# Function to return the maximum sum of the  
# square of the sum of two subsets of an array  
def maxSquareSubsetSum(A, N) : 
  
    # Initialize variables to store  
    # the sum of subsets  
    sub1 = 0; sub2 = 0; 
      
    # Sorting the array 
    A.sort(); 
  
    # Loop through the array  
    for i in range(N) : 
  
        # Sum of the first subset  
        if (i < (N // 2) - 1) : 
            sub1 += A[i];  
  
        # Sum of the second subset  
        else : 
            sub2 += A[i];  
  
    # Return the maximum sum of  
    # the square of the sum of subsets  
    return sub1 * sub1 + sub2 * sub2;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 7, 2, 13, 4, 25, 8 ];  
    N = len(arr);  
  
    print(maxSquareSubsetSum(arr, N));  
  
# This code is contributed by AnkitRai01 

