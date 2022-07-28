

# Python implementation of the approach 
  
# Function that returns true if s1  
# is equal to reverse of s2 
def isReverseEqual(s1, s2): 
  
    # If both the strings differ in length 
    if len(s1) != len(s2): 
        return False
      
    l = len(s1) 
  
    for i in range(l): 
  
        # In case of any character mismatch 
        if s1[i] != s2[l-i-1]: 
            return False
    return True
  
# Function to return the first word whose  
# reverse is also present in the array 
def getWord(str, n): 
  
    # Check every string 
    for i in range(n-1): 
  
        # Pair with every other string 
        # appearing after the current string 
        for j in range(i+1, n): 
  
            # If first string is equal to the 
            # reverse of the second string 
            if (isReverseEqual(str[i], str[j])): 
                return str[i] 
      
    # No such string exists 
    return "-1"
  
  
# Driver code 
if __name__ == "__main__": 
    str = ["geeks", "for", "skeeg"] 
    print(getWord(str, 3)) 
  
# This code is contributed by 
# sanjeev2552 

