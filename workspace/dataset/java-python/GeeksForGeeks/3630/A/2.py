

# Python3 implementation of the approach  
  
# Function that returns true if A can be  
# converted to B with the given operations  
def canConvert(a, b) :  
  
    while (b > a) : 
  
        # If the current number ends with 1  
        if (b % 10 == 1) : 
            b //= 10;  
            continue;  
          
        # If the current number is divisible by 2  
        if (b % 2 == 0) : 
            b /= 2;  
            continue;  
  
        # If the above two conditions fail  
        return false;  
      
    # If it is possible to convert A to B  
    if (b == a) : 
        return True; 
          
    return False;  
  
# Driver code  
if __name__ == "__main__" :  
  
    A = 2; B = 82;  
  
    if (canConvert(A, B)) : 
        print("Yes");  
    else : 
        print("No");  
      
# This code is contributed by AnkitRai01 

