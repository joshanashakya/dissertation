

# Python3 program to check if all array  
# elements are distinct 
def areDistinct(arr) : 
  
    n = len(arr) 
  
    # Put all array elements in a map 
    s = set() 
    for i in range(0, n):  
        s.add(arr[i]) 
      
    # If all elements are distinct,  
    # size of set should be same array. 
    return (len(s) == len(arr)) 
  
# Driver code 
arr = [ 1, 2, 3, 2 ] 
  
if (areDistinct(arr)):  
    print("All Elements are Distinct") 
  
else :  
    print("Not all Elements are Distinct") 
  
# This code is contributed by ihritik 

