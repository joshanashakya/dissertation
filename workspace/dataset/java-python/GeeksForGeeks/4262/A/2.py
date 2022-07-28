

# Python3 implementation of the approach  
  
# Function to print all the possible paths  
def printPaths(inputchar, R, C) : 
    for i in range(C) : 
        dfs(inputchar, "", 0, i, R, C); 
        print() 
          
    """ 
    * Depth first traversal of the array  
    *  
    * @param input array of characters  
    * @param res to be printed in console  
    * @param i current row index  
    * @param j current column index  
    * @param R number of rows in the input array  
    * @param C number of rows in the output array  
    * """
def dfs(inputchar, res, i, j, R, C) : 
      
    # If the current row index equals to R, it  
    # indicates we have reached the bottom of  
    # the array and hence we print the result  
    if (i == R) : 
        print(res, end = " "); 
        return;  
  
    res = res + inputchar[i][j];  
  
    # Iterate over each of the columns  
    # in the array  
    for k in range(C) : 
        dfs(inputchar, res, i + 1, k, R, C); 
        if (i + 1 == R) : 
            break;  
  
# Driver code  
if __name__ == "__main__" : 
      
    inputchar = [ 
            [ 'a', 'b' ],  
            [ 'd', 'e' ]  
            ]; 
              
    R = len(inputchar); 
    C = len(inputchar[0]); 
      
    printPaths(inputchar, R, C);  
  
# This code is contributed by AnkitRai01 

