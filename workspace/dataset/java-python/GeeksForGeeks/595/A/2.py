

# Python implementation of the 
# above approach.  
  
# Function to print N lines  
def printLines(n, k) : 
  
    # Iterate N times to print N lines 
    for i in range(n) : 
        print( k * (6 * i + 1), 
                k * (6 * i + 2), 
               k * (6 * i + 3), 
               k * (6 * i + 5)) 
          
# Driver code      
if __name__ == "__main__" : 
  
    n, k = 2, 2
    printLines(n, k) 
  
# This code is contributed by ANKITRAI1 

