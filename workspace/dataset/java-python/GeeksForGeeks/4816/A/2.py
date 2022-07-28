

# Python3 program to generate  
# hailstone numbers and  
# calculate steps required  
# to reduce them to 1 
  
# function to print hailstone  
# numbers and to calculate  
# the number of steps required 
def HailstoneNumbers(N, c): 
    print(N, end = " "); 
    if (N == 1 and c == 0): 
          
        # N is initially 1. 
        return c; 
    elif (N == 1 and c != 0): 
          
        # N is reduced to 1. 
        c = c + 1; 
    elif (N % 2 == 0): 
          
        # If N is Even. 
        c = c + 1; 
        c = HailstoneNumbers(int(N / 2), c); 
    elif (N % 2 != 0): 
          
        # N is Odd. 
        c = c + 1; 
        c = HailstoneNumbers(3 * N + 1, c); 
    return c; 
  
# Driver Code 
N = 7; 
  
# Function to generate  
# Hailstone Numbers 
x = HailstoneNumbers(N, 0); 
  
# Output: Number of Steps 
print("\nNumber of Steps: ", x); 
  
# This code is contributed 
# by mits 

