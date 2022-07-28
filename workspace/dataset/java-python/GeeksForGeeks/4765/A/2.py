

# Python3 implementation of the approach 
  
# Function to calculate power of 3 
def calculate(bit_cnt): 
  
    res = 1; 
    while (bit_cnt > 0):  
        bit_cnt -= 1; 
        res = res * 3; 
    return res; 
  
# Function to return the count of the 
# unset bit ( zeros ) 
def unset_bit_count(n): 
  
    count = 0; 
    while (n > 0): 
          
        # Check the bit is 0 or not 
        if ((n & 1) == 0): 
            count += 1; 
              
        # Right shifting ( dividing by 2 ) 
        n = n >> 1; 
      
    return count; 
  
# Driver Code 
if __name__ == '__main__': 
  
    n = 2; 
  
    count = unset_bit_count(n); 
  
    ans = calculate(count); 
  
    print(ans); 
  
# This code contributed by Rajput-Ji 

