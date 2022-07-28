

# Python3 implementation of the approach  
  
# function to count all permutations  
def countPermutations(N, B):  
  
    # count of all permutations  
    x = B ** N  
  
    # count of permutations  
    # with leading zeros  
    y = B ** (N - 1)  
  
    # Return the permutations  
    # without leading zeros  
    print(x - y)  
  
# Driver code  
if __name__ == "__main__": 
  
    N, B = 6, 4
    countPermutations(N, B)  
  
# This code is contributed by Rituraj Jain 

