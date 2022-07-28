

# Python program to print pattern 
  
def StarPattern(height): 
  
    # This loop prints number of rows 
    for i in range(height): 
          
        # For every row, first '*' will be  
        # printed Height-rowNumber times. 
        for j in range(height-1,i,-1): 
          
            print("*",end="") 
          
        # Print character '*' and Row number  
        # alternately boolean variable to 
        # decide whether to print char or int 
        printChar = False
   
        for j in range(((i*2) +1)): 
          
            if ( printChar ): 
              
                print("*",end="") 
              
            else: 
              
                print(i + 1,end="") 
              
               
            # Each time after printing char  
            # or int reverse the boolean variable 
            #  to print alternatively 
            printChar = not printChar 
              
               
        # After printing char and int,  
        # it will print '*' 
        for j in range(height-1,i,-1): 
          
            print("*",end="") 
          
   
        print() 
          
# Driver code 
  
height = 7
StarPattern(height) 
  
# This code is contributed 
# by Anant Agarwal. 

