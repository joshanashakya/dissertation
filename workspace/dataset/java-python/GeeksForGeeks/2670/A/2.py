

# Python3 program to find longest possible  
# subsequence anagram of N strings.  
  
# Function to store frequency of  
# each character in each string  
def frequency(fre, s, n):  
  
    for i in range(0, n):  
        string = s[i]  
        for j in range(0, len(string)):  
            fre[i][ord(string[j]) - ord('a')] += 1        
  
# Function to Find longest possible sequence   
# of N strings which is anagram to each other  
def LongestSequence(fre, n):  
  
    # to get lexicographical largest sequence.  
    for i in range(MAX_CHAR-1, -1, -1):  
  
        # find minimum of that character  
        mi = fre[0][i]  
        for j in range(1, n):  
            mi = min(fre[j][i], mi)          
  
        # print that character  
        # minimum number of times  
        while mi:  
            print(chr(ord('a') + i), end = "") 
            mi -= 1
      
# Driver code  
if __name__ == "__main__": 
  
    s = ["loo", "lol", "olive"]  
    n = len(s) 
    MAX_CHAR = 26
  
    # to strore frequency of each  
    # character in each string  
    fre = [[0 for i in range(26)]  
              for j in range(n)]  
  
    # To get frequency of each character  
    frequency(fre, s, n)  
  
    # Function call  
    LongestSequence(fre, n)  
  
# This code is contributed by  
# Rituraj Jain 

