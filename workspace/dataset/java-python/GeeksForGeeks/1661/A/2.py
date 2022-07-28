

# Python3 program to find minimum 
# changes required to make 
# all elements of the array equal 
  
  
# Function to count of minimum changes 
# required to make all elements equal 
def minChanges(arr, n): 
  
      
    mp = dict()  
  
    # Store the count of each element 
    # as key-value pair in Dictionary  
  
    for i in range(n):  
        if arr[i] in mp.keys():  
            mp[arr[i]] += 1
        else:  
            mp[arr[i]] = 1
      
      
    maxElem = 0
          
    # Traverse through the Dictionary and  
    # find the maximum occurring element 
      
    for x in mp:  
        maxElem = max(maxElem, mp[x])  
          
    # Return count of all element minus 
    # count of maximum occurring element  
    return n - maxElem 
          
          
# Driver code 
          
arr = [2, 3, 3, 4 ] 
n = len(arr) 
print(minChanges(arr, n)) 
  

