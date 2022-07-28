

# Python3 implementation of the approach 
MAXN = 256
  
# Function that returns true if the frequency 
# of any character is more than half the 
# length of the String 
def checkHalfFrequency(Str): 
  
    # Length of the String 
    L = len(Str) 
  
    # Initialize a frequency array 
    fre = [0 for i in range(MAXN)] 
  
    # Iterate the and update the 
    # frequency of each of the character 
    for i in range(L): 
        fre[ord(Str[i])] += 1
  
    # Iterate the frequency array 
    for i in range(MAXN): 
  
        # If condition is satisfied 
        if (fre[i] > L // 2): 
            return True
  
    return False
  
# Driver code 
Str = "GeeksforGeeks"
  
if (checkHalfFrequency(Str)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by mohit kumar 

