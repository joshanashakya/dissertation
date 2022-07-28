

# Python 3 implementation of the approach 
  
# Function to print the required series 
def printSeries(n): 
      
    # Numerators for the first four  
    # numerators of the series 
    nmtr = [1, 1, 1, 3] 
  
    # Denominators for the first four  
    # denominators of the series 
    dntr = [0, 4, 2, 4] 
  
    for i in range(1, n + 1, 1): 
          
        # If location of the term in the  
        # series is a multiple of 4 then  
        # there will be no denominator 
        if (i % 4 == 0): 
            print(nmtr[i % 4] + int(i / 4) - 1,  
                                     end = " ") 
  
        # Otherwise there will be denominator 
        else: 
              
            # Printing the numerator and  
            # the denominator terms 
            print(nmtr[i % 4] + (int(i / 4) * 
                    dntr[i % 4]), end = "") 
            print("/", end = "") 
            print(dntr[i % 4], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    n = 9
    printSeries(n) 
  
# This code is contributed by 
# Shashank_Sharma 

