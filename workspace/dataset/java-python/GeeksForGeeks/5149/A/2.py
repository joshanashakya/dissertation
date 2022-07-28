

# Python3 code to check 
# whether the given 
# string is Heterogram  
# or not. 
  
def isHeterogram(s, n): 
    hash = [0] * 26
      
    # traversing the 
    # string. 
    for i in range(n): 
          
        # ignore the space 
        if s[i] != ' ': 
              
            # if already  
            # encountered 
            if hash[ord(s[i]) - ord('a')] == 0: 
                hash[ord(s[i]) - ord('a')] = 1
              
            # else return false. 
            else: 
                return False
      
    return True
  
# Driven Code 
s = "the big dwarf only jumps"
n = len(s) 
  
print("YES" if isHeterogram(s, n) else "NO")  
  
# This code is contributed by "Sharad_Bhardwaj". 

