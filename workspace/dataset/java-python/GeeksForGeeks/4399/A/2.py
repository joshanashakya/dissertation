

# Python3 code to print tetrahedral 
# numbers series up to n 
   
# function to print tetrahedral series up to n 
def printSeries(n): 
   
    # loop to print series  
    for i in range(1, n + 1): 
          
        # Calculate and print ith  
        # Tetrahedral number 
        num = i * (i + 1) * (i + 2) // 6
          
        print(num, end =' ') 
                    
# Driver code 
n = 10
  
# function call to print series 
printSeries(n) 

