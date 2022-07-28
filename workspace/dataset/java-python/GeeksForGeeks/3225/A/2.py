

# Python3 implementation of the approach 
def calculateCycleOperations(length): 
  
    cycle_operations = 0
    while length > 0:  
        length //= 3
        cycle_operations += 1
      
    return cycle_operations - 1
  
# Function to return the minimum  
# operations required 
def minimumOperations(p, n): 
  
    # Array to keep track of visited elements 
    visited = [0] * (n + 1)  
  
    # To store the final answer 
    ans = 0
  
    # Looping through all the elements 
    for i in range(1, n + 1):  
  
        # Current element 
        ele = p[i] 
  
        # If current element is not present in the 
        # previous cycles then only consider this 
        if not visited[ele]:  
  
            # Mark current element visited so that it 
            # will not be considered in other cycles 
            visited[ele] = 1
  
            # To store the length of each cycle 
            length = 1
            ele = p[ele] 
  
            # Calculating cycle length 
            while not visited[ele]:  
                visited[ele] = 1
                length += 1
                ele = p[ele] 
              
            # Operations needed for this cycle to 
            # reduce to length 1 (if possible) 
            operations = calculateCycleOperations(length) 
  
            # Checking cycle length to be power 
            # of 3 if not, then return -1 
            num = pow(3, operations) 
            if num != length:  
                return -1
  
            # Taking maximum of the operations 
            ans = max(ans, operations) 
          
    return ans 
  
# Driver code 
if __name__ == "__main__": 
  
    # 1-based indexing 
    P = [-1, 4, 6, 5, 3, 2, 7, 8, 9, 1]  
    n = len(P) - 1
  
    # Calling function 
    print(minimumOperations(P, n)) 
  
# This code is contributed by Rituraj Jain 

