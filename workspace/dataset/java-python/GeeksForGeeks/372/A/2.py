

# Python 3 implementation to find Cost price 
  
# Function to calculate cost price with profit 
def CPwithProfit(sellingPrice, profit): 
      
    # required formula to calculate CP with profit 
    costPrice = ((sellingPrice * 100.0) / 
                        (100 + profit)) 
    return costPrice 
  
# Function to calculate cost price with loss 
def CPwithLoss(sellingPrice, loss): 
      
    # required formula to calculate CP with loss 
    costPrice = ((sellingPrice * 100.0) /
                          (100 - loss)) 
    return costPrice 
  
# Driver code 
if __name__ == '__main__': 
    SP = 1020
    profit = 20
    print("Cost Price =", CPwithProfit(SP, profit)) 
  
    SP = 900
    loss = 10
    print("Cost Price =", CPwithLoss(SP, loss)) 
  
    SP = 42039
    profit = 8
    print("Cost Price =", int(CPwithProfit(SP,  
                                     profit))) 
  
# This code is contributed by 
# Surendra_Gangwar 

