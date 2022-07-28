

# Python implementation of the above approach 
def check(s): 
  
    # creating a frequency array 
    freq =[0]*26
  
    # Finding length of s 
    n = len(s) 
  
    for i in range(n): 
  
        # counting frequency of all characters 
        freq[ord(s[i])-97]+= 1
  
    for i in range(26): 
  
        # checking if any odd frequency 
        # is there or not 
        if (freq[i]% 2 == 1): 
            return False
    return True
  
# Driver code 
s ="abaccaba"
if(check(s)): 
    print("Yes") 
else: 
    print("No") 

