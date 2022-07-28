

# Python3 implementation of the approach  
TOTAL_BITS = 32;  
  
# Function that returns true if it is  
# possible to arrange the bits of  
# n in alternate fashion  
def isPossible(n) : 
  
    # To store the count of 1s in the  
    # binary representation of n  
    cnt = bin(n).count('1');  
  
    # If the number set bits and the  
    # number of unset bits is equal  
    if (cnt == TOTAL_BITS // 2) : 
        return True;  
          
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 524280;  
  
    if (isPossible(n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

