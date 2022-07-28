

# Python3 program to find whether the string  
# has all same characters or not. 
  
# Function to check the string has 
# all same characters or not . 
def allCharactersSame(s) : 
    n = len(s) 
    for i in range(1, n) : 
        if s[i] != s[0] : 
            return False
  
    return True
  
# Driver code 
if __name__ == "__main__" : 
      
    s = "aaa"
    if allCharactersSame(s) : 
        print("Yes") 
    else : 
        print("No") 
  
# This code is contributed by ANKITRAI1 

