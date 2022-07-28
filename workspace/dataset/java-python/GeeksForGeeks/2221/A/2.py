

# Python 3 program to count pairs whose sum  
# of squares is N  
  
# From math import everything 
from math import *
  
# Function to count the pairs satisfying  
# a ^ 2 + b ^ 2 = N  
def countPairs(N) : 
    count = 0
  
    # Check for each number 1 to sqrt(N)  
    for i in range(1, int(sqrt(N)) + 1) : 
  
        # Store square of a number  
        sq = i * i 
  
        # Subtract the square from given N 
        diff = N - sq 
  
        #  Check if the difference is also  
        # a perfect square  
        sqrtDiff = int(sqrt(diff)) 
  
        # If yes, then increment count 
        if sqrtDiff * sqrtDiff == diff : 
            count += 1
  
    return count 
  
# Driver code      
if __name__ == "__main__" : 
  
    # Loop to Count no. of pairs satisfying  
    # a ^ 2 + b ^ 2 = i for N = 1 to 10  
    for i in range(1,11) : 
        print("For n =",i,", ",countPairs(i),"pair exists") 
  
   
# This code is contributed by ANKITRAI1 

