

# Python3 program to find maximum and  
# minimum product from an array 
  
# method returns maximum and minimum  
# obtainable product of array arr 
def getMaxandMinProduct(arr, n): 
  
    # Initialize all products with arr[0] 
    curMaxProduct = arr[0] 
    curMinProduct = arr[0] 
    prevMaxProduct = arr[0] 
    prevMinProduct = arr[0] 
    maxProduct = arr[0] 
    minProduct = arr[0] 
  
    # Process all elements after arr[0] 
    for i in range(1, n): 
  
        # Current maximum product is maximum of following 
        # 1) prevMax * curelement (when curelement is +ve) 
        # 2) prevMin * curelement (when curelement is -ve) 
        # 3) Element itself 
        # 4) Previous max product 
        curMaxProduct = max(prevMaxProduct * arr[i], 
                        max(prevMinProduct * arr[i], arr[i])) 
        curMaxProduct = max(curMaxProduct, prevMaxProduct) 
  
        # Current min product computation is Similar to 
        # that of current max profuct 
        curMinProduct = min(prevMaxProduct * arr[i], 
                        min(prevMinProduct * arr[i], arr[i])) 
        curMinProduct = min(curMinProduct, prevMinProduct) 
        maxProduct = max(maxProduct, curMaxProduct) 
        minProduct = min(minProduct, curMinProduct) 
  
        # copy current values to previous values 
        prevMaxProduct = curMaxProduct 
        prevMinProduct = curMinProduct 
  
    return (minProduct, maxProduct) 
  
# Driver Code 
if __name__ == "__main__": 
    arr = [-4, -2, 3, 7, 5, 0, 1] 
    n = len(arr) 
    product = getMaxandMinProduct(arr, n) 
    print("Minimum product is", product[0], "and", 
          "Maximum product is", product[1]) 
  
# This code is contributed by 
# sanjeev2552 

