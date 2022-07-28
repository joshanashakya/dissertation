

# Python3 program to check if a subarray exists 
# with sum greater than the given Array 
  
# Function to check whether there exists 
# a subarray whose sum is greater than 
# or equal to sum of given array elements 
def subarrayPossible(arr, n): 
    # Initialize sum with 0 
    sum = 0; 
  
    # Checking possible prefix subarrays. 
    # If sum of them is less than or equal 
    # to zero, then return 1 
    for i in range(n): 
        sum += arr[i]; 
  
        if (sum <= 0): 
            return True; 
      
  
    # again reset sum to zero 
    sum = 0; 
  
    # Checking possible suffix subarrays. 
    # If sum of them is less than or equal 
    # to zero, then return 1 
    for i in range(n-1, -1,-1): 
        sum += arr[i]; 
  
        if (sum <= 0): 
            return True; 
      
  
    # Otherwise return 0 
    return False; 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [ 10, 5, -12, 7, -10, 20, 30, -10, 50, 60 ]; 
  
    size = len(arr); 
  
    if (subarrayPossible(arr, size)): 
        print("Yes"); 
    else: 
        print("No"); 
  
# This code is contributed by Princi Singh 

