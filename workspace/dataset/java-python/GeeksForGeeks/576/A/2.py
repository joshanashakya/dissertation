

# Python3 program to find the player 
# who wins the game 
  
# Function to check the  
# wining player 
def findWinner(n): 
      
    # As discussed in the  
    # above approach 
    if ((n - 1) % 6 == 0):  
        print("Second Player wins the game"); 
    else: 
        print("First Player wins the game"); 
      
# Driver Code 
if __name__ == '__main__': 
    n = 7; 
    findWinner(n); 
  
# This code is contributed by 29AjayKumar 

