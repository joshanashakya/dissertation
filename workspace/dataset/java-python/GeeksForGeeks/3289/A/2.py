

# A Python3 program to count number of 
# substrings starting and ending with 1 
  
def countSubStr(st, n) : 
  
    # Count of 1's in input string 
    m = 0  
   
    # Traverse input string and  
    # count of 1's in it 
    for i in range(0, n) : 
        if (st[i] == '1') : 
            m = m + 1
          
    # Return count of possible 
    # pairs among m 1's 
    return m * (m - 1) // 2
     
   
# Driver program to test above function 
st = "00100101"; 
list(st) 
n= len(st) 
print(countSubStr(st, n), end="") 
  
  
# This code is contributed 
# by Nikita Tiwari. 

