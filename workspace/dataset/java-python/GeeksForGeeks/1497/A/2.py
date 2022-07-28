

# Python 3 implementation to split string  
# into substrings on the basis of delimiter 
  
# function to split string into substrings  
# on the basis of delimiter and return the  
# substrings after split 
def splitStrings(st, dl): 
    word = "" 
  
    # to count the number of split strings 
    num = 0
  
    # adding delimiter character at  
    # the end of 'str' 
    st += dl 
  
    # length of 'str' 
    l = len(st) 
  
    # traversing 'str' from left to right 
    substr_list = [] 
    for i in range(l): 
          
        # if str[i] is not equal to the  
        # delimiter character then accumulate 
        # it to 'word' 
        if (st[i] != dl): 
            word += st[i] 
  
        else: 
              
            # if 'word' is not an empty string, 
            # then add this 'word' to the array 
            # 'substr_list[]' 
            if (len(word) != 0): 
                substr_list.append(word) 
  
            # reset 'word' 
            word = "" 
          
    # return the splitted strings 
    return substr_list 
  
# Driver Code 
if __name__ == '__main__': 
    str = "geeks;for;geeks"
    dl = ';'
  
    res = splitStrings(str, dl) 
    for x in range(len(res)): 
        print(res[x]) 
  
# This code is contributed by 
# Surendra_Gangwar 

