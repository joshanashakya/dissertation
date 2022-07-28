

# Python implementation of the approach  
import math 
  
# Function to return the number of teams  
def number_of_teams(M):  
      
    # To store both roots of the equation  
    N1, N2, sqr = 0,0,0
  
    # sqrt(b^2 - 4ac)  
    sqr = math.sqrt(1 + (8 * M))  
  
    # First root (-b + sqrt(b^2 - 4ac)) / 2a  
    N1 = (1 + sqr) / 2
  
    # Second root (-b - sqrt(b^2 - 4ac)) / 2a  
    N2 = (1 - sqr) / 2
  
    # Return the positive root  
    if (N1 > 0): 
        return int(N1)  
    return int(N2)  
  
# Driver code  
def main():  
    M = 45
    print(number_of_teams(M)) 
if __name__ == '__main__': 
    main() 
      
# This code has been contributed by 29AjayKumar 

