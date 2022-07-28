

# Python3 implementation of the approach  
      
# Function to return the cost to  
# make string a Panagram  
def costToPanagram(string, cost):  
  
    n = len(string)  
    occurrences = [0] * 26
  
    # Count the occurrences of each  
    # lowercase character  
    for i in range(n): 
        occurrences[ord(string[i]) - ord('a')] += 1
  
    # To store the total gain  
    gain = 0
    for i in range(26): 
  
        # If some character is missing, 
        # it has to be added at twice the cost  
        if occurrences[i] == 0:  
            gain -= 2 * cost[i]  
  
        # If some character appears more than  
        # once all of its occurrences except 1  
        # can be traded for some gain  
        elif occurrences[i] > 1:  
            gain += cost[i] * (occurrences[i] - 1)  
  
    # If gain is more than the cost  
    if gain >= 0:  
        return 0
  
    # Return the total cost if gain < 0  
    return gain * -1
  
# Driver code  
if __name__ == "__main__": 
      
    cost = [1, 1, 1, 1, 1, 1, 1,  
               1, 1, 1, 1, 1, 1, 
            1, 1, 1, 1, 1, 1, 1,  
               1, 1, 1, 1, 1, 1]  
      
    string = "geeksforgeeks"
  
    print(costToPanagram(string, cost))  
      
# This code is contributed 
# by Rituraj Jain 

