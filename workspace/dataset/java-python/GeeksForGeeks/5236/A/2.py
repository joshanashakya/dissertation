

# Python3 program to fill an 
# array with frequencies. 
  
# Fills arr[] with frequencies of elements 
def fillWithFreq(arr, n): 
  
    temp = [0 for i in range(n)] 
  
    # Fill temp with frequencies 
    for i in range(n): 
        temp[arr[i]] += 1
  
    # Copy temp to array 
    for i in range(n): 
        arr[i] = temp[i] 
  
# Driver Code 
arr = [5, 2, 3, 4, 5, 5, 4, 5, 6, 7] 
n = len(arr) 
fillWithFreq(arr, n) 
for i in range(n): 
    print(arr[i], end = " ") 
      
# This code is contributed by Anant Agarwal. 

