

# Python 3 program to find nth  
# centered hexagonal number 
  
# Function to find  
# centered hexagonal number 
def centeredHexagonalNumber(n) : 
      
    # Formula to calculate  
    # nth centered hexagonal 
    return 3 * n * (n - 1) + 1
  
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 10
    print(n, "th centered hexagonal number: "
                , centeredHexagonalNumber(n)) 
  
  
# This code is contributed 
# by 'Akanshgupta' 

