

# Program to find nth  
# centered octagonal number 
  
def cen_octagonalnum(n) : 
      
    # Formula to calculate nth 
    # centered octagonal number 
    return (4 * n * n -
            4 * n + 1) 
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 6
    print(n,"th Centered",  
            "octagonal number: ", 
             cen_octagonalnum(n)) 
    n = 11
    print(n,"th Centered" , 
            "octagonal number: ", 
             cen_octagonalnum(n)) 
                  
# This code is contributed 
# by akt_mit 

