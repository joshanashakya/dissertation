

# Python3 implementation of the approach 
# Function to return the extra 
# element in B[] 
def extraElement(A, B, n): 
  
    # To store the result 
    ans = 0; 
  
    # Find the XOR of all the element 
    # of array A[] and array B[] 
    for i in range(n): 
        ans ^= A[i]; 
    for i in range(n + 1): 
        ans ^= B[i]; 
  
    return ans; 
  
# Driver code 
A = [ 10, 15, 5 ]; 
B = [ 10, 100, 15, 5 ]; 
n = len(A); 
  
print(extraElement(A, B, n)); 
  
# This code is contributed by 29AjayKumar 

