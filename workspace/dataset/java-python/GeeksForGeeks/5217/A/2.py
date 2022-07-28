

# Python3 program to print a, b  
# and c such that a+b+c=N 
  
# Function to print a, b and c 
def printCombination(n): 
  
    # first loop 
    for i in range(1, n): 
      
        # check for 1st number 
        if (i % 3 != 0):  
              
            # second loop 
            for j in range(1, n): 
  
                # check for 2nd number 
                if (j % 3 != 0):  
  
                    # third loop 
                    for k in range(1, n): 
  
                        # Check for 3rd number 
                        if (k % 3 != 0 and 
                           (i + j + k) == n):  
                            print(i, j, k); 
                            return; 
  
# Driver Code 
n = 233; 
  
printCombination(n); 
  
# This code is contributed  
# by mits 

