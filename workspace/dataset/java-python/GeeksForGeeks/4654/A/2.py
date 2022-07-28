

# Python 3 program to check if a query 
# string is present is given set. 
MAX_CHAR = 256
  
def isPresent(s, q): 
  
    # Count occurrences of all characters 
    # in s. 
    freq = [0] *  MAX_CHAR  
    for i in range(0 , len(s)): 
        freq[ord(s[i])] += 1
  
    # Check if number of occurrences of 
    # every character in q is less than 
    # or equal to that in s. 
    for i in range(0, len(q)): 
        freq[ord(q[i])] -= 1
        if (freq[ord(q[i])] < 0):  
            return False
      
    return True
  
# driver program 
s = "abctd"
q = "cat"
  
if (isPresent(s, q)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by Smitha 

