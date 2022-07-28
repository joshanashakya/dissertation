

# Python 3 program to find the maximum value 
# of a + shaped pattern in 2-D array 
  
N = 100
  
n = 3
m = 4
  
# Function to return maximum 
# Plus value 
def maxPlus(arr): 
  
    # Initializing answer with 
    # the minimum value 
    ans = 0
  
    # Initializing all four arrays 
    left = [[0 for x in range(N)]  
               for y in range(N)] 
    right = [[0 for x in range(N)]  
                for y in range(N)] 
    up = [[0 for x in range(N)]  
             for y in range(N)] 
    down = [[0 for x in range(N)]  
               for y in range(N)] 
  
    # Initializing left and up array. 
    for i in range(n) : 
        for j in range(m) : 
            left[i][j] = (max(0, (left[i][j - 1] if j else 0)) + 
                                  arr[i][j]) 
            up[i][j] = (max(0, (up[i - 1][j] if i else 0)) + 
                                arr[i][j]) 
  
  
    # Initializing right and down array. 
    for i in range(n) : 
        for j in range(m) : 
            right[i][j] = max(0, (0 if (j + 1 == m ) else 
                                  right[i][j + 1])) + arr[i][j] 
            down[i][j] = max(0, (0 if (i + 1 == n ) else 
                                 down[i + 1][j])) + arr[i][j] 
  
    # calculating value of maximum  
    # Plus (+) sign 
    for i in range(1, n - 1): 
        for j in range(1, m - 1): 
            ans = max(ans, up[i - 1][j] + down[i + 1][j] + 
                         left[i][j - 1] + right[i][j + 1] + 
                         arr[i][j]) 
  
    return ans 
  
# Driver code 
if __name__ == "__main__":  
    arr = [[ 1, 1, 1, 1 ], 
        [ -6, 1, 1, -4 ], 
        [ 1, 1, 1, 1 ]] 
  
    # Function call to find maximum value 
    print(maxPlus(arr)) 
  
# This code is contributed  
# by ChitraNayal 

