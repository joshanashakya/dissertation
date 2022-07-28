

# python3 implementation of the approach 
MAX=256
  
# Function to return the lexicographically 
# smallest after swapping all the 
# occurrences of any two characters 
def smallestStr(str, n): 
    i, j=0,0
    # To store the first index of 
    # every character of str 
    chk=[0 for i in range(MAX)] 
    for i in range(MAX): 
        chk[i] = -1
  
    # Store the first occurring 
    # index every character 
    for i in range(n): 
  
        # If current character is appearing 
        # for the first time in str 
        if (chk[ord(str[i])] == -1): 
            chk[ord(str[i])] = i 
  
    # Starting from the leftmost character 
    for  i in range(n): 
        flag = False
  
        # For every character smaller than ord(str[i]) 
        for j in range(ord(str[i])): 
  
            # If there is a character in str which is 
            # smaller than ord(str[i]) and appears after it 
            if (chk[j] > chk[ord(str[i])]): 
                flag = True
                break
  
  
        # If the required character pair is found 
        if (flag): 
            break
  
    # If swapping is possible 
    if (i < n): 
  
        # Characters to be swapped 
        ch1 = (str[i]) 
        ch2 = chr(j) 
  
        # For every character 
        for i in range(n): 
  
            # Replace every ch1 with ch2 
            # and every ch2 with ch1 
            if (str[i] == ch1): 
                str[i] = ch2 
  
            elif (str[i] == ch2): 
                str[i] = ch1 
  
    return "".join(str) 
  
  
# Driver code 
  
st = "ccad"
str=[i for i in st] 
n = len(str) 
  
print(smallestStr(str, n)) 

