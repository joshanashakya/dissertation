

# Python 3 program to count the minimal 
# replacements such that adjacent  
# characters are unequal 
  
# Function to count the number of 
# minimal replacements 
def countMinimalReplacements(s): 
      
    # Find the length of the string 
    n = len(s) 
  
    cnt = 0
  
    # Iterate in the string 
    for i in range(1, n): 
          
        # Check if adjacent is similar 
        if (s[i] == s[i - 1]): 
            cnt += 1; 
  
            # If not the last pair 
            if (i != (n - 1)): 
                  
                # Check for character which is 
                # not same in i+1 and i-1 
                s = list(s) 
                for j in "012": 
                    if (j != s[i + 1] and 
                        j != s[i - 1]): 
                        s[i] = j 
                        break
  
                s = ''.join(s) 
                  
            # Last pair  
            else: 
                  
                # Check for character which is  
                # not same in i-1 index 
                s = list(s) 
  
                for k in "012": 
                    if (k != s[i - 1]): 
                        s[i] = k 
                        break
                s = ''.join(s) 
          
    return cnt 
  
# Driver Code 
if __name__ == '__main__': 
    s = "201220211"
    print(countMinimalReplacements(s)) 
  
# This code is contributed by 
# Surendra_Gangwar 

