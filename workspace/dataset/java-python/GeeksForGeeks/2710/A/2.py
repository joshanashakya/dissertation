

# Python 3 program to reduce the string  
# by removing the characters which 
# appears less than k times 
MAX_CHAR = 26
  
# Function to reduce the string by 
# removing the characters which 
# appears less than k times 
def removeChars(str, k): 
  
    # Hash table initialised to 0 
    hash = [0] * (MAX_CHAR) 
  
    # Increment the frequency of  
    # the character 
    n = len(str) 
    for i in range(n): 
        hash[ord(str[i]) - ord('a')] += 1
  
    # create a new empty string 
    res = "" 
    for i in range(n): 
  
        # Append the characters which 
        # appears more than equal to k times 
        if (hash[ord(str[i]) - ord('a')] >= k) : 
            res += str[i] 
  
    return res 
  
# Driver Code 
if __name__ == "__main__": 
      
    str = "geeksforgeeks"
    k = 2
  
    print(removeChars(str, k)) 
  
# This code is contributed by ita_c 

