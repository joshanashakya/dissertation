

# Python 3 implementation of the approach 
  
# Function to generate the required matrix 
def solve(n): 
    initial_array = [[0 for i in range(n-1)] for j in range(n-1)] 
    final_array = [[0 for i in range(n)]for j in range(n)] 
  
    for i in range(n - 1): 
        initial_array[0][i] = i + 1
  
    # Form cyclic array of elements 1 to n-1 
    for i in range(1, n - 1): 
        for j in range(n - 1): 
            initial_array[i][j] = initial_array[i - 1][(j + 1) % (n - 1)] 
  
    # Store initial array into final array 
    for i in range(n-1): 
        for j in range(n-1): 
            final_array[i][j] = initial_array[i][j] 
  
    # Fill the last row and column with 0's 
    for i in range(n): 
        final_array[i][n - 1] = final_array[n - 1][i] = 0
  
    for i in range(n): 
        t0 = final_array[i][i] 
        t1 = final_array[i][n - 1] 
  
        # Swap 0 and the number present 
        # at the current indexed row 
        temp = final_array[i][i] 
        final_array[i][i] = final_array[i][n - 1] 
        final_array[i][n - 1] = temp 
  
        # Also make changes in the last row 
        # with the number we swapped 
        final_array[n - 1][i] = t0 
  
    # Print the final array 
    for i in range(n): 
        for j in range(n): 
            print(final_array[i][j],end = " ") 
        print("\n",end = "") 
  
# Driver code 
if __name__ == '__main__': 
    n = 5
    solve(n) 
      
# This code is contributed by 
# Surendra_Gangwar 

