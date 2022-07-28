

# Python3 implementation of the approach  
  
# Function that returns true if sub-string  
# of length k starting at index i  
# is also a prefix of the string  
def isPrefix(string, length, i, k):  
      
    # k length sub-string cannot  
    # start at index i  
    if i + k > length:  
        return False
      
    for j in range(0, k):  
  
        # Character mismatch between the prefix  
        # and the sub-string starting at index i  
        if string[i] != string[j]:  
            return False
        i += 1
          
    return True
  
# Function that returns true if  
# str is K-periodic  
def isKPeriodic(string, length, k):  
      
    # Check whether all the sub-strings  
    # str[0, k-1], str[k, 2k-1] ... are equal  
    # to the k length prefix of the string  
    for i in range(k, length, k):  
        if isPrefix(string, length, i, k) == False:  
            return False
    return True
      
# Driver code  
if __name__ == "__main__": 
      
    string = "geeksgeeks"
    length = len(string)  
    k = 5
  
    if isKPeriodic(string, length, k) == True:  
        print("Yes")  
    else: 
        print("No")  
      
# This code is contributed  
# by Rituraj Jain 

