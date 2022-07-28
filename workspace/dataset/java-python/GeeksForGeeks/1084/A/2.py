

# Python3 program to find Product of all  
# the elements in an array divisible by 
# a given number K 
  
# Function to find Product of all the elements 
# in an array divisible by a given number K 
def findProduct(arr, n, k): 
  
    prod = 1
  
    # Traverse the array 
    for i in range(n): 
  
        # If current element is divisible  
        # by k, multiply with product so far 
        if (arr[i] % k == 0): 
            prod *= arr[i] 
  
    # Return calculated product 
    return prod 
  
# Driver code 
if __name__ == "__main__": 
  
    arr= [15, 16, 10, 9, 6, 7, 17 ] 
    n = len(arr) 
    k = 3
  
    print (findProduct(arr, n, k)) 
  
# This code is contributed by ita_c 

