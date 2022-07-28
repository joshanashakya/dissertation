

# Python3 implementation of the approach 
  
# Function that returns true if the 
# current arrangement is valid 
def check(s): 
  
    for i in range(len(s) - 1): 
        if (abs(ord(s[i]) - 
                ord(s[i + 1])) == 1): 
            return False
    return True
  
# Function to rearrange the characters  
# of the such that no two neighbours 
# in the English alphabets appear together 
def Rearrange(Str): 
  
    # To store the odd and the 
    # even positioned characters 
    odd, even = "","" 
  
    # Traverse through the array 
    for i in range(len(Str)): 
        if (ord(Str[i]) % 2 == 0): 
            even += Str[i] 
        else: 
            odd += Str[i] 
  
    # Sort both the Strings 
    odd = sorted(odd) 
    even = sorted(even) 
  
    # Check possibilities 
    if (check(odd + even)): 
        print("".join(odd + even)) 
    elif (check(even + odd)): 
        print("".join(even + odd)) 
    else: 
        print(-1) 
  
# Driver code 
Str = "aabcd"
  
Rearrange(Str) 
  
# This code is contributed 
# by Mohit Kumar 

