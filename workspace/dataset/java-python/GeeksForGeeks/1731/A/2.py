

# Python3 implementation of the approach  
  
# Function to print the Nth digit  
# in the fraction (p / q)  
def findNthDigit(p, q, N) :  
  
    # While N > 0 compute the Nth digit  
    # by dividing p and q and store the  
    # result into variable res  
    # and go to next digit  
    while (N > 0) : 
        N -= 1;  
        p *= 10;  
        res = p // q;  
        p %= q;  
  
    return res;  
  
# Driver code  
if __name__ == "__main__" : 
      
    p = 1; q = 2; N = 1; 
    print(findNthDigit(p, q, N));  
  
# This code is contributed by kanugargng 

