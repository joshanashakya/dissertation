

# Python 3 Program to find minimum cost to 
# construct a string 
  
def minCost(s): 
      
    # Initially all characters are un-seen 
    alphabets = [False for i in range(26)] 
  
    # Marking seen characters 
    for i in range(len(s)): 
        alphabets[ord(s[i]) - 97] = True
  
    # Count total seen character, and that 
    # is the cost 
    count = 0
    for i in range(26): 
        if (alphabets[i]): 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == '__main__': 
      
    # s is the string that needs to  
    # be constructed 
    s = "geeksforgeeks"
  
    print("Total cost to construct", s,  
                      "is", minCost(s)) 
      
# This code is contributed by 
# Surendra_Gangwar 

