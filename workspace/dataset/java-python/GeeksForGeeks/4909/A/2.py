

# Python3 program to find occurrence  
# of character in substring l to r  
MAX_LEN, MAX_CHAR = 1005, 26
  
# To store count of all character  
cnt = [[0 for i in range(MAX_CHAR)]  
          for j in range(MAX_LEN)]  
  
# To pre-procees string from  
# 0 to size of string  
def preProcess(s):  
  
    n = len(s)  
  
    # Store occurrence of character i  
    for i in range(0, n):  
        cnt[i][ord(s[i]) - ord('a')] += 1
  
    # Store occurrence o  
    # all character upto i  
    for i in range(0, n):  
        for j in range(0, 26):  
            cnt[i][j] += cnt[i - 1][j]  
      
# To return occurrence of  
# character in range l to r  
def findCharFreq(l, r, c):  
  
    # Return occurrence of character  
    # from 0 to r minus its  
    # occurrence from 0 to l  
    return (cnt[r][ord(c) - 97] - 
            cnt[l - 1][ord(c) - 97])  
  
# Driver Code 
if __name__ == "__main__":  
  
    s = "geeksforgeeks"
    Q = 4
    preProcess(s)  
  
    print(findCharFreq(0, 5, 'e'))  
    print(findCharFreq(2, 6, 'f'))  
    print(findCharFreq(4, 7, 'm'))  
    print(findCharFreq(0, 12, 'e'))  
  
# This code is contributed by Rituraj Jain 

