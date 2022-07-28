

# Python 3 Program to find nth  
# Centered octahedral number 
  
# Centered octahedral  
# number function 
def centeredOctahedral(n) : 
      
    # Formula to calculate nth 
    # Centered octahedral number 
    # return it into main function. 
    return (2 * n + 1) * ( 
            2 * n * n + 
            2 * n + 3) // 3
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 3
    print(centeredOctahedral(n)) 
    n = 9
    print(centeredOctahedral(n)) 
  
# This code is contributed ajit 

