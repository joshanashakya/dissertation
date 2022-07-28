

# Python3 program to find the count of  
# palindromic sub-string of a string  
# in it's ascending form 
MAX_CHAR = 26
  
# function to return count of  
# palindromic sub-string 
def countPalindrome(str): 
  
    n = len (str) 
    sum = 0
  
    # calculate frequency 
    hashTable = [0] * MAX_CHAR 
    for i in range(n): 
        hashTable[ord(str[i]) - 
                  ord('a')] += 1
  
    # calculate count of palindromic 
    # sub-string 
    for i in range(26) : 
        if (hashTable[i]): 
            sum += (hashTable[i] * 
                   (hashTable[i] + 1) // 2) 
  
    # return result 
    return sum
  
# Driver Code 
if __name__ == "__main__": 
  
    str = "ananananddd"
  
    print (countPalindrome(str)) 
  
# This code is contributed by ita_c 

