

# Python3 program to find the fist  
# character that is repeated 
  
def findRepeatFirstN2(s): 
  
    # this is O(N^2) method 
    p = -1
    for i in range(len(s)): 
      
        for j in range (i + 1, len(s)): 
          
            if (s[i] == s[j]): 
                p = i 
                break
              
        if (p != -1): 
            break
  
    return p 
  
# Driver code 
if __name__ == "__main__": 
  
    str = "geeksforgeeks"
    pos = findRepeatFirstN2(str) 
    if (pos == -1): 
        print ("Not found") 
    else: 
        print (str[pos]) 
      
# This code is contributed  
# by ChitraNayal 

