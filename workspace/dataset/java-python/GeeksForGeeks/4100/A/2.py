

# Python implementation of the above approach 
  
# Function to print N groups of equal sum 
def printGroups(n) : 
      
    x = 1
    y = n * n 
      
    # No. of Groups 
    for i in range(1, n + 1) : 
          
        # n/2 pairs 
        for j in range(1, n // 2 + 1) : 
              
            print("{",x,",",y,"}",end = " ") 
              
            x += 1
            y -= 1
          
        print() 
          
         
# Driver code 
if __name__ == "__main__" : 
      
    n = 4
      
    # Function call 
    printGroups(n) 
  
# This code is contributed by Ryuga 

