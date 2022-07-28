

# Python 3 program to find K'th character  
# in decrypted string 
  
# Function to find K'th character  
# in Encoded String 
def encodedChar(str, k): 
      
    # expand string variable is used  
    # to store final string after  
    # decompressing string str 
    expand = "" 
  
    # Current substring 
    freq = 0 # Count of current substring 
    i = 0
    while(i < len(str)): 
        temp = "" # Current substring 
        freq = 0 # count frequency of current substring 
  
        # read characters untill you find  
        # a number or end of string 
        while (i < len(str) and
               ord(str[i]) >= ord('a') and 
               ord(str[i]) <= ord('z')): 
                     
            # push character in temp 
            temp += str[i] 
            i += 1
  
        # read number for how many times string temp 
        # will be repeated in decompressed string 
        while (i < len(str) and 
               ord(str[i]) >= ord('1') and
               ord(str[i]) <= ord('9')): 
                     
            # generating frequency of temp 
            freq = freq * 10 + ord(str[i]) - ord('0') 
            i += 1
  
        # now append string temp into expand 
        # equal to its frequency 
        for j in range(1, freq + 1, 1): 
            expand += temp 
  
    # this condition is to handle the case 
    # when string str is ended with alphabeds 
    # not with numeric value 
    if (freq == 0): 
        expand += temp 
  
    return expand[k - 1] 
  
# Driver Code 
if __name__ == '__main__': 
    str = "ab4c12ed3"
    k = 21
    print(encodedChar(str, k)) 
  
# This code is contributed by 
# Shashank_Sharma 

