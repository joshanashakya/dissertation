

# Python 3 implementation of 
# above approach 
  
# Function to calculate the  
# Selling Price 
def SellingPrice (CP, PP): 
      
    # Decimal Equivalent of  
    # Profit Percentage 
    Pdecimal = 1 + ( PP / 100 ) 
      
    res = Pdecimal * CP 
      
    # return the calculated  
    # Selling Price 
    return res 
  
# Driver code 
if __name__ == "__main__" :  
  
    # Get the CP and Profit %  
    C = 720
    P = 13
      
    # Printing the returned value 
    print(SellingPrice(C, P)) 

