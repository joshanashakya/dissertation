

# Python3 implementation of the approach 
  
# Function to return the 
# winner of the game 
def winner(moves): 
    data = dict() 
    data['R'] = 0
    data['P'] = 1
    data['S'] = 2
  
    # Both the players chose to 
    # play the same move 
    if (moves[0] == moves[1]): 
        return "Draw"
  
    # Player A wins the game 
    if (((data[moves[0]] | 1 << (2)) - 
         (data[moves[1]] | 0 << (2))) % 3): 
        return "A"
  
    return "B"
  
# Function to perform the queries 
def performQueries(arr,n): 
    for i in range(n): 
        print(winner(arr[i])) 
  
# Driver code 
arr = ["RS", "SR", "SP", "PP"] 
n = len(arr) 
  
performQueries(arr, n) 
  
# This code is contributed by Mohit Kumar 

