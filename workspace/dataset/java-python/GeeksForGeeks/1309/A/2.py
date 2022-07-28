

# Python3 implementation of the approach  
COST = 3;  
  
# Function to find maximum fruits  
# Can buy from given values of x, y, z.  
def maxItems(x, y, z) :  
  
    # Items of type 1 that can be bought  
    type1 = x // COST;  
  
    # Update the coins  
    x %= COST;  
  
    # Items of type 2 that can be bought  
    type2 = y // COST;  
  
    # Update the coins  
    y %= COST;  
  
    # Items of type 3 that can be bought  
    type3 = z // COST;  
  
    # Update the coins  
    z %= COST;  
  
    # Items of type 4 that can be bought  
    # To buy a type 4 item, a coin  
    # of each type is required  
    type4 = min(x, min(y, z));  
  
    # Total items that can be bought  
    maxItems = type1 + type2 + type3 + type4;  
    return maxItems;  
  
# Driver code  
if __name__ == "__main__" :  
  
    x = 4; y = 5; z = 6;  
  
    print(maxItems(x, y, z));  
  
# This code is contributed by AnkitRai01 

