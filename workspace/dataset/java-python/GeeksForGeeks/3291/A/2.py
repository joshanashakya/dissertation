

# Python3 implementation of the approach 
  
# Function that returns true if the 
# passed character is a digit 
def isDigit(ch): 
    if ch >= '0' and ch <= '9': 
        return True
    return False
  
# Function to return the next index 
# of a non-digit character in the string 
# starting at the index i (returns -1 if 
# no such index is found) 
def nextNonDigit(string, i): 
  
    # If the character at index i is a digit 
    # then skip to the next character 
    while i < len(string) and isDigit(string[i]): 
        i += 1
  
    # If no such index was found 
    if i >= len(string): 
        return -1
    return i 
  
# Function to append str the given number 
# of times to the StringBuilder 
def appendRepeated(sb, string, times): 
    for i in range(times): 
        sb.append(string) 
  
# Function to return the string after 
# performing the given operations 
def findString(string, n): 
  
    # To build the resultant string 
    sb = list() 
  
    # Index of the first non-digit 
    # character in the string 
    startStr = nextNonDigit(string, 0) 
  
    # While there are substrings that 
    # do not consist of digits 
    while startStr != -1: 
  
        # Find the ending of the substring 
        endStr = startStr 
  
        while (endStr + 1 < n and not 
               isDigit(string[endStr + 1])): 
            endStr += 1
  
        # Starting index of the number 
        startNum = endStr + 1
  
        # If no digit appears  
        # after the current substring 
        if startNum == -1: 
            break
  
        # Find the index at which the 
        # current number ends 
        endNum = startNum 
  
        while (endNum + 1 < n and
               isDigit(string[endNum + 1])): 
            endNum += 1
  
        # Parse the number from the substring 
        num = int(string[startNum:endNum + 1]) 
  
        # Repeat the current substring 
        # required number of times 
        appendRepeated(sb, string[startStr:endStr + 1], num) 
  
        # Find the next non-digit character index 
        startStr = nextNonDigit(string, endStr + 1) 
  
    # Return the resultant string 
    sb = ''.join(sb) 
    return sb 
  
# Driver code 
if __name__ == "__main__": 
    string = "g1ee1ks1for1g1e2ks1"
    n = len(string) 
    print(findString(string, n)) 
  
# This code is contributed by 
# sanjeev2552 

