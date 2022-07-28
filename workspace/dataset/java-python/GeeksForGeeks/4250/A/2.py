

# Python 3 Program to find whether two strings 
# are equivalent or not according to given 
# condition 
  
# This function returns the least lexicogr 
# aphical string obtained from its two halves 
def leastLexiString(s): 
      
    # Base Case - If string size is 1 
    if (len(s) & 1 != 0): 
        return s 
  
    # Divide the string into its two halves 
    x = leastLexiString(s[0:int(len(s) / 2)]) 
    y = leastLexiString(s[int(len(s) / 2):len(s)]) 
  
    # Form least lexicographical string 
    return min(x + y, y + x) 
  
def areEquivalent(a,b): 
    return (leastLexiString(a) == leastLexiString(b)) 
  
# Driver Code 
if __name__ == '__main__': 
    a = "aaba"
    b = "abaa"
    if (areEquivalent(a, b)): 
        print("YES") 
    else: 
        print("NO") 
  
    a = "aabb"
    b = "abab"
    if (areEquivalent(a, b)): 
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed by 
# Surendra_Gangwar 

