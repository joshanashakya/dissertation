

# Python implementation of the approach 
  
# Function to return the GCD 
# of a and b 
def GCD(a, b): 
    if (b == 0): 
        return a; 
    return GCD(b, a % b); 
  
  
# Function to return the count of reachable 
# integers from the given array 
def findReachable(arr, D, A, B, n): 
  
    # GCD of A and B 
    gcd_AB = GCD(A, B); 
  
    # To store the count of reachable integers 
    count = 0; 
    for i in range(n): 
  
        # If current element can be reached 
        if ((arr[i] - D) % gcd_AB == 0): 
            count+=1; 
  
    # Return the count 
    return count; 
  
# Driver code 
arr = [ 4, 5, 6, 7, 8, 9 ]; 
n = len(arr); 
D = 4; A = 4; B = 6; 
  
print(findReachable(arr, D, A, B, n)); 
  
# This code is contributed by 29AjayKumar 

