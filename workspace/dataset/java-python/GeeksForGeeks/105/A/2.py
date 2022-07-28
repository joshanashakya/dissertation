

# Python3 implementation of the approach  
  
# Function to return the required count  
def cntSplits(s) : 
  
    # If the splitting is not possible  
    if (s[len(s) - 1] == '1') : 
        return 0;  
  
    # To store the count of zeroes  
    c_zero = 0;  
  
    # Counting the number of zeroes  
    for i in range(len(s)) : 
        c_zero += (s[i] == '0');  
  
    # Return the final answer  
    return int(pow(2, c_zero - 1));  
  
# Driver code  
if __name__ == "__main__" :  
  
    s = "10010";  
  
    print(cntSplits(s)); 
      
# This code is contributed by AnkitRai01 

