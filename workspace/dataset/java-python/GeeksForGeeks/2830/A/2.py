

# Python3 program to print the required pattern  
  
# Function to print the required pattern  
def printPattern(s, n):  
  
    # Print the unmodified string  
    print(''.join(s)) 
  
    # Reverse the string  
    i, j = 0, n - 1
      
    while i < j:  
        s[i], s[j] = s[j], s[i]  
        i += 1
        j -= 1
      
    # Replace the first and last character  
    # by '*' then second and second last  
    # character and so on until the string 
    # has characters remaining  
    i, j = 0, n - 1
      
    while j - i > 1:  
        s[i], s[j] = '*', '*'
        print(''.join(s))  
        i += 1
        j -= 1
  
# Driver code  
if __name__ == "__main__": 
  
    s = "geeks"
    n = len(s) 
  
    printPattern(list(s), n)  
      
# This code is contributed 
# by Rituraj Jain 

