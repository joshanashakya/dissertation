

# Python3 implementation of the approach 
  
# Function to return the required sum 
def smallestIndexsum(arr, n): 
  
    # Starting from the last index 
    i = n - 1; 
  
    # Skip all odd elements and find the 
    # index of the righmost even element 
    while (i >= 0 and arr[i] % 2 == 1): 
        i -= 1; 
  
    # To store the requried sum 
    sum = 0; 
    for j in range(0, i + 1): 
        sum += arr[j]; 
  
    return sum; 
  
# Driver code 
if __name__ == '__main__': 
  
    arr = [ 2, 3, 5, 6, 3, 3 ]; 
    n = len(arr); 
  
    print(smallestIndexsum(arr, n)); 
  
# This code is contributed by PrinciRaj1992 

