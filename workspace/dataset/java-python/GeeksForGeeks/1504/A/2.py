

# Python3 implementation of the approach 
  
# Function to return the requried digit 
def find_digit(s, n): 
  
    # To store the position of the first 
    # numeric digit in the string 
    first_digit = -1
    for i in range(n - 1, -1, -1): 
        if s[i] < '0' or s[i] > '9': 
            first_digit = i 
            break
  
    first_digit += 1
  
    # To store the length of the 
    # string without the numeric 
    # digits in the end 
    s_len = first_digit 
    num = 0
    pw = 1
    i = n - 1
    while i >= 0: 
  
        # If current character is 
        # a numeric digit 
        if s[i] >= '0' and s[i] <= '9': 
  
            # Get the current digit 
            digit = ord(s[i]) - ord('0') 
  
            # Build the number 
            num = num + (pw * digit) 
  
            # If number exceeds the length 
            if num >= s_len: 
                return -1
  
            # Next power of 10 
            pw = pw * 10
  
        i -= 1
  
    # Append 0 in the end 
    num = num * 10
  
    # Required number that must be added 
    req = s_len - num 
  
    # If number is not a single digit 
    if req > 9 or req < 0: 
        return -1
    return req 
  
# Driver code 
if __name__ == "__main__": 
    s = "abcd0"
    n = len(s) 
    print(find_digit(s, n)) 
  
# This code is contributed by 
# sanjeev2552 

