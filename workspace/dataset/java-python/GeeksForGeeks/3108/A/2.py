

# Python3 program to find the largest  
# number from the array after n deletions 
import math as mt 
  
# Returns maximum element from arr[0..m-1]  
# after deleting elements from del[0..n-1] 
def findlargestAfterDel(arr, m, dell, n): 
  
    # Hash Map of the numbers 
    # to be deleted 
    mp = dict() 
    for i in range(n): 
          
        # Increment the count of del[i] 
        if dell[i] in mp.keys(): 
            mp[dell[i]] += 1
        else: 
            mp[dell[i]] = 1
              
    # Initializing the largestElement 
    largestElement = -10**9
  
    for i in range(m): 
          
        # Search if the element is present 
        if (arr[i] in mp.keys()): 
              
            # Decrement its frequency 
            mp[arr[i]] -= 1
  
            # If the frequency becomes 0, 
            # erase it from the map 
            if (mp[arr[i]] == 0): 
                mp.pop(arr[i]) 
                  
        # Else compare it largestElement 
        else: 
            largestElement = max(largestElement,  
                                         arr[i]) 
  
    return largestElement 
  
# Driver code 
array = [5, 12, 33, 4, 56, 12, 20] 
m = len(array) 
  
dell = [12, 33, 56, 5] 
n = len(dell) 
  
print(findlargestAfterDel(array, m, dell, n)) 
  
# This code is contributed  
# by mohit kumar 29 

