

# Python 3 program to Check if 
# similar subsequences exist or not 
  
# Function to check if similar subsequences 
# occur in a string or not 
def check(s, l): 
    freq = [0 for i in range(26)]  
      
    # iterate and count the frequency 
    for i in range(l): 
          
        # counting frequency of the letters 
        freq[ord(s[i]) - ord('a')] += 1
          
    # check if frequency is more 
    # than once of any character 
    for i in range(26): 
        if (freq[i] >= 2): 
            return True
  
    return False
  
# Driver Code 
if __name__ == '__main__': 
    s = "geeksforgeeks"
    l = len(s) 
    if (check(s, l)): 
        print("YES") 
    else: 
        print("NO") 
  
# This code is contributed by 
# Sahil_Shelangia 

