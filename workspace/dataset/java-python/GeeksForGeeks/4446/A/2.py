

# Python implementation of alternate vowel 
# and consonant string  
  
# 'ch' is vowel or not  
def isVowel(ch): 
    if(ch == 'a' or ch == 'e' or 
       ch == 'i' or ch == 'o' or 
       ch == 'u'): 
        return True
    return False
  
# create alternate vowel and consonant string  
# str1[0...l1-1] and str2[start...l2-1]  
def createAltStr(str1, str2, start, l): 
    finalStr = "" 
    i = 0
      
    # first adding character of vowel/consonant  
    # then adding character of consonant/vowel  
    for j in range(start, l): 
        finalStr = (finalStr + str1[i]) + str2[j] 
        i + 1
  
    return finalStr 
  
# function to find the required  
# alternate vowel and consonant string  
def findAltStr(str1): 
    nv = 0
    nc = 0
    vstr = "" 
    cstr = "" 
    l = len(str1) 
    for i in range(0, l): 
          
        # count vowels and updaye vowel string  
        if(isVowel(str1[i])): 
            nv += 1
            vstr = vstr + str1[i] 
              
        # count consonants and update  
        # consonant string  
        else: 
            nc += 1
            cstr = cstr + str1[i] 
              
    # no such string can be formed 
    if(abs(nv - nc) >= 2): 
        return "no such string"
      
    # remove first character of vowel string  
    # then create alternate string with  
    # cstr[0...nc-1] and vstr[1...nv-1]  
    if(nv > nc): 
        return (vstr[0] + createAltStr(cstr, vstr, 1, nv)) 
      
    # remove first character of consonant string  
    # then create alternate string with  
    # vstr[0...nv-1] and cstr[1...nc-1] 
    if(nc > nv): 
        return (cstr[0] + createAltStr(vstr, cstr, 1, nc)) 
      
    # if both vowel and consonant  
    # strings are of equal length  
    # start creating string with consonant  
    if(cstr[0] < vstr[0]): 
        return createAltStr(cstr, vstr, 0, nv) 
  
    return createAltStr(vstr, cstr, 0, nc)  
          
# Driver Code 
if __name__ == "__main__": 
    str1 = "geeks"
    print(findAltStr(str1)) 
  
# This code is contributed by Sairahul099  

