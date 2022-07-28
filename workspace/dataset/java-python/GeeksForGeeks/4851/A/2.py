

# Program to find nth 
# centered decagonal number 
  
# Centered decagonal 
# number function 
def centereddecagonalnum(n) : 
      
    # Formula to calculate  
    # nth centered decagonal  
    # number & return it 
    # into main function. 
    return (5 * n * n + 
            5 * n + 1) 
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 5
    print(n,"th centered decagonal " +
                          "number : ",  
              centereddecagonalnum(n)) 
  
    n = 9
    print(n,"th centered decagonal " +
                          "number : ",  
              centereddecagonalnum(n)) 
                
# This code is contributed by m_kit 

