

# Function to return the largest element 
# such that its previous and next 
# element product is maximum 
def maxElement(a, n): 
  
    if n < 3: 
        return -1
    maxElement = a[0] 
    maxProd = a[n - 1] * a[1] 
  
    for i in range(1, n): 
          
        # Calculate the product of the previous 
        # and the next element for 
        # the current element 
  
        currprod = a[i - 1] * a[(i + 1) % n] 
  
        if currprod > maxProd: 
            maxProd = currprod 
            maxElement = a[i] 
              
        # If current product is equal to the 
        # current maximum product then 
        # choose the maximum element 
        elif currprod == maxProd: 
            maxElement = max(maxElement, a[i]) 
    return maxElement 
  
# Driver code 
  
a = [5, 6, 4, 3, 2] 
n = len(a)#sizeof(a[0]) 
print(maxElement(a, n)) 
  
# This code is contributed by mohit kumar 29 

