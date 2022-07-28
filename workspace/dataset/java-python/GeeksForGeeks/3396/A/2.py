

# Python 3 program to find minimum number 
# of steps to make the array equal to the 
# given array. 
  
# function to calculate min_Steps 
def minSteps(arr, n): 
    min_Steps = 0
    for i in range(n): 
        if (i > 0):  
            min_Steps += abs(arr[i] -
                             arr[i - 1]) 
          
        # first element of arr. 
        else: 
            min_Steps += abs(arr[i]) 
    return min_Steps 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [ 1, 2, 2, 1 ] 
    n = len(arr) 
    print(minSteps(arr, n)) 
  
# This code is contributed  
# by PrinciRaj19992 

