

# Python 3 implementation of the approach 
  
# Function to print kth character of 
# String s after decrypting it 
def findKthChar(s, k): 
      
    # Get the length of string 
    len1 = len(s) 
  
    # Initialise pointer to character 
    # of input string to zero 
    i = 0
  
    # Total length of resultant string 
    total_len = 0
  
    # Traverse the string from starting 
    # and check if each character is 
    # alphabet then increament total_len 
    while (i < len1): 
        if (s[i].isalpha()): 
            total_len += 1
  
            # If total_leg equal to k then 
            # return string else increment i 
            if (total_len == k): 
                return s[i] 
  
            i += 1
  
        else: 
              
            # Parse the number 
            n = 0
            while (i < len1 and s[i].isalpha() == False): 
                n = n * 10 + (ord(s[i]) - ord('0')) 
                i += 1
  
            # Update next_total_len 
            next_total_len = total_len * n 
  
            # Get the position of kth character 
            if (k <= next_total_len): 
                pos = k % total_len 
  
                # Position not found then update 
                # position with total_len 
                if (pos == 0): 
                    pos = total_len 
  
                # Recursively find the kth position 
                return findKthChar(s, pos) 
  
            else: 
                  
                # Else update total_len 
                # by next_total_len 
                total_len = next_total_len 
  
    # Return -1 if character not found 
    return -1
  
# Driver code 
if __name__ == '__main__': 
    s = "ab2c3"
    k = 5
  
    print(findKthChar(s, k)) 
      
# This code is contributed by 
# Surendra_Gangwar 

