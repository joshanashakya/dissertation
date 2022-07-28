

# Python3 implementation of the above approach 
  
def AlternateRearrange(arr, n): 
  
    # Sort the array 
    arr.sort() 
  
    v1 = list() # to insert even values 
    v2 = list() # to insert odd values 
  
    for i in range(n): 
        if (arr[i] % 2 == 0): 
            v1.append(arr[i]) 
        else: 
            v2.append(arr[i]) 
  
    index = 0
    i = 0
    j = 0
  
    flag = False
  
    # Set flag to true if first element is even 
    if (arr[0] % 2 == 0): 
        flag = True
  
    # Start rearranging array 
    while (index < n):  
  
        # If first element is even 
        if (flag == True): 
            arr[index] = v1[i] 
            index += 1
            i += 1
            flag = ~flag 
          
        # Else, first element is Odd 
        else: 
            arr[index] = v2[j] 
            index += 1
            j += 1
  
            flag = ~flag 
          
    # Print the rearranged array 
    for i in range(n): 
        print(arr[i], end = " ") 
  
# Driver code 
arr = [ 9, 8, 13, 2, 19, 14]  
n = len(arr) 
  
AlternateRearrange(arr, n) 
  
# This code is contributed  
# by Mohit Kumar 29 

