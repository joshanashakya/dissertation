

# Python3 implementation of the above approach 
   
import math 
  
# Function to Check if the array 
# has an element which is equal to 
# product of all the remaining elements 
def CheckArray( arr, n): 
  
    prod = 1
   
    # Storing frequency in map 
    freq = [] 
   
    # Calculate the product of all the elements 
    for i in range(n) : 
        freq.append(arr[i]) 
        prod *= arr[i] 
   
    root = math.sqrt(prod) 
   
    # If the prod is a perfect square 
    if (root * root == prod): 
   
        # then check if its square root 
        # exist in the array or not 
        if root in freq: 
            return True
   
    return False
   
# Driver code 
if __name__ == "__main__": 
  
    arr = [1, 2, 12, 3, 2 ] 
    n = len(arr) 
   
    if (CheckArray(arr, n)): 
        print ("YES") 
   
    else: 
        print ("NO") 

