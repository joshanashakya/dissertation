

# Python3 implementation of the approach  
  
# Function to return the  
# winner of the game  
def getWinner(string, length) : 
  
    # To store the count of silver coins  
    total = 0;  
    for i in range(length) :  
  
        # Update the position of  
        # the gold coin  
        if (string[i] == 'S') : 
            total += 1;  
  
    # First player will win the game  
    if ((total % 2) == 1) : 
        return "First";  
    return "Second";  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "GSSS";  
    length = len(string);  
  
    print(getWinner(string, length));  
      
# This code is contributed by kanugargng 

