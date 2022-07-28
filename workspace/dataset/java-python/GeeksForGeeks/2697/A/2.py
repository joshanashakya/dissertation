

# Python3 implementation to count the 
# substrings whose decimal equivalent 
# is greater than or equal to K 
  
# Function to count number of 
# substring whose decimal equivalent 
# is greater than or equal to K 
def countSubstr(s, k): 
  
    n = len(s) 
  
    # Left pointer of the substring 
    l = n - 1
  
    # Right pointer of the substring 
    r = n - 1
    arr = [0]*n 
    last_indexof1 = -1
  
    # Loop to maintain the last 
    # occurence of the 1 in the string 
    for i in range(n): 
        if (s[i] == '1'): 
            arr[i] = i 
            last_indexof1 = i 
  
        else: 
            arr[i] = last_indexof1 
  
    # Variable to count the substring 
    no_of_substr = 0
  
    # Loop to maintain the every 
    # possible end index of the substring 
    for r in range(n - 1, -1, -1): 
        l = r 
  
        # Loop to find the substring 
        # whose decimal equivalent is 
        # greater than or equal to K 
        while (l >= 0 and (r - l + 1) <= 64 and int(s[l:r + 1], 2)< k): 
            l -= 1
  
        # Condition to check no 
        # of bits is out of bound 
        if (r - l + 1 <= 64): 
            no_of_substr += l + 1
        else: 
            no_of_substr += arr[l + 1] + 1
  
    return no_of_substr 
  
# Driver Code 
  
s = "11100"
k = 3
print(countSubstr(s, k)) 
  
# This code is contributed by mohit kumar 29 

