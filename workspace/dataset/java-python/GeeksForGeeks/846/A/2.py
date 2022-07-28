

# Python 3 implementation of the approach 
  
# Function that returns true if it possible 
# to form a team with the given n and m 
def canFormTeam(n, m): 
  
    # 1 person of Type1 and 2 persons of Type2 
    # can be chosen 
    if (n >= 1 and m >= 2): 
        return True
  
    # 1 person of Type2 and 2 persons of Type1 
    # can be chosen 
    if (m >= 1 and n >= 2): 
        return True
  
    # Cannot from a team 
    return False
  
# Function to return the maximum number of teams 
# that can be formed 
def maxTeams(n, m): 
    # To store the required count of teams formed 
    count = 0
  
    while (canFormTeam(n, m)): 
        if (n > m): 
            # Choose 2 persons of Type1 
            n -= 2
  
            # And 1 person of Type2 
            m -= 1
        
        else: 
            # Choose 2 persons of Type2 
            m -= 2
  
            # And 1 person of Type1 
            n -= 1
  
        # Another team has been formed 
        count += 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    n = 4
    m = 5
    print(maxTeams(n, m)) 
  
# This code is contributed by 
# Surendra_Gangwar 

