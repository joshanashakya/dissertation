

# Python 3 program to print  
# binary right angle triangle. 
  
# function to print binary  
# right angle triangle 
def binaryRightAngleTriangle(n): 
  
    # declare row and column 
    for row in range(0, n):  
      
        for col in range(0, row + 1):  
          
            if (((row + col) % 2) == 0) : 
                print("0", end = "") 
            else: 
                print("1", end = "") 
            print("\t", end = "") 
          
        print("") 
      
# Driver Code 
# no. of rows to be printed 
n = 4
binaryRightAngleTriangle(n) 
  
# This code is contributed 
# by Smitha 

