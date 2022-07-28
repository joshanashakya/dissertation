

# Python3 implementation of the approach  
  
# Function to return the number of moves  
def minimumMoves(n, a, s, t):  
  
    x = s  
    for i in range(1, n+1):   
        # Destination reached 
        if x == t: 
            return i-1
        x = a[x]  
       
    return -1 
    
# Driver Code  
if __name__ == "__main__": 
  
    s, t = 2, 1 
    a = [-1, 2, 3, 4, 1]  
    n = len(a)  
    print(minimumMoves(n, a, s, t))  
   
# This code is contributed by Rituraj Jain 

