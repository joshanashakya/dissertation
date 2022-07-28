

# Python3 implementation of the approach  
  
# Function to return the value x  
# such that (x XOR a) is minimum  
# and the number of set bits in x  
# is equal to the number  
# of set bits in b  
def minVal(a, b) :  
  
    # Count of set-bits in bit  
    setBits = bin(b).count('1');  
    ans = 0;  
  
    for i in range(30, -1, -1) : 
        mask = (1 << i);  
        s = (a & mask);  
  
        # If i'th bit is set also set the  
        # same bit in the required number  
        if (s and setBits > 0) : 
            ans |= (1 << i);  
  
            # Decrease the count of setbits  
            # in b as the count of set bits  
            # in the required number has to be  
            # equal to the count of set bits in b  
            setBits -= 1;  
  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = 3; b = 5;  
  
    print(minVal(a, b));  
  
# This code is contributed by kanugargng 

