

# Python3 implementation of the approach  
NumUnsignBits = 64;  
  
# Function to return the number  
# closest to x which has equal  
# number of set bits as x  
def findNum(x) :  
  
    # Loop for each bit in x and  
    # compare with the next bit  
    for i in range(NumUnsignBits - 1) : 
        if (((x >> i) & 1) != ((x >> (i + 1)) & 1)) : 
            x ^= (1 << i) | (1 << (i + 1));  
            return x; 
  
# Driver code  
if __name__ == "__main__" :  
    n = 92;  
    print(findNum(n));  
  
# This code is contributed by AnkitRai01 

