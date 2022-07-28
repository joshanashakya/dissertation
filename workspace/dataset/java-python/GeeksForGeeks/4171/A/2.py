

# Python 3 implementation of the approach 
  
MAX = 26
  
# Function that returns true if the mapping is possible 
def canBeMapped(s1, l1, s2, l2): 
    # Both the strings are of un-equal lengths 
    if (l1 != l2): 
        return False
  
    # To store the frequencies of the 
    # characters in both the string 
    freq1 = [0 for i in range(MAX)] 
    freq2 = [0 for i in range(MAX)] 
  
    # Update frequencies of the characters 
    for i in range(l1): 
        freq1[ord(s1[i]) - ord('a')] += 1
    for i in range(l2): 
        freq2[ord(s2[i]) - ord('a')] += 1
  
    # For every character of s1 
    for i in range(MAX): 
        # If current character is 
        # not present in s1 
        if (freq1[i] == 0): 
            continue
        found = False
  
        # Find a character in s2 that has frequency 
        # equal to the current character's 
        # frequency in s1 
        for j in range(MAX): 
            # If such character is found 
            if (freq1[i] == freq2[j]): 
                # Set the frequnecy to -1 so that 
                # it doesn't get picked again 
                freq2[j] = -1
  
                # Set found to true 
                found = True
                break
  
        # If there is no character in s2 
        # that could be mapped to the 
        # current character in s1 
        if (found==False): 
            return False
  
    return True
  
# Driver code 
if __name__ == '__main__': 
    s1 = "axx"
    s2 = "cbc"
    l1 = len(s1) 
    l2 = len(s2) 
  
    if (canBeMapped(s1, l1, s2, l2)): 
        print("Yes") 
    else: 
        print("No") 
          
# This code is contributed by 
# Surendra_Gangwar 

