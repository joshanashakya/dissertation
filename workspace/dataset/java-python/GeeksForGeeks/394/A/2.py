

# Python3 program to transform N to the minimum value 
import sys; 
  
# Intialising the answer 
min_val = sys.maxsize; 
min_steps = 0; 
  
# Function to find the digitsum 
def sumOfDigits(n) : 
  
    s = str(n); 
  
    sum = 0; 
  
    # Iterate over all digits and add them 
    for i in range(len(s)) : 
        sum += (ord(s[i]) - ord('0')); 
      
    # Return the digit su, 
    return sum; 
  
# Function to transform N to the minimum value 
def Transform(n, d, steps) : 
    global min_val;global min_steps; 
      
    # If the final value is lesser than least value 
    if (n < min_val) : 
        min_val = n; 
        min_steps = steps; 
  
    # If final value is equal to least value then check  
    # for lesser number of steps to reach this value 
    elif (n == min_val) : 
        min_steps = min(min_steps, steps); 
      
    # The value will be obtained in less than 15 steps as  
    # proved so applying normal recursive operations 
    if (steps < 15) : 
        Transform(sumOfDigits(n), d, steps + 1); 
        Transform(n + d, d, steps + 1); 
  
# Driver code 
if __name__ == "__main__" : 
  
    N = 9; D = 3; 
      
    # Function call 
    Transform(N, D, 0); 
      
    # Print the answers 
    print(min_val, min_steps); 
      
# This code is contributed by Yash_R 

