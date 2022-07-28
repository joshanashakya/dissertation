

# Python3 program to bring all spaces  
# in front of sing using swapping technique 
  
# Function to find spaces and  
# move to beginning 
def moveSpaceInFront(s): 
  
    # Keep copying non-space characters 
    i = len(s) - 1; 
      
    for j in range(i, -1, -1): 
        if (s[j] != ' '): 
            s = s[:i] + s[j] + s[i + 1:] 
            i -= 1; 
  
    # Move spaces to be beginning 
    while (i >= 0): 
        s = s[:i] + ' ' + s[i + 1:] 
        i -= 1
    return s; 
  
# Driver code 
s = "Hey there, it's GeeksforGeeks"; 
s = moveSpaceInFront(s); 
print(s); 
  
# This code is contributed  
# by Princi Singh  

