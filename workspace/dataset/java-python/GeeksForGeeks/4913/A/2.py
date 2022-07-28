

# Python3 implementation of the approach 
  
# Function to print the expansion of the string 
def printExpansion(str): 
    for i in range(len(str)-1, -1, -1): 
  
        # Take sub-string from i to n-1 
        for j in range(i, len(str)): 
            print(str[j], end ="") 
  
# Driver code 
str = "geeks"
printExpansion(str) 

