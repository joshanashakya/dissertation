

# Python3 program to find the lexicographically 
# smallest string by removing at most one character 
  
# Function to return the smallest string 
def smallest(s): 
  
    l = len(s) 
    ans = "" 
  
    # iterate the string 
    for i in range (l): 
  
        # first point where s[i]>s[i+1] 
        if (s[i] > s[i + 1]): 
  
            # append the string without 
            # i-th character in it 
            for j in range (l): 
                if (i != j): 
                    ans += s[j] 
              
            return ans 
  
    # leave the last character 
    ans = s[0: l - 1] 
    return ans 
  
# Driver Code 
if __name__ == "__main__": 
  
    s = "abcda"
  
    print (smallest(s)) 
  
# This code is contributed by ita_c 

