

# Python3 program to implement  
# the above approach 
  
# Function to find the encrypted string 
def findWord(c, n): 
    co = 0
      
    # to store the encrypted string 
    s = [0] * n 
    for i in range(n): 
        if (i < n / 2): 
            co += 1
        else: 
            co = n - i 
          
        # after 'z', it should go to a. 
        if (ord(c[i]) + co <= 122): 
            s[i] = chr(ord(c[i]) + co) 
        else: 
            s[i] = chr(ord(c[i]) + co - 26) 
    print(*s, sep = "") 
  
# Driver code 
s = "abcd"
findWord(s, len(s)) 
  
# This code is contributed by SHUBHAMSINGH10 

