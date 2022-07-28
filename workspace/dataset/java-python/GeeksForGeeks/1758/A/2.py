

# Python3 program to print 
# hollow and solid square patterns 
  
# Function for hollow square 
def hollowSquare(rows): 
  
    for i in range(1, rows + 1): 
          
        # Prstars for each solid rows 
        if (i == 1 or i == rows): 
            for j in range(1, rows + 1): 
                print("*", end = "") 
  
        # stars for hollow rows 
        else: 
            for j in range(1, rows + 1): 
                if (j == 1 or j == rows): 
                    print("*", end = "") 
                else: 
                    print(end = " ") 
  
        # Move to the next line/row 
        print() 
      
# Function for Solid square 
def solidSquare(rows): 
  
    for i in range(1, rows): 
          
        # Print stars after spaces 
        for j in range(1, rows + 1): 
            print("*", end = "") 
  
        # Move to the next line/row 
        print() 
      
# Utility program to print all patterns 
def printPattern(rows): 
  
    print("Solid Square:") 
    solidSquare(rows) 
      
    print("\nHollow Square:")  
    hollowSquare(rows) 
  
# Driver Code 
rows = 5
printPattern (rows) 
  
# This code is contributed by  
# Mohit kumar 29 

