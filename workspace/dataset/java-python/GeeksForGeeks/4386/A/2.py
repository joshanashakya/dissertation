

# Python 3 program for printing  
# the hollow triangle pattern  
  
# Function for printing pattern 
def pattern(N): 
    k, space, rows = 0, 1, N 
  
    # For printing stars  
    for i in range(rows, 0, -1): 
        for j in range(1, i + 1): 
            print('*', end = '') 
  
        if i != rows: 
            # for printing space  
            for k in range(1, space + 1): 
                print(' ', end = '') 
  
            # increment by 2  
            space += 2
        for j in range(i, 0, -1): 
            if j != rows: 
                print('*', end = '') 
        print() 
    print() 
  
# Driver Code 
  
# Get N 
N = 6
  
# Print the pattern  
pattern(N) 
  
# This code is contributed by  
# SamyuktaSHegde  

