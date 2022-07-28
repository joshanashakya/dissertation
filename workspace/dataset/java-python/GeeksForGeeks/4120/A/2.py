

# Python3 program to check if  
# characters of one string 
# can be swapped to form other 
MAX = 26
  
def targetstring(str1, str2): 
  
    l1 = len(str1) 
    l2 = len(str2) 
  
    # if length is not same print no 
    if (l1 != l2): 
        return False
  
    map = [0] * MAX
  
    # Count frequencies of character  
    # in first string. 
    for i in range (l1): 
        map[ord(str1[i]) - ord('a')] += 1
  
    # iterate through the second string  
    # decrement counts of characters in 
    # second string 
    for i in range(l2) : 
        map[ord(str2[i]) - ord('a')] -= 1
  
        # Since lengths are same, some 
        # value would definitely become 
        # negative if result is false. 
        if (map[ord(str2[i]) - ord('a')] < 0): 
            return False
  
    return True
  
# Driver Code 
if __name__ == "__main__": 
  
    str1 = "geeksforgeeks"
    str2 = "geegeeksksfor"
    if (targetstring(str1, str2)): 
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed by ita_c 

