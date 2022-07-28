

# Python 3 implementation of the approach 
  
# Function to return s % n 
def findMod4(s, n): 
      
    # To store the number formed by 
    # the last two digits 
      
    # If it contains a single digit 
    if (n == 1): 
        k = ord(s[0]) - ord('0') 
  
    # Take last 2 digits 
    else: 
        k = ((ord(s[n - 2]) - ord('0')) * 10 + 
              ord(s[n - 1]) - ord('0')) 
  
    return (k % 4) 
  
# Driver code 
if __name__ == '__main__': 
    s = "81"
    n = len(s) 
    print(findMod4(s, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

