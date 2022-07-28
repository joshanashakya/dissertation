

# Python implementation of above approach 
  
# Print balanced and remove  
# extra brackets from string 
def balancedString(str): 
    count, i = 0, 0
    n = len(str) 
  
    # Maintain a count for opening  
    # brackets Traversing string 
    for i in range(n): 
  
        # check if opening bracket 
        if (str[i] == '('): 
  
            # print str[i] and increment  
            # count by 1 
            print(str[i], end = "") 
            count += 1
              
        # check if closing bracket and count != 0 
        elif (str[i] == ')' and count != 0): 
            print(str[i], end = "") 
  
            # decrement count by 1 
            count -= 1
              
        # if str[i] not a closing brackets 
        # print it 
        elif (str[i] != ')'): 
            print(str[i], end = "") 
              
    # balanced brackets if opening brackets 
    # are more then closing brackets 
    if (count != 0): 
          
        # print remaining closing brackets 
        for i in range(count): 
            print(")", end = "") 
  
# Driver code 
if __name__ == '__main__': 
    str = "gau)ra)v(ku(mar(rajput))"
    balancedString(str) 
  
# This code is contributed by 29AjayKumar 

