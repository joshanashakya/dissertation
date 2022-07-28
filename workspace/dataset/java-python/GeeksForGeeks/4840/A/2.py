

# Python3 program to find the product of all 
# non- repeated elements in an array 
  
# Function to find the product of all 
# non-repeated elements in an array 
def findProduct( arr, n): 
  
    prod = 1
  
    # Hash to store all element of array 
    s = dict() 
    for i in range(n): 
        if (arr[i] not in s.keys()): 
            prod *= arr[i] 
            s[arr[i]] = 1
      
    return prod 
  
# Driver code 
arr= [1, 2, 3, 1, 1, 4, 5, 6]  
n = len(arr) 
  
print(findProduct(arr, n)) 
  
# This code is contributed by mohit kumar 

