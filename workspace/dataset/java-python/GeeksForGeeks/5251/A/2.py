

# Python 3 implementation of the approach 
N = 3
  
# Function to return the maximum trace possible 
# for a sub-matrix of the given matrix 
def MaxTraceSub(mat): 
    max_trace = 0
    for i in range(N): 
        for j in range(N): 
            r = i 
            s = j 
            trace = 0
  
            # Calculate the trace for each of 
            # the sub-matrix with top left corner 
            # at cell (r, s) 
            while (r < N and s < N): 
                trace += mat[r] 
                r += 1
                s += 1
  
                # Update the maximum trace 
                max_trace = max(trace, max_trace) 
  
    # Return the maximum trace 
    return max_trace 
  
# Driver code 
if __name__ == '__main__': 
    mat = [[10, 2, 5],[6, 10, 4],[2, 7, -10]] 
    print(MaxTraceSub(mat)) 
  
# This code is contributed by 
# Surendra_Gangwar 

