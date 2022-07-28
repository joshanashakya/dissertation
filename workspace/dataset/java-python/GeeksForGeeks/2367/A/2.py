

# Python3 implementation of above approach.  
  
# Function that will find loss  
def Loss(SP, P):  
      
    loss = 0
    loss = ((2 * P * P * SP) / 
            (100 * 100 - P * P))  
    print("Loss =", round(loss, 3))  
  
# Driver Code  
if __name__ == "__main__": 
  
    SP, P = 2400, 30
  
    # Calling Function  
    Loss(SP, P)  
  
# This code is contributed by Rituraj Jain 

