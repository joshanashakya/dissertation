

# Python 3 program to find if it  
# is possible to get the ratio r 
  
# Returns true if it is  
# possible to get ratio r  
# from given cost and  
# quantity ranges. 
def isRatioPossible(lowCost, upCost,  
                    lowQuant, upQuant, r) : 
      
    for i in range(lowQuant, upQuant + 1) : 
          
        # Calculating cost corresponding 
        # to value of i 
        ans = i * r 
          
        if (lowCost <= ans and ans <= upCost) : 
            return True
              
    return False
  
      
# Driver Code 
lowCost = 14; upCost = 30
lowQuant = 5; upQuant = 12; r = 9
  
if (isRatioPossible(lowCost, upCost, 
                    lowQuant,upQuant, r)) : 
    print( "Yes" ) 
else : 
    print( "No" ) 
      
# This code is contributed  
# by Nikita Tiwari. 

