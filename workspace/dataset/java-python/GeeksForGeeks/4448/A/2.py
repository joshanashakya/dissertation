

# Python3 implementation of lexicographically first 
# alternate vowel and consonant string 
SIZE = 26
  
# 'ch' is vowel or not 
def isVowel(ch): 
    if (ch == 'a' or ch == 'e' or 
        ch == 'i' or ch == 'o' or 
        ch == 'u'): 
        return True
    return False
  
# create alternate vowel and consonant string 
# str1[0...l1-1] and str2[start...l2-1] 
def createAltStr(str1, str2, start, l): 
    finalStr = "" 
    i = 0
    j = start 
  
    # first adding character of vowel/consonant 
    # then adding character of consonant/vowel 
    while j < l: 
        finalStr += str1[i] + str2[j] 
        i += 1
        j += 1
    return finalStr 
  
# function to find the required lexicographically 
# first alternate vowel and consonant string 
def findAltStr(string): 
  
    # hash table to store frequencies 
    # of each character in 'str' 
    char_freq = [0] * SIZE # initilaize all elements  
                           # of char_freq[] to 0 
    nv = 0
    nc = 0
    vstr = "" 
    cstr = "" 
    l = len(string) 
  
    for i in range(l): 
        ch = string[i] 
  
        # count vowels 
        if isVowel(ch): 
            nv += 1
  
        # count consonants 
        else: 
            nc += 1
  
        # update frequency of 'ch' in 
        # char_freq[] 
        char_freq[ord(ch) - 97] += 1
  
    # no such string can be formed 
    if abs(nv - nc) >= 2: 
        return "no such string"
  
    # form the vowel string 'vstr' and 
    # consonant string 'cstr' which contains 
    # characters in lexicographical order 
    for i in range(SIZE): 
        ch = chr(i + 97) 
        for j in range(1, char_freq[i] + 1): 
            if isVowel(ch): 
                vstr += ch 
            else: 
                cstr += ch 
  
    # remove first character of vowel string 
    # then create alternate string with 
    # cstr[0...nc-1] and vstr[1...nv-1] 
    if nv > nc: 
        return vstr[0] + createAltStr(cstr,  
                                      vstr, 1, nv) 
  
    # remove first character of consonant string 
    # then create alternate string with 
    # vstr[0...nv-1] and cstr[1...nc-1] 
    if nc > nv: 
        return cstr[0] + createAltStr(vstr, 
                                      cstr, 1, nc) 
  
    # if both vowel and consonant 
    # strings are of equal length 
    # start creating string with consonant 
    if cstr[0] < vstr[0]: 
        return createAltStr(cstr, vstr, 0, nv) 
  
    # start creating string with vowel 
    return createAltStr(vstr, cstr, 0, nc) 
  
# Driver Code 
if __name__ == "__main__": 
    string = "aeroplane"
    print(findAltStr(string)) 
  
# This code is contributed by 
# sanjeev2552 

