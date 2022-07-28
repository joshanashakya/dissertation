

# Python3 Program to print  
# symmetric pascal matrix. 
  
# Print Pascal Matrix 
def printpascalmatrix(n): 
    C = [[0 for x in range(2 * n + 1)]  
            for y in range(2 * n + 1)]  
              
    # Calculate value of  
    # Binomial Coefficient 
    # in ottom up manner 
    for i in range(2 * n + 1): 
        for j in range(min(i, 2 * n) + 1): 
              
            # Base Cases 
            if (j == 0 or j == i): 
                C[i][j] = 1; 
                  
            # Calculate value 
            # using previously 
            # stored values 
            else: 
                C[i][j] = (C[i - 1][j - 1] + 
                           C[i - 1][j]); 
      
    # Printing the 
    # pascal matrix 
    for i in range(n): 
        for j in range(n): 
            print(C[i + j][i],  
                   end = " "); 
        print(); 
      
# Driver Code 
n = 5; 
printpascalmatrix(n); 
  
# This code is contributed by mits 

