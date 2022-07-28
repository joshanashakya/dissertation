

# Python3 program to find next greater  
# number than N with exactly one 
# bit different in binary 
# representation of N 
  
# Function to find next greater  
# number than N with exactly  
# one bit different in binary 
# representation of N 
def nextGreater(N): 
  
    power_of_2 = 1;  
    shift_count = 0; 
  
    # It is guaranteed that there  
    # is a bit zero in the number 
    while (True): 
          
        # If the shifted bit is 
        # zero then break 
        if (((N >> shift_count) & 1) % 2 == 0): 
            break; 
  
        # increase the bit shift 
        shift_count += 1; 
  
        # increase the power of 2 
        power_of_2 = power_of_2 * 2; 
  
    # set the lowest bit  
    # of the number 
    return (N + power_of_2); 
  
# Driver code 
N = 11; 
  
# display the next number 
print("The next number is =",  
             nextGreater(N)); 
  
# This code is contributed by mits 

