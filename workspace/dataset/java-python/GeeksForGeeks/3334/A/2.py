

# Python 3 implementation of the approach 
  
# Function to return the count  
# of operations required 
def minOperations(n, a, b, c): 
      
    # To store the count of operations 
    ans = 0
    for i in range(n): 
        x = a[i] 
        y = b[i] 
        z = c[i] 
  
        # No operation required 
        if (x == y and y == z): 
            continue
  
        # One operation is required when 
        # any two characters are equal 
        elif (x == y or y == z or x == z): 
            ans += 1
              
        # Two operations are required when 
        # none of the characters are equal 
        else: 
            ans += 2
  
    # Return the minimum count  
    # of operations required 
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    a = "place"
    b = "abcde"
    c = "plybe"
    n = len(a) 
    print(minOperations(n, a, b, c)) 
  
# This code is contributed by 
# Surendra_Gangwar 

