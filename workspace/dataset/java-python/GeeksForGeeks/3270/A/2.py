

# Python3 implementation of the approach 
  
# Function to return the missing element 
def findMissing(arr, n, k, avg): 
  
    # Find the sum of the array elements 
    sum = 0; 
    for i in range(n): 
        sum += arr[i]; 
      
    # The numerator and the denominator 
    # of the equation 
    num = (avg * (n + k)) - sum; 
    den = k; 
  
    # If not divisible then X is 
    # not an integer 
    # it is a floating ponumber 
    if (num % den != 0): 
        return -1; 
  
    # Return X 
    return (int)(num / den); 
  
# Driver code 
k = 3; avg = 4; 
arr = [2, 7, 3] ; 
n = len(arr); 
  
print(findMissing(arr, n, k, avg)); 
  
# This code is contributed by 29AjayKumar 

