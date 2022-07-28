

# Python3 implementation of the approach 
  
# Function to print the expansion  
# of the string 
def printExpansion( str): 
  
    suff = "" 
    for i in range (len (str) - 1, -1, -1) : 
  
        # Take sub-string from i to n-1 
        suff = suff + str[i] 
  
        # Print the sub-string 
        print (suff, end = "") 
  
# Driver code 
if __name__ == "__main__": 
  
    str = "geeks"
    printExpansion(str) 
  
# This code is contributed by ita_c 

