

# Python3 program to bring all spaces  
# in front of string using swapping technique 
  
# Function to find spaces and move to beginning 
def moveSpaceInFront(s): 
  
    # Traverse from end and swap spaces 
    i = len(s) - 1; 
    for j in range(i, -1, -1): 
        if (s[j] != ' '): 
            s = swap(s, i, j); 
            i -= 1; 
    return s; 
      
def swap(c, i, j): 
    c = list(c) 
    c[i], c[j] = c[j], c[i] 
    return ''.join(c)  
      
# Driver code 
s = "Hey there, it's GeeksforGeeks"; 
s = moveSpaceInFront(s); 
print(s); 
  
# This code is contributed  
# by Princi Singh 

