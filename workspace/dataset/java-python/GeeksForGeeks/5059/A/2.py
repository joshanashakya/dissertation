

# Python3 implementation of the approach 
  
# Function to pre-calculate the left[] array 
def preCalculate(binary, n, left): 
  
    count1, count0 = 0, 0
  
    # Iterate in the binary array 
    for i in range(n): 
  
        # Initialize the number 
        # of 1 and 0 
        left[i][0] = count1 
        left[i][1] = count0 
  
        # Increase the count 
        if (binary[i]): 
            count1 += 1
        else: 
            count0 += 1
  
# Driver code 
binary = [1, 1, 1, 0, 0, 1, 0, 1, 1] 
  
n = len(binary) 
  
left = [[ 0 for i in range(2)] 
            for i in range(n)] 
  
preCalculate(binary, n, left) 
  
queries = [0, 1, 2, 4 ] 
  
q = len(queries) 
  
# Solve queries 
for i in range(q): 
    print(left[queries[i]][0], "ones",  
          left[queries[i]][1], "zeros") 
  
# This code is contributed  
# by mohit kumar 

