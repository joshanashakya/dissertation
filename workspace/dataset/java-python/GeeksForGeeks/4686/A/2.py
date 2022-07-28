

# Python3 implementation of the approach  
  
# Function that checks if the string 
# contain exactly K characters having 
# ASCII value greater than p  
def isValidSubString(r, K, p):  
  
    c = 0
    for i in range(0, len(r)):  
  
        # if ASCII value is  
        # greater than 'p'  
        if ord(r[i]) > p: 
            c += 1
  
    # if count of satisfying  
    # characters is equal to 'K'  
    # then return true  
    if c == K: 
        return True
  
    # otherwise return false  
    else: 
        return False
  
# function to count sub-strings  
def countSubStrings(s, K, p):  
  
    # length of the string  
    l = len(s)  
  
    # count of sub-strings  
    count = 0
  
    # 'i' is the starting  
    # index for the sub-string  
    for i in range(0, l):  
  
        # 'j' is the no. of characters  
        # to include in the sub-string  
        for j in range(K, l - i + 1):  
            r = s[i:i + j]  
  
            # check if the sub-string  
            # satisfies the condition  
            if isValidSubString(r, K, p) == True:  
                count += 1
  
    print(count) 
  
# Driver code  
if __name__ == "__main__":  
  
    s = "abepztydba"
    K, p = 4, 110
  
    countSubStrings(s, K, p)  
  
# This code is contributed by Rituraj Jain 

