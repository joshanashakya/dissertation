

# Python3 program for binomial 
# coefficients 
  
# Function to print binomial table 
def printbinomial (max): 
      
    for m in range(max + 1): 
        print( '% 2d'% m, end = ' ') 
        binom = 1
        for x in range(m + 1): 
              
            # B(m, x) is 1 if either m  
            # or x is is 0. 
            if m != 0 and x != 0: 
                  
                # Otherwise using recursive 
                # formula 
                # B(m, x) = B(m, x - 1) * 
                #           (m - x + 1) / x 
                binom = binom * (m - x + 1) / x 
            print( '% 4d'% binom, end = ' ') 
        print("\n", end = '') 
          
# Driver Function 
max = 10
printbinomial(max) 
  
# This code is contributed by "Sharad_bhardwaj". 

