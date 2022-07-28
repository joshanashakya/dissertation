

# Python3 program to print good  
# numbers in a given range [L, R] 
  
# Function to check whether n is  
# a good number and doesn't contain 
# digit 'd' 
def isValid(n, d): 
      
    # Get last digit and initialize 
    # sum from right side 
    digit = n % 10; 
    sum = digit; 
  
    # If last digit is d, return 
    if (digit == d): 
        return False; 
  
    # Traverse remaining digits 
    n = int(n / 10); 
    while (n > 0): 
          
        # Current digit 
        digit = n % 10; 
      
        # If digit is d or digit is  
        # less than or equal to sum  
        # of digits on right side 
        if(digit == d or digit <= sum): 
            return False; 
              
        # Update sum and n 
        else: 
            sum += digit; 
            n = int(n / 10); 
    return True; 
      
# Print Good numbers in range [L, R] 
def printGoodNumber(L, R, d): 
      
    # Traverse all numbers  
    # in given range 
    for i in range(L, R + 1): 
          
        # If current numbers is good, 
        # print it 
        if(isValid(i, d)): 
            print(i, end = " "); 
      
# Driver Code 
L = 410; 
R = 520; 
d = 3; 
          
# Print good numbers in [L, R] 
printGoodNumber(L, R, d); 
  
# This code is contributed by mits 

