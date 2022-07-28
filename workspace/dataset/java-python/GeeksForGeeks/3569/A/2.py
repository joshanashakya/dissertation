

# Python3 program to find XOR of ASCII 
# value of characters in str1ing 
  
# Function to find the XOR of ASCII 
# value of characters in str1ing 
def XorAscii(str1, len1): 
  
    # store value of first character 
    ans = ord(str1[0]) 
  
    for i in range(1,len1): 
  
        # Traverse str1ing to find the XOR 
        ans = (ans ^ (ord(str1[i]))) 
  
    # Return the XOR 
    return ans 
  
# Driver code 
str1 = "geeksforgeeks"
len1 = len(str1) 
print(XorAscii(str1, len1)) 
  
str1 = "GfG"
len1 = len(str1) 
print(XorAscii(str1, len1)) 
  
# This code is contributed by mohit kumar 29 

