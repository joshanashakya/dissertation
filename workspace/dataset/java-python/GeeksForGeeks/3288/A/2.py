

# A simple Python 3 program to count number of 
# substrings starting and ending with 1 
  
def countSubStr(st, n) : 
      
    # Initialize result 
    res = 0   
   
   # Pick a starting point 
    for i in range(0, n) : 
        if (st[i] == '1') : 
  
            # Search for all possible ending point 
            for j in range(i+1, n) : 
                if (st[j] == '1') : 
                    res = res + 1
          
    return res 
      
   
# Driver program to test above function 
st = "00100101"; 
list(st) 
n= len(st) 
print(countSubStr(st, n), end="") 
  
  
# This code is contributed 
# by Nikita Tiwari. 

