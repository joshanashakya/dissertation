

# Python3 implementation of the approach  
from math import gcd 
  
# Function to return the winner  
# of the game  
def getWinner(arr, n) : 
      
    # To store the gcd of the  
    # original array  
    __gcd = arr[0];  
  
    # To store the maximum element  
    # from the original array  
    maxEle = arr[0];  
    for i in range(1, n) :  
        __gcd = gcd(__gcd, arr[i]);  
        maxEle = max(maxEle, arr[i]);  
      
    totalMoves = (maxEle / __gcd) - n;  
  
    # If number of moves are odd  
    if (totalMoves % 2 == 1) : 
        return 'A';  
  
    return 'B';  
  
# Driver Code  
if __name__ == "__main__" : 
      
    arr = [ 5, 6, 7 ];  
    n = len(arr) 
    print(getWinner(arr, n)) 
      
# This code is contributed by Ryuga 

