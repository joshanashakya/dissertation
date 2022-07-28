

# Python3 implementation of the approach  
  
# Function to return the area  
# of the remaining plot  
def remainingArea(N, M, K): 
  
    # Continue while plot has positive area  
    # and there are persons left  
    while (K > 0 and N > 0 and M > 0): 
  
        # If length > breadth  
        # then subtract breadth from length  
        if (N > M):  
            N = N - M;  
  
        # Else subtract length from breadth  
        else: 
            M = M - N;  
        K = K - 1; 
    if (N > 0 and M > 0):  
        return N * M;  
    else: 
        return 0;  
  
# Driver code  
N = 5; 
M = 3; 
K = 2;  
  
print(remainingArea(N, M, K));  
  
# This code contributed by Rajput-Ji 

