

# Python3 implementation of the approach  
  
# Function to return the maximum operations  
# required to convert X to Y  
def maxOperations(X, Y) :  
  
    # X cannot be converted to Y  
    if (X > Y) : 
        return -1;  
  
    diff = Y - X;  
  
    # If the differecne is 1  
    if (diff == 1) : 
        return -1;  
  
    # If the difference is even  
    if (diff % 2 == 0) : 
        return (diff // 2);  
  
    # Add 3 to X and the new  
    # difference will be even  
    return (1 + ((diff - 3) // 2));  
  
# Driver code  
if __name__ == "__main__" :  
  
    X = 5; Y = 16;  
  
    print(maxOperations(X, Y));  
  
# This code is contributed by AnkitRai01 

