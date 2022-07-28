

# Python3 implementation of the approach 
  
# Function that returns true if  
# it is possible to divide the grid  
# satisfying the given conditions 
def isPossible(arr, p, n, m): 
      
    # To store the sum of all the 
    # cells of the given parts 
    sum = 0; 
    for i in range(p): 
        sum += arr[i]; 
  
    # If the sum is equal to the total number 
    # of cells in the given grid 
    if (sum == (n * m)): 
        return True; 
    return False; 
  
# Driver code 
if __name__ == '__main__': 
  
    n = 3; 
    m = 4; 
    arr = [6, 3, 2, 1]; 
    p = len(arr); 
  
    if (isPossible(arr, p, n, m)): 
        print("Yes"); 
    else: 
        print("No"); 
  
# This code is contributed by Rajput-Ji 

