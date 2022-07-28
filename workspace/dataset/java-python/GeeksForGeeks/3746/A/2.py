

# Python3 implementation of the approach 
  
# Function to return the number of lines required 
def numberOfLines(S, widths): 
  
    # If string is empty 
    if(S == ""): 
        return 0, 0
  
    # Initialize lines and width 
    lines, width = 1, 0
  
    # Iterate through S 
    for c in S: 
        w = widths[ord(c) - ord('a')] 
        width += w 
        if width > 10: 
            lines += 1
            width = w 
  
    # Return lines and width used 
    return lines, width 
  
  
# Driver Code 
S = "bbbcccdddaa"
Widths = [4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1] 
  
# Function call to print required answer 
print(numberOfLines(S, Widths)) 

