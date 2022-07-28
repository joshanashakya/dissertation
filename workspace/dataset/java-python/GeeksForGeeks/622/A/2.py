

# Python3 implementation of the approach 
  
# Function to return the number of 
# subarrays with sum atleast k 
def k_sum(a, n, k): 
      
    # To store the right index 
    # and the current sum 
    r, sum = 0, 0; 
  
    # To store the number of sub-arrays 
    ans = 0; 
  
    # For all left indexes 
    for l in range(n): 
  
        # Get elements till current sum 
        # is less than k 
        while (sum < k): 
            if (r == n): 
                break; 
            else: 
                sum += a[r]; 
                r += 1; 
  
        # No such subarray is possible 
        if (sum < k): 
            break; 
  
        # Add all possible subarrays 
        ans += n - r + 1; 
  
        # Remove the left most element 
        sum -= a[l];  
    # Return the required answer 
    return ans; 
  
# Driver code 
a = [ 6, 1, 2, 7 ]; k = 10; 
n = len(a); 
  
print(k_sum(a, n, k)); 
  
# This code contributed by PrinciRaj1992 

