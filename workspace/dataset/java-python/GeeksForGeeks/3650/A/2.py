

# Python3 implmentation of to 
# maximize the first element of 
# the array such that average 
# of the array remains constant 
  
# Maximum value of the first 
# array element that can be attained 
def getmax(arr, n, x): 
  
    # Variable to store the sum 
    s = 0
  
    # Loop to find the sum of array 
    for i in range(n): 
        s = s + arr[i] 
  
    # Desired maximum value 
    print(min(s, x)) 
  
# Driver Code 
if __name__ == '__main__': 
    arr= [1, 2, 3, 4] 
    x = 5
    arr_size = len(arr) 
  
    getmax(arr, arr_size, x) 
  
# This code is contributed by mohit kumar 29 

