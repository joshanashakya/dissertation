

# Python3 program to Replace each element 
# by the difference of the total size 
# of the array and its frequency 
  
# Function to replace the elements 
def ReplaceElements(arr, n): 
      
    # Hash map which will store the 
    # frequency of the elements of the array. 
    mp = dict() 
  
    for i in range(n): 
          
        # Increment the frequency 
        # of the element by 1. 
        mp[arr[i]] = mp.get(arr[i], 0) + 1
  
    # Replace every element by its frequency 
    for i in range(n): 
        arr[i] = n - mp[arr[i]] 
  
# Driver code 
arr = [1, 2, 5, 2, 2, 5, 4] 
n = len(arr) 
  
ReplaceElements(arr, n) 
  
# Print the modified array. 
for i in range(n): 
    print(arr[i], end = " ") 
  
# This code is contributed by mohit kumar 

