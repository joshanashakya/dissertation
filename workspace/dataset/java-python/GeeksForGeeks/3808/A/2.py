

# Python3 program to find number of 
# Quadruples from four arrays such 
# that their XOR equals to 'x' 
  
# Function to return the number of 
# Quadruples with XOR equals to x 
# such that every element of Quadruple  
# is from different array. 
def findQuadruples(a, b, c, d, x, n): 
  
    count = 0
    for i in range(n): 
        for j in range(n): 
            for k in range(n): 
                for l in range(n): 
  
                    # Check whether XOR is equal to x 
                    if ((a[i] ^ b[j] ^ c[k] ^ d[l]) == x): 
                        count += 1
    return count 
  
# Driver Code 
x = 3
a = [0, 1] 
b = [2, 0] 
c = [0, 1] 
d = [0, 1] 
n = len(a) 
print(findQuadruples(a, b, c, d, x, n)) 
  
# This code is contributed by Anant Agarwal. 

