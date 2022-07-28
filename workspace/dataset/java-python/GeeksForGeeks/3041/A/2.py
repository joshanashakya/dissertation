

# Python3 implementation of the approach 
  
# Function to return the count of sub-arrays 
# in the given permutation of first n natural 
# numbers such that their median is m 
def segments(n, p, m): 
  
    c = dict() 
  
    c[0] = 1
  
    has = False
  
    Sum = 0
  
    ans = 0
  
    for r in range(n): 
  
        # If element is less than m 
        if (p[r] < m): 
            Sum -= 1
  
        # If element greater than m 
        elif (p[r] > m): 
            Sum += 1
  
        # If m is found 
        if (p[r] == m): 
            has = True
  
        # Count the answer 
        if (has): 
            if(Sum in c.keys()): 
                ans += c[Sum] 
            if Sum-1 in c.keys(): 
                ans += c[Sum - 1]  
  
        # Increment Sum 
        else: 
            c[Sum] = c.get(Sum, 0) + 1
  
    return ans 
  
# Driver code 
a = [2, 4, 5, 3, 1] 
n = len(a) 
m = 4
print(segments(n, a, m)) 
  
# This code is contributed by mohit kumar 

