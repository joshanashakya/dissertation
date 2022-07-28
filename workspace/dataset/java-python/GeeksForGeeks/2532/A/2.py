

# Python 3 implementation of the approach 
  
# Function that returns the  
# required moves 
def countMoves(n): 
  
    ct = 0
    for i in range(1, n + 1): 
        ct += i * (n - i) 
  
    # Final move 
    ct += n 
    return ct 
  
# Driver Code 
if __name__ == "__main__": 
    n = 3
    print(countMoves(n)) 
  
# This code is contributed  
# by ChitraNayal 

