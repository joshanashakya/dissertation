

# Python3 program to find N numbers such that 
# their product is a perfect cube 
  
# Function to find the N numbers such 
# that their product is a perfect cube 
def findNumbers(N): 
    i = 1
  
    # Loop to traverse each 
    # number from 1 to N 
    while (i <= N): 
      
        # Print the cube of i 
        # as the ith term of the output 
        print((i * i * i), end=" ") 
  
        i += 1
  
# Driver Code 
if __name__ == '__main__': 
    N = 4
  
    # Function Call 
    findNumbers(N) 
  
# This code is contributed by mohit kumar 29 

