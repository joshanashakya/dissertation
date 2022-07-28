

# Method to find an equal index 
def findIndex(str): 
    l = len(str) 
    open = [0] * (l + 1) 
    close = [0] * (l + 1) 
    index = -1
      
    open[0] = 0
    close[l] = 0
    if (str[0]=='('): 
        open[1] = 1
    if (str[l - 1] == ')'): 
        close[l - 1] = 1
      
    # Store the number of 
    # opening brackets 
    # at each index 
    for i in range(1, l): 
        if (str[i] == '('): 
            open[i + 1] = open[i] + 1
        else: 
            open[i + 1] = open[i] 
      
    # Store the number 
    # of closing brackets 
    # at each index 
    for i in range(l - 2, -1, -1): 
        if ( str[i] == ')'): 
            close[i] = close[i + 1] + 1
        else: 
            close[i] = close[i + 1] 
      
    # check if there is no  
    # opening or closing brackets 
    if (open[l] == 0): 
        return len
    if (close[0] == 0): 
        return 0
      
    # check if there is any  
    # index at which both 
    # brackets are equal 
    for i in range(l + 1): 
        if (open[i] == close[i]): 
            index = i 
      
    return index 
      
# Driver Code 
str = "(()))(()()())))"
print(findIndex(str)) 
  
# This code is contributed  
# by ChitraNayal 

