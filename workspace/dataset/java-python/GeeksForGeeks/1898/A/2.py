

# Python3 code to find the first element  
# that appears even number times  
def firstEven(arr, n):  
  
    map1 = {}  
    for i in range(0, n):  
      
        # first time occurred  
        if arr[i] not in map1:  
            map1[arr[i]] = False
  
        # toggle for repeated occurrence  
        else: 
            map1[arr[i]] = not map1[arr[i]] 
  
    for j in range(0, n):  
      
        # first integer with true value  
        if map1[arr[j]] == True:  
            break
      
    return arr[j]  
  
# Driver code  
if __name__ == "__main__": 
  
    arr = [2, 4, 6, 8, 1, 6]  
    print(firstEven(arr, 6)) 
  
# This code is contributed  
# by Rituraj Jain 

