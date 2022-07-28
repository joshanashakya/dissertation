

# Python3 implementation of above approach  
  
# Function to count total numbers divisible  
# by x but not y in range 1 to N  
def countNumbers(X, Y, N):  
  
    count = 0;  
    for i in range(1, N + 1): 
          
        # Check if Number is divisible  
        # by x but not Y  
        # if yes, Increment count  
        if ((i % X == 0) and (i % Y != 0)):  
            count += 1;  
  
    return count;  
  
# Driver Code  
X = 2; 
Y = 3; 
N = 10;  
print(countNumbers(X, Y, N));  
      
# This code is contributed by mits 

