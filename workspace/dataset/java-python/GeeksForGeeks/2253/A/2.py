

# Python program to change one element of an array such 
# that the resulting array is in arithmetic progression. 
def makeAP(arr, n):  
    initial_term, common_difference = 0, 0
    if (n == 3): 
        common_difference = arr[2] - arr[1] 
        initial_term = arr[1] - common_difference 
    elif((arr[1] - arr[0]) == arr[2] - arr[1]): 
  
        # Check if the first three elements are in  
        # arithmetic progression 
        initial_term = arr[0] 
        common_difference = arr[1] - arr[0] 
          
    elif((arr[2] - arr[1]) == (arr[3] - arr[2])): 
  
        # Check if the first element is not  
        # in arithmetic progression 
        common_difference = arr[2] - arr[1] 
        initial_term = arr[1] - common_difference 
          
    else: 
        # The first and fourth element are  
        # in arithmetic progression 
        common_difference = (arr[3] - arr[0]) / 3
        initial_term = arr[0] 
  
    # Print the arithmetic progression 
    for i in range(n): 
        print(int(initial_term+
                 (i * common_difference)), end = " ") 
    print() 
    
# Driver code  
arr = [1, 3, 7]  
n = len(arr)  
makeAP(arr, n) 

