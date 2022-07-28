

# Python 3 program to print array elements  
# in alternative increasing and decreasing 
# order 
  
# Function to print array elements in 
# alternative increasing and decreasing 
# order 
def printArray(arr, n): 
  
    # First sort the array in 
    # increasing order 
    arr.sort() 
  
    l = 0
    r = n - 1
    flag = 0
      
    # start with 2 elements in 
    # increasing order 
    k = 2
  
    # till all the elements are not printed 
    while (l <= r) : 
          
        # printing the elements in 
        # increasing order 
        if (flag == 0): 
            i = l 
            while i < l + k and i <= r: 
                print(arr[i], end = " ") 
                i += 1
  
            flag = 1
            l = i 
          
        else:     # printing the elements in 
                 # decreasing order 
            i = r 
            while i > r - k and i >= l: 
                print(arr[i], end = " ") 
                i -= 1
  
            flag = 0
            r = i 
  
        # increasing the number of elements 
        # to printed in next iteration 
        k += 1
  
# Driver Code 
if __name__ == "__main__": 
      
    n = 6
    arr = [ 1, 2, 3, 4, 5, 6 ]  
    printArray(arr, n) 
  
# This code is contributed by ita_c 

