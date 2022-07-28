

# Python3 implementation of the approach  
  
# Function to return the count of  
# possible steps in a single direction  
def steps(cur, x, n):  
  
    # It can cover infinte steps  
    if x == 0: 
        return float('inf')  
  
    # We are approaching towards X = N  
    elif x > 0: 
        return abs((n - cur) // x)  
  
    # We are approaching towards X = 1  
    else: 
        return abs(int((cur - 1) / x))  
  
# Function to return the count of steps  
def countSteps(curx, cury, n, m, moves):  
  
    count = 0
    k = len(moves)  
    for i in range(0, k):  
        x = moves[i][0]  
        y = moves[i][1] 
  
        # Take the minimum of both moves  
        # independently  
        stepct = min(steps(curx, x, n),  
                     steps(cury, y, m))  
  
        # Update count and current positions  
        count += stepct  
        curx += stepct * x  
        cury += stepct * y 
      
    return count  
  
# Driver code  
if __name__ == "__main__": 
  
    n, m, x, y = 4, 5, 1, 1
    moves = [[1, 1], [1, 1], [0, -2]] 
      
    print(countSteps(x, y, n, m, moves)) 
  
# This code is contributed  
# by Rituraj Jain 

