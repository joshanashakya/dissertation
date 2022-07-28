

# Python implementation of the approach 
MAX = 26; 
  
# Function to return the required 
# length of the subsequences 
def maxLength(str, len): 
  
    # To store the result 
    res = 0; 
  
    # To store the last visited 
    # position of lowercase letters 
    lastPos = [0] * MAX; 
  
    # Initialisation of frequency array to -1 to 
    # indicate no character has previously occured 
    for i in range(MAX): 
        lastPos[i] = -1; 
      
    # For every character of the String 
    for i in range(len): 
  
        # Get the index of the current character 
        C = ord(str[i]) - ord('a'); 
  
        # If the current character has 
        # appeared before in the String 
        if (lastPos[C] != -1): 
  
            # Update the result 
            res = max(len - (i - lastPos[C] - 1) - 1, res); 
          
        # Update the last position 
        # of the current character 
        lastPos[C] = i; 
      
    return res; 
  
# Driver code 
if __name__ == '__main__': 
    str = "geeksforgeeks"; 
    len = len(str); 
  
    print(maxLength(str, len)); 
  
# This code is contributed by 29AjayKumar 

