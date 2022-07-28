

# Python3 implementation of the approach  
  
# Function to return the encrypted string  
def encryptString(string, n):  
  
    i, cnt = 0, 0
    encryptedStr = ""  
  
    while i < n:  
  
        # Number of times the current  
        # character will be repeated  
        cnt = i + 1
  
        # Repeat the current character  
        # in the encrypted string  
        while cnt > 0:  
            encryptedStr += string[i] 
            cnt -= 1
              
        i += 1
  
    return encryptedStr  
  
# Driver code  
if __name__ == "__main__": 
  
    string = "geeks"
    n = len(string)  
    print(encryptString(string, n)) 
  
# This code is contributed  
# by Rituraj Jain 

