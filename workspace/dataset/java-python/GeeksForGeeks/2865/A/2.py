

# python program to find minimum 
# cost to make a palindrome. 
  
# Function to return cost 
def cost(st): 
      
    # length of string 
    l = len(st)      
      
    # Iterate from both sides 
    # of string. If not equal, 
    # a cost will be there 
    res = 0
    j = l - 1
    i = 0
    while(i < j):          
        if (st[i] != st[j]): 
            res += (min(ord(st[i]),  
                    ord(st[j])) - 
                     ord('a') + 1) 
              
        i = i + 1
        j = j - 1
          
    return res 
  
# Driver code 
st = "abcdef"; 
print(cost(st)) 
  
# This code is contributed by 
# Sam007 

