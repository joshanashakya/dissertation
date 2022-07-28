

# Python3 implementation of the above approach  
  
# Function to return the required array  
def getArray(n) :  
  
    ans = [];  
  
    # Store the power of 2  
    p2 = 1;  
  
    # while n is greater than 0  
    while (n > 0) : 
          
        # if there is 1 in binary  
        # representation  
        if (n & 1) : 
            ans.append(p2);  
  
        # Divide n by 2  
        # Multiply p2 by 2  
        n >>= 1;  
        p2 *= 2;  
  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 15;  
  
    # Get the answer  
    ans = getArray(n);  
  
    # Printing the array  
    for i in ans : 
        print(i, end = " ");  
  
# This code is contributed by AnkitRai01 

