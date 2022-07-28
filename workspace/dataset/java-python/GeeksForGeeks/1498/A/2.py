

# Python3 program to check if we can  
# break a into four distinct strings.  
  
# Return if the given can be  
# spilt or not.  
def check(s): 
  
    # We can always break a of size 10 or  
    # more into four distinct strings.  
    if (len(s) >= 10): 
        return True
  
    # Brute Force  
    for i in range(1, len(s)):  
      
        for j in range(i + 1, len(s)):  
          
            for k in range(j + 1, len(s)): 
              
                # Making 4 from the given  
                s1 = s[0:i]  
                s2 = s[i:j - i] 
                s3 = s[j: k - j] 
                s4 = s[k: len(s) - k] 
                  
                # Checking if they are distinct or not.  
                if (s1 != s2 and s1 != s3 and s1 != s4 and
                    s2 != s3 and s2 != s4 and s3 != s4):  
                    return True
              
    return False
  
# Driver Code  
if __name__ == '__main__': 
    str = "aaabb"
  
    print("Yes") if(check(str)) else print("NO") 
  
# This code is contributed 
# by SHUBHAMSINGH10 

