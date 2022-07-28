

# Python3 implementation of the approach  
  
# Function that returns true if it is possible to  
# make a binary string consisting of l 0's, m 1's,  
# x "01" sub-sequences and y "10" sub-sequences  
def isPossible(l, m, x, y) : 
      
    if (l * m == x + y) : 
        return True;  
  
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    l = 3; m = 2; x = 4; y = 2;  
  
    if (isPossible(l, m, x, y)) : 
        print("Yes");  
    else : 
        print("No");  
          
# This code is contributed by AnkitRai01 

