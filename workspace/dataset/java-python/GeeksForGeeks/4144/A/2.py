

# Python 3 program to find the N-th character 
# in the string "1234567891011.." 
  
# Function that returns the N-th character 
def NthCharacter(n): 
  
    # initially null string 
    s = "" 
  
    # starting integer 
    c = 1
  
    # add integers in string 
    while(True) : 
  
        # one digit numbers added 
        if (c < 10): 
            s += chr(48 + c) 
  
        # more than 1 digit number, generate 
        # equivalent number in a string s1 
        # and concatenate s1 into s. 
        else: 
            s1 = "" 
            dup = c 
  
            # add the number in string 
            while (dup > 0): 
                s1 += chr((dup % 10) + 48) 
                dup //= 10
  
            # reverse the string 
            s1 = "".join(reversed(s1))  
  
            # attach the number 
            s += s1 
        c += 1
  
        # if the length exceeds N 
        if (len(s) >= n): 
            return s[n - 1] 
  
# Driver Code 
if __name__ == "__main__": 
      
    n = 11
    print(NthCharacter(n)) 
  
# This code is contributed by ita_c 

