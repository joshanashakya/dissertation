

# Python 3 Program to implement above code.  
  
# function to calculate the length of bridge.  
def bridge_length(trainLength, Speed, Time) : 
  
    return ((Time * Speed) - trainLength) 
      
# Driver Code 
if __name__ == "__main__" : 
  
    # Assuming the input variables  
    trainLength = 120
    Speed = 30
    Time = 18
  
    print("Length of bridge = ",bridge_length 
            (trainLength, Speed, Time),"meters") 
  
# This code is contributed by ANKITRAI1 

