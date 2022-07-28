

# Python3 implementation of the approach  
  
# Function to return the bitwise AND  
# of all the odd integers from  
# the range [1, n]  
def bitwiseAndOdd(n) :  
  
    # Initialize result to 1  
    result = 1;  
  
    # Starting from 3, bitwise AND  
    # all the odd integers less  
    # than or equal to n  
    for i in range(3, n + 1, 2) : 
        result = (result & i);  
  
    return result;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 10;  
  
    print(bitwiseAndOdd(n));  
  
# This code is contributed by AnkitRai01 

