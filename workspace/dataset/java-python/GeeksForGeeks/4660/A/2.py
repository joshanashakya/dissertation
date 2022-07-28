

# Python3 program to check if characters of  
# a string follow pattern defined by given pattern. 
def followsPattern(string, pattern): 
  
    # Insert all characters of pattern in a hash set, 
    patternSet = set() 
  
    for i in range(len(pattern)): 
        patternSet.add(pattern[i]) 
  
    # Build modified string (string with characters  
    # only from pattern are taken) 
    modifiedString = string 
    for i in range(len(string) - 1, -1, -1): 
        if not modifiedString[i] in patternSet: 
            modifiedString = modifiedString[:i] + \ 
                             modifiedString[i + 1:] 
  
    # Remove more than one consecutive occurrences  
    # of pattern characters from modified string. 
    for i in range(len(modifiedString) - 1, 0, -1): 
        if modifiedString[i] == modifiedString[i - 1]: 
            modifiedString = modifiedString[:i] + \ 
                             modifiedString[i + 1:] 
  
    # After above modifications, the length of  
    # modified string must be same as pattern length 
    if len(pattern) != len(modifiedString): 
        return False
  
    # And pattern characters must also be same  
    # as modified string characters 
    for i in range(len(pattern)): 
        if pattern[i] != modifiedString[i]: 
            return False
    return True
  
# Driver Code 
if __name__ == "__main__": 
    string = "engineers rock"
    pattern = "er"
    print("Expected: true, Actual:",  
           followsPattern(string, pattern)) 
  
    string = "engineers rock"
    pattern = "egr"
    print("Expected: false, Actual:",  
           followsPattern(string, pattern)) 
  
    string = "engineers rock"
    pattern = "gsr"
    print("Expected: false, Actual:",  
           followsPattern(string, pattern)) 
  
    string = "engineers rock"
    pattern = "eger"
    print("Expected: true, Actual:",  
           followsPattern(string, pattern)) 
  
# This code is conributed by 
# sanjeev2552 

