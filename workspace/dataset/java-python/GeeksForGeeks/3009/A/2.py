

# Python3 implementation of above apporach 
N = 4; 
  
# Function to count steps in 
# conversion of matrix into upper 
# Hessenberg matrix 
def stepsRequired(arr): 
    result = 0; 
    for i in range(N): 
  
        for j in range(N): 
  
            # if element is below sub-diagonal 
            # add abs(element) into result 
            if (i > j + 1): 
                result += abs(arr[i][j]); 
  
    return result; 
  
# Driver code 
arr =   [[1, 2, 3, 4], 
         [3, 1, 0, 3], 
         [3, 2, 1, 3], 
         [-3, 4, 2, 1]]; 
  
# Function call 
print(stepsRequired(arr)); 
  
# This code is contributed by Rajput-Ji 

