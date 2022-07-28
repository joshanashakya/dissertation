

# Python 3 program to print the winner of the game 
  
# Function that returns the winner of the game 
def returnWinner(s, l): 
      
    # Initialize the freq array to 0 
    freq = [0 for i in range(26)] 
  
    # Iterate and count the frequencies 
    # of each character in the string 
    for i in range(0, l, 1): 
        freq[ord(s[i]) - ord('a')] += 1
  
    cnt = 0
  
    # Count the odd occurring character 
    for i in range(26): 
          
        # If odd occurrence 
        if (freq[i] % 2 != 0): 
            cnt += 1
  
    # Check condition for Player-1  
    # winning the game 
    if (cnt == 0 or cnt & 1 == 1): 
        return 1
    else: 
        return 2
  
# Driver code 
if __name__ == '__main__': 
    s = "abaaab"
    l = len(s) 
  
    # Function call that returns the winner 
    winner = returnWinner(s, l) 
  
    print("Player-", winner) 
      
# This code is contributed by 
# Surendra_Gangwar 

