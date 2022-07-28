

# Python3 program to find minimum number 
# of swap operations required 
  
# Function that prminimum number 
# of swap operations required 
def MinimumSwapOperations(s): 
    zero_exist = False
    multiple_of_2 = False
    sum = 0
    index_of_zero = 0
    more_zero = False
  
    for i in range(len(s)): 
        val = ord(s[i]) - ord('0') 
  
        # Condition if more than one 
        # zero exist 
        if (zero_exist == True): 
            more_zero = True
  
        # Condition if zero_exist 
        if (val == 0): 
            zero_exist = True
            index_of_zero = i 
  
        # Computing total sum of all digits 
        sum += val 
  
    # Condition if zero does not exist or 
    # the sum is not divisible by 3 
    if (zero_exist == False or sum % 3 != 0): 
        print("-1") 
        return
  
    for i in range(len(s)): 
        val = ord(s[i]) - ord('0') 
  
        # Condition to find a digit that is 
        # multiple of 2 other than one zero 
        if (val % 2 == 0 and i != index_of_zero): 
            multiple_of_2 = True
  
    # Condition if multiple of 2 
    # do not exist 
    if (multiple_of_2 == False): 
        print("-1") 
        return
  
    last_val = ord(s[len(s) - 1]) - ord('0') 
    second_last_val = ord(s[len(s) - 2])- ord('0') 
  
    # Condition for zero swaps 
    # means the number is already 
    # is divisible by 60 
    if (last_val == 0
        and second_last_val % 2 == 0): 
        print(0) 
  
    # Condition for only one swap 
    elif ((last_val == 0
            and second_last_val % 2 != 0) 
            or (last_val % 2 == 0
                and second_last_val == 0)): 
        print(1) 
  
    elif (more_zero == True
            and (last_val == 0
                and second_last_val % 2 != 0)): 
        print(1) 
  
    # Otherwise 2 swaps required 
    else: 
        print(2) 
  
# Driver Code 
if __name__ == '__main__': 
    N = "20"
  
    MinimumSwapOperations(N) 
  
# This code is contributed by mohit kumar 29 

