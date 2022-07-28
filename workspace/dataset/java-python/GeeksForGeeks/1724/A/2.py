

# Program to find nth 
# centered octadecagonal number 
  
# Centered octadecagonal 
# number function 
def center_octadecagon_num(n) : 
      
    # Formula to calculate  
    # nth centered octadecagonal 
    # number & return it 
    # into main function. 
    return(9 * n * n - 
           9 * n + 1) 
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 3
    print(n,"rd centered octadecagonal " +
                                "number : ",  
                center_octadecagon_num(n)) 
  
    n = 13
    print(n,"th centered octadecagonal " +
                              "number : ",  
                center_octadecagon_num(n)) 
              
# This code is contributed 
# by akt_mit 

