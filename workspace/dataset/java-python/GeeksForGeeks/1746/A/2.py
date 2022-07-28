

# Python3 program to find minimum 
# number of steps to cover distance x 
  
# Function to calculate the minimum number of  
# steps required total steps taken is divisible 
# by m and only 1 or 2 steps can be taken at a time 
def minsteps(n, m): 
  
    # If m > n ans is -1 
    if (m > n): 
        return -1
          
    # else discussed above approach 
    else : 
        return ((n + 1) // 2 + m - 1) // m * m; 
  
# Driver code 
n = 17
m = 4
ans = minsteps(n, m) 
print(ans) 
  
# This code is contributed by Mohit Kumar 

