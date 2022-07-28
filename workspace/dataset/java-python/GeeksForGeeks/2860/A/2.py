

# Python 3 program for getting minimum character 
# to be added at front to make string palindrome 
  
# function for checking string is  
# palindrome or not 
def ispalindrome(s): 
  
    l = len(s) 
      
    i = 0
    j = l - 1
    while i <= j: 
      
        if(s[i] != s[j]): 
            return False
        i += 1
        j -= 1
      
    return True
  
# Driver code 
if __name__ == "__main__": 
      
    s = "BABABAA"
    cnt = 0
    flag = 0
      
    while(len(s) > 0): 
      
        # if string becomes palindrome then break 
        if(ispalindrome(s)): 
            flag = 1
            break
          
        else: 
            cnt += 1
          
            # erase the last element of the string 
            s = s[:-1] 
      
    # print the number of insertion at front 
    if(flag): 
        print(cnt) 
  
# This code is contributed by ita_c 

