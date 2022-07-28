

# Python3 implementation of the approach  
  
# Function to check if parity  
# can be made same or not  
def flipsPossible(a, n) :  
  
    count_odd = 0; count_even = 0;  
  
    # Iterate and count the parity  
    for i in range(n) : 
  
        # Odd  
        if (a[i] & 1) : 
            count_odd += 1;  
  
        # Even  
        else : 
            count_even += 1;  
  
    # Condition check  
    if (count_odd % 2 and count_even % 2) : 
        return False;  
    else : 
        return True;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    a = [ 1, 0, 1, 1, 0, 1 ];  
      
    n = len(a);  
  
    if (flipsPossible(a, n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

