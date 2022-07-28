

# Python 3 implementation of the above approach 
  
# Function to find the minimum operations 
def minimumMoves(a, n): 
      
    operations = 0
    # Sort the given array 
    a.sort(reverse = False) 
      
    # Count operations by assigning a[i] = i+1 
    for i in range(0,n,1): 
        operations = operations + abs(a[i] - (i + 1)) 
  
    return operations 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [ 5, 3, 2 ] 
    n = len(arr) 
  
    print(minimumMoves(arr, n)) 
  
# This code is contributed by  
# Surendra_Gangwar 

