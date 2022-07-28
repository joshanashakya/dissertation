

# Python3 implmentation of the approach 
MAX = 256
  
def canMakeStr2(s1, s2): 
  
    # Create a count array and count  
    # frequencies characters in s1 
    count = {s1[i] : 0 for i in range(len(s1))} 
      
    for i in range(len(s1)): 
        count[s1[i]] += 1
      
    # Now traverse through str2 to check  
    # if every character has enough counts 
    for i in range(len(s2)): 
        if count[s2[i]] == 0: 
            return False
        count[s2[i]] -= 1
    return True
  
# Driver Code 
s1 = "geekforgeeks"
s2 = "for"
  
if canMakeStr2(s1, s2): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by Mohit kumar 29 

