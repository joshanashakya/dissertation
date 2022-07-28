

# Python3 program to check if  
# we can rearrange a 
# string such that it has alternate  
# 0s and 1s. 
  
# function to check the binary string 
def is_possible(s): 
  
    # length of string 
    l = len(s) 
  
    one = 0
    zero = 0
  
    for i in range(0,l) : 
  
        # count zero's 
        if (s[i] == '0'): 
            zero += 1
  
        # count one's 
        else: 
            one += 1
  
    # if length is even 
    if (l % 2 == 0) : 
        return (one == zero) 
  
    # if length is odd 
    else: 
        return (abs(one - zero) == 1) 
  
# Driver code 
if __name__ == "__main__": 
    s = "100110"
    if (is_possible(s)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# ChitraNayal 

