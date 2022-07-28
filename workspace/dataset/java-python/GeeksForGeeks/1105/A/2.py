

# Python 3 program to check if there is 
# any Subarray with product equal to K 
  
# Function to find maximum 
# product subarray 
def maxProduct(arr,n, p): 
  
    # Variables to store maximum and  
    # minimum product till ith index. 
    minVal = arr[0] 
    maxVal = arr[0] 
  
    maxProduct = arr[0] 
  
    for i in range( 1, n): 
  
        # When multiplied by -ve number, 
        # maxVal becomes minVal 
        # and minVal becomes maxVal. 
        if (arr[i] < 0): 
            maxVal, minVal = minVal, maxVal 
  
        # maxVal and minVal stores the 
        # product of subarray ending at arr[i]. 
        maxVal = max(arr[i], maxVal * arr[i]) 
        minVal = min(arr[i], minVal * arr[i]) 
  
        # Check if the current product is 
        # equal to the given product 
        if (minVal == p or maxVal == p): 
            return True
  
        # Max Product of array. 
        maxProduct = max(maxProduct, maxVal) 
  
    # Return maximum product  
    # found in array. 
    return False
  
# Driver Code 
if __name__ == "__main__": 
      
    arr = [ 1, 2, -5, -4 ] 
    product = -10
    n = len(arr) 
  
    if (maxProduct(arr, n, product)): 
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed  
# by ChitraNayal 

