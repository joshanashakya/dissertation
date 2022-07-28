

# Python3 implementation of the approach 
  
# Function to return the 
# number of positive area triangles 
def countTriangles(a, n): 
  
    # To store the count of 
    # total triangles 
    cnt = 0
  
    # To store the count of pairs of sticks 
    # with equal lengths 
    pairs = 0
  
    # Back-traverse and count 
    # the number of triangles 
    for i in range(n - 1, -1, -1): 
  
        # Count the number of pairs 
        pairs += a[i] // 2
  
        # If we have one remaining stick 
        # and we have a pair 
        if (a[i] % 2 == 1 and pairs > 0): 
  
            # Count 1 triangle 
            cnt += 1
  
            # Reduce one pair 
            pairs -= 1
          
    # Count the remaining triangles 
    # that can be formed 
    cnt += (2 * pairs) // 3
    return cnt 
  
# Driver code 
a = [1, 2, 2, 2, 2] 
n = len(a) 
print(countTriangles(a, n)) 
  
# This code is contributed by mohit kumar 

