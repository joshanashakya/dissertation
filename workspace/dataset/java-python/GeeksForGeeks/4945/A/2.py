

# Python 3 program to print 
# the Cot Bed Pattern 
   
# function to print the pattern 
def pattern(nos, i, space): 
  
    prt = '$'
   
    # loop for the spacing between the $ sign 
    for s in range(nos, 0, -1) : 
        print(end="  ") 
   
    # skipping the $ 
    for j in range(1, i+1) : 
        if (space != 0) : 
            if (i == 9 and j == 1) : 
                continue
   
        # printing the $ 
        if (i == 1 or i == 9) : 
            print(prt,end="") 
          
        elif (j == 1 or j == i) : 
            print(prt,end="") 
          
        else : 
            print(end="  ") 
          
# Driver code 
if __name__ == "__main__": 
      
    nos = 0
    nosp = -1
    nbsp = -1
    for i in range( 9, 0 , -2) : 
   
        # printing the first upper triangle 
        pattern(nos, i, 0) 
   
        # printing the second upper triangle 
        pattern(nosp, i, 1) 
   
        # printing the third upper triangle 
        pattern(nbsp, i, 1) 
   
        print() 
        nos += 1
        nosp = nosp + 2
        nbsp = nbsp + 2
   
    nos = 3
    nosp = 5
    nbsp = 5
   
    for i in range(3, 10,  2) : 
   
        # printing the first lower triangle 
        pattern(nos, i, 0) 
   
        # printing the second lower triangle 
        pattern(nosp, i, 1) 
   
        # printing the third lower triangle 
        pattern(nbsp, i, 1) 
   
        print() 
        nos -= 1
        nosp = nosp - 2
        nbsp = nbsp - 2
  
# This code is contributed by 
# ChitraNayal 

