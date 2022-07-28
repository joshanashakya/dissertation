

# Python 3 implementation of  
# above approach 
  
# Function to count the 
# number of tower 
def number_of_tower(house, r, n): 
  
    # first we sort the house numbers 
    house.sort() 
  
    # for count number of twoers 
    numOfTower = 0
  
    # for iterate all houses 
    i = 0
    while (i < n) : 
  
        # count number of towers 
        numOfTower += 1
  
        # find find the middle location 
        loc = house[i] + r 
  
        # traverse till middle location 
        while (i < n and house[i] <= loc): 
            i += 1
  
        # this is point to middle 
        # house where we insert the tower 
        i -= 1
  
        # now find the last location 
        loc = house[i] + r 
  
        # traverse till last house  
        # of the range 
        while (i < n and house[i] <= loc): 
            i += 1
  
    # return the number of tower 
    return numOfTower 
  
# Driver code 
if __name__ == "__main__": 
      
    # given elements 
    house = [ 7, 2, 4, 6, 5, 9, 12, 11 ] 
    r = 2
    n = len(house) 
  
    # print number of towers 
    print(number_of_tower(house, r, n)) 
  
# This code is contributed 
# by ChitraNayal 

