

# Python3 implementation to find the largest value 
# of a + b satisfying the given condition 
  
# Function to return the maximum sum of 
# a + b satisfying the given condition 
def getLargestSum(N): 
    # Initialize max_sum 
    max_sum = 0
  
    # Consider all the possible pairs 
    for i in range(1,N+1): 
        for j in range(i + 1, N + 1, 1): 
  
            # Check if the product is 
            # divisible by the sum 
            if (i * j % (i + j) == 0): 
  
                # Storing the maximum sum 
                # in the max_sum variable 
                max_sum = max(max_sum, i + j) 
  
    # Return the max_sum value 
    return max_sum 
  
# Driver code 
if __name__ == '__main__': 
    N = 25
  
    max_sum = getLargestSum(N) 
    print(max_sum) 
  
# This code is contributed by Surendra_Gangwar 

