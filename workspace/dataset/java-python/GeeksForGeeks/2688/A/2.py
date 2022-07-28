

# Python3 program to change the sentence 
#  with virtual dictionary  
  
#function for converting the string 
def conversion(charSet,str1): 
    s2="" 
    for i in str1: 
        # find the index of each element of the 
        # string in the modified set of alphabets 
        # replace the element with the one having the 
        # same index in the actual set of alphabets 
        s2 += alphabets[charSet.index(i)] 
          
    return s2 
  
# Driver Code 
if __name__=='__main__': 
    alphabets = "abcdefghijklmnopqrstuvwxyz"
    charSet= "qwertyuiopasdfghjklzxcvbnm"
    str1 = "egrt"
    print(conversion(charSet,str1)) 
  
#This code is contributed by PradeepEswar 

