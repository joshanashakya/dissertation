

# Python 3 implementation of the approach 
  
# Function to return the lexicographically 
# largest sub-sequence of s 
def getSubSeq(s, n): 
    res = "" 
    cr = 0
    while (cr < n): 
          
        # Get the max character from  
        # the string 
        mx = s[cr] 
        for i in range(cr + 1, n): 
            mx = max(mx, s[i]) 
        lst = cr 
  
        # Use all the occurrences of the 
        # current maximum character 
        for i in range(cr,n): 
            if (s[i] == mx): 
                res += s[i] 
                lst = i 
  
        # Repeat the steps for the  
        # remaining string 
        cr = lst + 1
      
    return res 
  
# Driver code 
if __name__ == '__main__': 
    s = "geeksforgeeks"
    n = len(s) 
    print(getSubSeq(s, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

