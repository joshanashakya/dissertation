

# Python3 program to find the  
# length of longest alternate  
# subsequence  
import numpy as np 
  
# LAS[i][pos] array to find  
# the length of LAS till  
# index i by including or  
# excluding element arr[i]  
# on the basis of value of pos  
LAS = np.zeros((1000, 2)) 
  
for i in range(1000) : 
    for j in range(2) : 
        LAS[i][j] = False
  
def solve(arr, n, i, pos) : 
  
    # Base Case  
    if (i == n) : 
        return 0;  
  
    if (LAS[i][pos]) : 
        return LAS[i][pos];  
  
    inc = 0; exc = 0;  
  
    # If current element is  
    # positive and pos is true  
    # Include the current element  
    # and change pos to false  
    if (arr[i] > 0 and pos == True) : 
        pos = False;  
  
        # Recurr for the next  
        # iteration  
        inc = 1 + solve(arr, n, i + 1, pos);  
  
    # If current element is  
    # negative and pos is false  
    # Include the current element  
    # and change pos to true  
    elif (arr[i] < 0 and pos == False) : 
        pos = True;  
  
        # Recurr for the next  
        # iteration  
        inc = 1 + solve(arr, n, i + 1, pos);  
      
    # If current element is  
    # excluded, reccur for  
    # next iteration  
    exc = solve(arr, n, i + 1, pos);  
  
    LAS[i][pos] = max(inc, exc);  
  
    return LAS[i][pos];  
  
# Driver's Code  
if __name__ == "__main__" :  
  
    arr = [ -1, 2, 3, 4, 5, -6, 8, -99 ];  
    n = len(arr);  
  
    # Print LAS  
    print(max(solve(arr, n, 0, 0), solve(arr, n, 0, 1)));  
      
# This code is contributed by AnkitRai01 

