

# Python program to find numbers 
# that divide X and Y 
# to produce the same remainder 
  
# Function to find 
# the required number as M 
def printModulus( X, Y): 
      
    # Finding the maximum 
    # value among X and Y 
    n = max(X, Y) 
  
    # Loop to iterate through 
    # maximum value among X and Y. 
    for i in range(1, n + 1): 
  
        # If the condition satisfies, then 
        # print the value of M 
        if (X % i == Y % i): 
            print(i,end=" ") 
  
# Driver code 
X = 10
Y = 20
printModulus(X, Y) 
  
# This code is contributed by Atul_kumar_Shrivastava 

