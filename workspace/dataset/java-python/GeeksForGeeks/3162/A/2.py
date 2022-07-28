

# Pyhton 3 Program to add 1 to an 
# array representing a number 
  
# function to add one and print  
# the array 
def sum(arr, n): 
  
    i = n 
      
    # if array element is less than 
    # 9, then simply add 1 to this. 
    if(arr[i] < 9): 
      
        arr[i] = arr[i] + 1
        return
      
    # if array element is greater 
    # than 9, replace it with 0 
    # and decrement i 
    arr[i] = 0
    i -= 1
      
    # recursive function 
    sum(arr, i) 
      
    # If 1 was appended at head 
    # of array then, print it 
    if(arr[0] > 0): 
        print(arr[0], ", ", end="") 
          
    # print the array elements  
    # after adding one 
    for i in range(1, n+1): 
          
        print(arr[i], end="") 
        if(i < n): 
            print(", ", end="") 
      
# driver code 
# number of elements in array 
n = 4
  
# array elements, index of array 
# should be 1 based, hence, 0 is 
# added here at arr[0] 
arr = [0, 1, 9, 3, 9] 
  
# function calling 
sum(arr, n) 
  
# This code is contributed by 
# Smitha Semwal 

