

# Python 3 implementation of the approach 
  
# Function that returns 1 if str is valid 
def isValidString(str, n): 
  
    # Index of first appearance of 'b' 
    idx = str.find("b") 
  
    # If str starts with 'b' 
    if (idx == 0): 
        return False
  
    # While 'b' occurs in str 
    while (idx != -1): 
  
        # If 'b' doesn't appear after an 'a' 
        if (str[idx - 1] != 'a'): 
            return False
  
        # If 'b' is not succeeded by another 'b' 
        if (idx + 1 < n and str[idx + 1] != 'b'): 
            return False
  
        # If sub-string is of the type "abbb" 
        if (idx + 2 < n and str[idx + 2] == 'b'): 
            return False
  
        # If str ends with a single b 
        if (idx == n - 1): 
            return False
  
        idx = str.find("b", idx + 2) 
  
    return True
  
# Driver code 
if __name__ == "__main__": 
  
    str = "abbaaabbabba"
    n = len(str) 
    print(isValidString(str, n)) 
  
# This code is contributed by ita_c 

