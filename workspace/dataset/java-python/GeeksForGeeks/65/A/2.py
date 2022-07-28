

# Python3 implementation for the 
# above mentioned recursive approach 
  
# Function to find the maximum subset sum 
def maxSum(p0, p1, a, pos, n) : 
  
    if (pos == n) : 
        if (p0 == p1) : 
            return p0; 
        else : 
            return 0; 
      
    # Ignore the current element 
    ans = maxSum(p0, p1, a, pos + 1, n); 
  
    # including element in partition 1 
    ans = max(ans, maxSum(p0 + a[pos], p1, a, pos + 1, n)); 
  
    # including element in partition 2 
    ans = max(ans, maxSum(p0, p1 + a[pos], a, pos + 1, n)); 
      
    return ans; 
  
# Driver code 
if __name__ == "__main__" : 
  
    # size of the array 
    n = 4; 
    a = [ 1, 2, 3, 6 ]; 
      
    print(maxSum(0, 0, a, 0, n)); 
  
# This code is contributed by AnkitRai01 

