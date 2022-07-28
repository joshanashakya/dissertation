

# Python3 implementation of the approach 
  
# Function to return the count 
# of pairs with distinct sum 
def countPairs(a, b, n, m): 
  
    # To store the required count 
    cnt = 0
  
    # Set to store the sum 
    # obtained for each pair 
    s=dict() 
  
    for i in range(n): 
        for j in range(m): 
  
            # Sum of the current pair 
            sum = a[i] + b[j] 
  
            # If the sum obtained is distinct 
            if (sum not in s.keys()): 
                # Increment the count 
                cnt+=1
  
                # Insert sum in the set 
                s[sum]=1
  
    return cnt 
  
  
# Driver code 
  
a =[ 12, 2, 7] 
n = len(a) 
b =[ 4, 3, 8 ] 
m = len(b) 
  
print(countPairs(a, b, n, m)) 
  
# This code is contributed by mohit kumar 29 

