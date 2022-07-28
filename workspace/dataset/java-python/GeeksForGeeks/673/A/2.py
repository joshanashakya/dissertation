

# Python 3 implementation of the above approach 
  
# Function to Check if the array 
# has an element which is equal to 
# product of all the remaining elements 
def CheckArray(arr, n): 
    prod = 1
  
    # Calculate the product of all 
    # the elements 
    for i in range(0, n, 1): 
        prod *= arr[i] 
  
    # Return true if any such element  
    # is found 
    for i in range(0, n, 1): 
        if (arr[i] == prod / arr[i]): 
            return True
  
    # If no element is found 
    return False
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 12, 3, 2]  
    n = len(arr) 
  
    if (CheckArray(arr, n)): 
        print("YES") 
  
    else: 
        print("NO") 
  
# This code is contributed by  
# Surendra_Gangwar 

