

# Python 3 program to generate 
# Gould's Sequence 
  
# Function to generate gould's Sequence 
def gouldSequence(n): 
  
    # loop to generate each row 
    # of pascal's Triangle up to nth row 
    for row_num in range (1, n):  
      
        count = 1
        c = 1
  
        # Loop to generate each  
        # element of ith row 
        for i in range (1, row_num): 
            c = c * (row_num - i) / i 
  
            # if c is odd 
            # increment count 
            if (c % 2 == 1): 
                count += 1
  
        # print count of odd elements 
        print(count, end = " ") 
          
# Driver code 
  
# Get n 
n = 16; 
  
# Function call 
gouldSequence(n) 
  
# This code is contributed  
# by Akanksha Rai 

