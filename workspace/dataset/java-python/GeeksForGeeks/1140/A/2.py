

# Python 3 programm to print the triangle 
# seperated pattern using 
# star and slash character 
  
# Function to print pattern recursively 
def printPattern(i,j, n): 
  
    # Base Case 
    if (j >= n) : 
        return 0
    if (i >= n): 
        return 1
  
    # Conditions to print slash 
    if (j == i or j == n - 1 - i): 
  
        # Condition to print 
        # forword slash 
        if (i == n - 1 - j): 
            print("/",end="") 
  
        # Condition to print 
        # backward slash 
        else: 
            print("\\",end="") 
  
    # Else print '*' 
    else: 
        print("*",end="") 
  
    # Recursive call for rows 
    if (printPattern(i, j + 1, n) 
        == 1): 
        return 1
  
    print() 
  
    # Recursive call for changing 
    # the rows 
    return printPattern(i + 1, 0, n) 
  
# Driver Code 
if __name__ == "__main__": 
  
    N = 9
  
    # Function Call 
    printPattern(0, 0, N) 
  
# This code is contributed by chitranayal 

