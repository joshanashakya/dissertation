

# Python3 implementation of the approach 
  
# Function that returns true 
# if the game cannot be won 
def isDefeat(s1, s2, n): 
  
    for i in range(n): 
        if ((s1[i] == '0' and s2[i] == '1') or 
            (s1[i] == '1' and s2[i] == '0')): 
            continue
        elif ((s1[i] == '0' and s2[i] == 'Z') or 
              (s1[i] == 'Z' and s2[i] == '0')): 
            continue
        else: 
            return True
          
    return False
  
# Driver code 
s1 = "01001101ZZ"
s2 = "10Z1001000"
  
# Common length 
n = 10
  
if (isDefeat(s1, s2, n)): 
    print("Defeat") 
else: 
    print("Victory") 
  
# This code is contributed by mohit kumar 

