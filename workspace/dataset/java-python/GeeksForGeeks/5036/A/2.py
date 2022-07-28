

# Python3 for constructing smallest palindrome 
  
# function for printing palindrome 
def constructPalin(string, l): 
    string = list(string) 
    i = -1
    j = l 
      
    # iterate till i<j 
    while i < j: 
        i += 1
        j -= 1
  
        # continue if str[i]==str[j] 
        if (string[i] == string[j] and 
            string[i] != '*'): 
            continue
  
        # update str[i]=str[j]='a' if both are '*' 
        elif (string[i] == string[j] and 
              string[i] == '*'): 
            string[i] = 'a'
            string[j] = 'a'
            continue
  
        # update str[i]=str[j] if only str[i]='*' 
        elif string[i] == '*': 
            string[i] = string[j] 
            continue
  
        # update str[j]=str[i] if only str[j]='*' 
        elif string[j] == '*': 
            string[j] = string[i] 
            continue
  
        # else print not possible and return 
        print("Not Possible") 
        return "" 
    return ''.join(string) 
  
# Driver Code 
if __name__ == "__main__": 
    string = "bca*xc**b"
    l = len(string) 
    print(constructPalin(string, l)) 
  
# This code is contributed by 
# sanjeev2552 

