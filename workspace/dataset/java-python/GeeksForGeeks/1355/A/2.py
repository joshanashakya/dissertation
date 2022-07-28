

# Python3 program to find maximum 
# length even word 
  
# Function to find maximum length 
# even word 
def findMaxLenEven(str): 
    n = len(str) 
    i = 0
  
    # To store length of current word. 
    currlen = 0
  
    # To store length of maximum length word. 
    maxlen = 0
  
    # To store starting index of maximum 
    # length word. 
    st = -1
  
    while (i < n): 
  
        # If current character is space then 
        # word has ended. Check if it is even 
        # length word or not. If yes then 
        # compare length with maximum length 
        # found so far. 
        if (str[i] == ' '): 
            if (currlen % 2 == 0): 
                if (maxlen < currlen): 
                    maxlen = currlen 
                    st = i - currlen 
  
            # Set currlen to zero for next word. 
            currlen = 0
          
        else : 
              
            # Update length of current word. 
            currlen += 1
  
        i += 1
  
    # Check length of last word. 
    if (currlen % 2 == 0): 
        if (maxlen < currlen): 
            maxlen = currlen 
            st = i - currlen 
  
    # If no even length word is present 
    # then return -1. 
    if (st == -1): 
        print("trie") 
        return "-1"
      
    return str[st: st + maxlen] 
  
# Driver code 
if __name__ == "__main__": 
      
    str = "this is a test string"
  
    print(findMaxLenEven(str)) 
  
# This code is contributed by Ita_c 

