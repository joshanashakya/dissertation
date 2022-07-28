

# Python 3 Program to find  
# nth Centered cube number 
  
# Centered cube  
# number function 
def centered_cube(n) : 
      
    # Formula to calculate  
    # nth Centered cube  
    # number return it  
    # into main function. 
    return (2 * n + 1) * ( 
                n * n + n + 1) 
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 3
    print(n,"th Centered cube " + 
                    "number : " ,  
                centered_cube(n)) 
  
    n = 10
    print(n,"th Centered cube " + 
                    "number : " ,  
                centered_cube(n)) 
  
# This code is contributed by ajit 

