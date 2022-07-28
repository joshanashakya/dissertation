

# Python 3 implementation  
# of above approach 
  
# Function to find the  
# B start to C 
def Race(B, C): 
  
    result = 0; 
  
    # When B completed it's 100 meter 
    # then Completed meters by C is 
    result = ((C * 100) // B) 
  
    return 100 - result 
  
# Driver Code 
if __name__ == "__main__": 
    B = 10
    C = 28
      
    # When A completed it's 100 meter 
    # Then completed meters of B and C is 
    B = 100 - B; 
    C = 100 - C; 
      
    print(str(Race(B, C)) + " meters") 
  
# This code is contributed  
# by ChitraNayal 

