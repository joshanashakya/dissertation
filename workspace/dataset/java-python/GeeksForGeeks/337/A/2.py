

# Python3 implementation of the approach 
  
# Function to check if X and Y 
# can be made equal to zero by 
# using given operation any number of times 
def ifPossible(X, Y): 
    if (X > Y): 
        X, Y = Y, X 
  
    # Check for the two conditions 
    if ((X + Y) % 5 == 0 and 3 * X >= 2 * Y): 
        print("Yes") 
    else: 
        print("No") 
  
# Driver code 
X = 33
Y = 27
  
ifPossible(X, Y) 
  
# This code is contributed by mohit kumar 29 

