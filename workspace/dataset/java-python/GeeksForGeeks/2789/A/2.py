

# Python3 implementation of  
# the above approach 
  
# Function to find a number 
def printNumberWithDR( k, d ) : 
  
    # If d is 0, k has to be 1  
    if d == 0 and k != 1 : 
        print(-1, end = "") 
  
    else : 
        print(d, end = "") 
        k -= 1
  
        # Print k-1 zeroes  
        while k : 
              
            print(0,end = "") 
            k -= 1
              
  
# Driver code      
if __name__ == "__main__" : 
  
    k, d = 4, 4
  
    # Function call 
    printNumberWithDR( k, d ) 
              
# This code is contributed by  
# ANKITRAI1 

