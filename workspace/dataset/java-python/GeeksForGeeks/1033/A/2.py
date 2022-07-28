

# Python3 program to find 
# n-th number containing 
# only 4 and 7. 
def reverse(s): 
    if len(s) == 0: 
        return s 
    else: 
        return reverse(s[1:]) + s[0] 
          
def findNthNo(n): 
    res = ""; 
    while (n >= 1): 
          
        # If n is odd, append 
        # 4 and move to parent 
        if (n & 1): 
            res = res + "4"; 
            n = (int)((n - 1) / 2); 
              
            # If n is even, append7 
            # and move to parent 
        else: 
            res = res + "7"; 
            n = (int)((n - 2) / 2); 
              
    # Reverse res 
    # and return. 
    return reverse(res); 
  
# Driver code 
n = 13; 
print(findNthNo(n)); 
  
# This code is contributed 
# by mits 

