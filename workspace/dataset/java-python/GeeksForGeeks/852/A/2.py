

# Python3 code implementing the 
# given approach 
  
def findOnBulbs(numberOfBulbs):  
  
    # initializing the result  
    onBulbs = 0
      
    # to loop over all bulbs from 
    # 1 to numberOfBulbs  
    bulb = 1
      
    # to loop over persons to check  
    # whether their person number  
    person = 1
      
    # Is a factor of light bulb number or not  
    for bulb in range(1, numberOfBulbs + 1):  
          
        # inner loop to find factors of 
        # given bulb to count the number  
        # of factors of a given bulb  
        factors = 0
          
        for person in range(1, int(numberOfBulbs**(0.5)) + 1):  
            if bulb % person == 0: # person is a factor  
                factors += 1
                  
                # bulb != person*person  
                if bulb // person != person:  
                    factors += 1
                  
        # if number of factors is odd, then the  
        if factors % 2 == 1:  
          
            # light bulb will be "on" in the end  
            print("Light bulb", bulb, "will be on") 
            onBulbs += 1
          
    return onBulbs  
  
# Driver Code 
if __name__ == "__main__":  
  
    # total number of light bulbs  
    numberOfBulbs = 1000
      
    # to find number of on bulbs in  
    # the end after all persons have  
    # flipped the light bulbs  
    onBulbs = findOnBulbs(numberOfBulbs)  
      
    print("Total", onBulbs, "light bulbs will", 
                     "be on in the end out of",  
                  numberOfBulbs, "light bulbs") 
      
# This code is contributed  
# by Rituraj Jain 

