

# Python3 program to prtable 
# of a number using recursion 
  
# Function that prthe 
# table of a given number 
# using recursion 
def mul_table(N, i): 
      
    # Base Case 
    if (i > 10): 
        return
      
    # Print the table for 
    # current iteration 
    print(N,"*",i,"=",N * i) 
      
    # Recursive call to next 
    # iteration 
    return mul_table(N, i + 1) 
  
# Driver Code 
  
# Input number whose table 
# is to print 
N = 8
  
# Function call to print 
# the table 
mul_table(N, 1) 
  
# This is contributed by shubhamsingh10 

