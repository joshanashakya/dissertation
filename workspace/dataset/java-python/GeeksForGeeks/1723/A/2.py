

# Program to find nth  
# centered hexadecagonal  
# number 
  
# centered hexadecagonal  
# function 
def center_hexadecagonal_num(n): 
      
    # Formula to calculate  
    # nth centered hexadecagonal 
    # number 
    return 8 * n * n - 8 * n + 1
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 2
    print(n,"nd centered hexadecagonal " + 
                              "number : ", 
              center_hexadecagonal_num(n)) 
    n = 12
    print(n,"th centered hexadecagonal " + 
                              "number : ", 
              center_hexadecagonal_num(n)) 
                  
# This code is contributed 
# by akt_mit 

