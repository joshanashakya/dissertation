

# Python 3 program to count common  
# base strings of s1 and s2. 
  
# function for finding common divisor . 
def isCommonBase(base, s1, s2): 
  
    # Checking if 'base' is base  
    # string of 's1' 
    for j in range(len(s1)):  
        if (base[j % len(base)] != s1[j]): 
            return False
      
    # Checking if 'base' is base  
    # string of 's2' 
    for j in range(len(s2)):  
        if (base[j % len( base)] != s2[j]): 
            return False
  
    return True
  
def countCommonBases(s1, s2):  
    n1 = len(s1) 
    n2 = len(s2) 
    count = 0
    for i in range(1, min(n1, n2) + 1): 
        base = s1[0: i] 
        if (isCommonBase(base, s1, s2)): 
            count += 1
          
    return count 
  
# Driver code 
if __name__ == "__main__": 
      
    s1 = "pqrspqrs"
    s2 = "pqrspqrspqrspqrs"
    print(countCommonBases(s1, s2)) 
  
# This code is contributed by ita_c 

