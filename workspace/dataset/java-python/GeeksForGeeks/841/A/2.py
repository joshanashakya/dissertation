

# Python3 program to find  
# the largest fraction a/b  
# such that a+b is equal to 
# given number and a < b. 
import math 
  
def solve(n): 
      
    # Calculate N/2; 
    a = float(n / 2); 
  
    # Check if N is odd or even 
    if (n % 2 != 0):  
  
        # If N is odd answer  
        # will be ceil(n/2)-1  
        # and floor(n/2)+1 
        print((math.ceil(a) - 1),  
              (math.floor(a) + 1)); 
    else: 
  
        # If N is even check if N/2 
        # i.e a is even or odd 
        if (a % 2 == 0): 
  
            # If N/2 is even apply 
            # the previous formula 
            print((math.ceil(a) - 1), 
                  (math.floor(a) + 1)); 
          
        else: 
              
            # If N/2 is odd answer 
            # will be ceil(N/2)-2  
            # and floor(N/2)+2 
            print((math.ceil(a) - 2), 
                  (math.floor(a) + 2)); 
  
# Driver Code 
n = 34; 
solve(n); 
      
# This code is contributed by mits 

