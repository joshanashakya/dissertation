

# Python3 implementation of the above approach 
  
# Function to check if a number is 
# a perfect Cube or not 
def isPerfectCube(x) : 
    cr = int(x ** (1/3)); 
    return (cr * cr * cr == x); 
  
def canBePerfectCube(N, K) : 
    if (isPerfectCube(N + K) or isPerfectCube(N - K)) : 
        print("Yes"); 
    else : 
        print("No"); 
  
# Driver code 
if __name__ == "__main__" :  
  
    N = 7; K = 1; 
    canBePerfectCube(N, K); 
  
    N = 5; K = 4; 
    canBePerfectCube(N, K); 
  
    N = 7; K = 2; 
    canBePerfectCube(N, K); 
  
# This code is contributed by Yash_R 

