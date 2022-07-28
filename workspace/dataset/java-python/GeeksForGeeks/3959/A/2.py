

# Program to find nth  
# Heptagonal number 
  
# Function to find  
# nth Heptagonal number 
def heptagonalNumber(n) : 
      
    # Formula to calculate  
    # nth Heptagonal number 
    return ((5 * n * n) - 
            (3 * n)) // 2
  
# Driver Code 
if __name__ == '__main__' : 
    n = 2
    print(heptagonalNumber(n)) 
    n = 15
    print(heptagonalNumber(n)) 
                  
# This code is contributed 
# by ajit 

