

# Python3 Program to count the number 
# of digits that can be removed such 
# that number is divisible by 10^K 
  
# function to return the required 
# number of digits to be removed 
def countDigitsToBeRemoved(N, K): 
  
    # Converting the given number 
    # into string 
    s = str(N); 
  
    # variable to store number of 
    # digits to be removed 
    res = 0; 
  
    # variable to denote if atleast 
    # one zero has been found 
    f_zero = 0; 
    for i in range(len(s) - 1, -1, -1): 
        if (K == 0): 
            return res; 
        if (s[i] == '0'): 
  
            # zero found 
            f_zero = 1; 
            K -= 1; 
        else: 
            res += 1; 
  
    # return size - 1 if K is not zero and 
    # atleast one zero is present, otherwise 
    # result 
    if (K == 0): 
        return res; 
    elif (f_zero > 0): 
        return len(s) - 1; 
    return -1; 
  
# Driver Code 
N = 10904025; 
K = 2; 
print(countDigitsToBeRemoved(N, K)); 
  
N = 1000; 
K = 5; 
print(countDigitsToBeRemoved(N, K)); 
  
N = 23985; 
K = 2; 
print(countDigitsToBeRemoved(N, K)); 
      
# This code is contributed by mits 

