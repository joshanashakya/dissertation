

# Python 3 implementation of 
# above approach  
  
# Function to check if the  
# number is a perfect square 
def isSquare(num) : 
    root = int(num ** (1 / 2)) 
  
    return (root * root) == num 
  
# Function to check if the  
# number is a perfect cube  
def isCube(num) : 
    root = int(num ** (1 / 3)) 
    return (root * root * root ) == num 
  
# Function to count the number  
# of perfect squares and cubes  
def countSC(N) : 
    count = 0
    for i in range(1, N + 1) : 
  
        # If a number is perfect square,  
        if isSquare(i) : 
            count += 1
              
        # Else if the number is cube  
        elif isCube(i) : 
            count += 1
              
    return count 
  
# Driver code 
if __name__ == "__main__" : 
  
    N = 20
  
    print("Number of squares and cubes is ",  
                                 countSC(N)) 
              
# This code is contributed by ANKITRAI1 

