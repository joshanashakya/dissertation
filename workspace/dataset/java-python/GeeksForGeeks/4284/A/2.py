

# Python3 implementation of the approach  
  
# Function that returns true if  
# given Prufer sequence is valid  
def isValidSeq(a, n) :  
  
    nodes = n + 2;  
  
    # Iterate in the Prufer sequence  
    for i in range(n) : 
  
        # If out of range  
        if (a[i] < 1 or a[i] > nodes) : 
            return False;  
      
    return True;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 4, 1, 3, 4 ];  
      
    n = len(a);  
      
    if (isValidSeq(a, n)) : 
        print("Valid");  
    else : 
        print("Invalid");  
          
# This code is contributed by AnkitRai01 

