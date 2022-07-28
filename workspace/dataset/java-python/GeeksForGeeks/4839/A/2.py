

# Python 3 program to find the product  
# of all non-repeated elements in an array 
  
# Function to find the product of all 
# non-repeated elements in an array 
def findProduct(arr, n): 
      
    # sort all elements of array 
    sorted(arr) 
  
    prod = 1
    for i in range(0, n, 1): 
        if (arr[i - 1] != arr[i]): 
            prod = prod * arr[i] 
  
    return prod; 
  
# Driver code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 1, 1, 4, 5, 6] 
  
    n = len(arr) 
  
    print(findProduct(arr, n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

