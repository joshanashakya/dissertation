

# Python3 program to implement 
# the above approach 
  
# Function to find the leftmost 
# unset bit in a number. 
def find_leftmost_unsetbit(n): 
    ind = -1; 
    i = 1; 
    while (n): 
        if ((n % 2) != 1): 
            ind = i; 
  
        i += 1; 
        n >>= 1; 
    return ind; 
  
# Function that perform 
# the step 
def perform_steps(n): 
  
    # Find the leftmost unset bit 
    left = find_leftmost_unsetbit(n); 
  
    # If the number has no bit 
    # unset, it means it is in form 2^x -1 
    if (left == -1): 
        print("No steps required"); 
        return; 
  
    # Count the steps 
    step = 1; 
  
    # Iterate till number is of form 2^x - 1 
    while (find_leftmost_unsetbit(n) != -1): 
  
        # At even step increase by 1 
        if (step % 2 == 0): 
            n += 1; 
            print("Step" , step ,  
                  ": Increase by 1\n"); 
  
        # Odd step xor with any 2^m-1 
        else: 
  
            # Find the leftmost unset bit 
            m = find_leftmost_unsetbit(n); 
  
            # 2^m-1 
            num = (2**m) - 1; 
  
            # Perform the step 
            n = n ^ num; 
  
            print("Step" , step,  
                  ": Xor with" , num ); 
  
        # Increase the steps 
        step += 1; 
  
# Driver code 
n = 39; 
perform_steps(n); 
  
# This code contributed by PrinciRaj1992  

