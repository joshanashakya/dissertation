

# Python3 implementation of the approach  
  
# Function to return the count of unset  
# bits in the binary representation of  
# all the numbers from 1 to n  
def countUnsetBits(n) :  
  
    # To store the count of unset bits  
    cnt = 0;  
  
    # For every integer from the range [1, n]  
    for i in range(1, n + 1) : 
          
        # A copy of the current integer  
        temp = i;  
  
        # Count of unset bits in  
        # the current integer  
        while (temp) : 
  
            # If current bit is unset  
            if (temp % 2 == 0) : 
                cnt += 1;  
  
            temp = temp // 2;  
  
    return cnt;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 5;  
  
    print(countUnsetBits(n));  
      
# This code is contributed by AnkitRai01 

