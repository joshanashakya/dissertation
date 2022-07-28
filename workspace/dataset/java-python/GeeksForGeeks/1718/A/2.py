

# Program to find nth centered  
# tridecagonal number 
  
# Function to find centered 
# tridecagonal number 
def centeredTridecagonalNum(n) : 
      
    # Formula to calculate nth 
    # centered tridecagonal number 
    return (13 * n * 
           (n - 1) + 2) // 2
  
# Driver Code 
if __name__ == '__main__' : 
          
    n = 3
    print(centeredTridecagonalNum(n)) 
    n = 10
    print(centeredTridecagonalNum(n)) 
                  
# This code is contributed 
# by akt_mit 

