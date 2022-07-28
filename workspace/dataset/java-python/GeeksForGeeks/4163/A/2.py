

# Python 3 program to find the fist  
# character that is repeated 
  
# 256 is taken just to ensure nothing 
# is left, actual max ASCII limit is 128 
  
MAX_CHAR = 256
  
def findRepeatFirst(s): 
      
    # this is optimized method 
    p = -1
  
    # initialized counts of occurrences  
    # of elements as zero 
    hash = [0 for i in range(MAX_CHAR)]  
  
    # initialized positions 
    pos = [0 for i in range(MAX_CHAR)] 
  
    for i in range(len(s)): 
        k = ord(s[i]) 
        if (hash[k] == 0): 
            hash[k] += 1
            pos[k] = i 
        elif(hash[k] == 1): 
            hash[k] += 1
  
    for i in range(MAX_CHAR): 
        if (hash[i] == 2): 
            if (p == -1): # base case 
                p = pos[i] 
            elif(p > pos[i]): 
                p = pos[i] 
    return p 
  
# Driver code 
if __name__ == '__main__': 
    str = "geeksforgeeks"
    pos = findRepeatFirst(str); 
    if (pos == -1): 
        print("Not found") 
    else: 
        print(str[pos]) 
          
# This code is contributed by 
# Shashank_Sharma 

