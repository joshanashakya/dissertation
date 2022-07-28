

# Python3 implementation of above approach 
  
# function to calculate coin. 
def coin(totalRupees, X, Y, Z): 
  
    # Converting each of them in rupees. 
    # As we are given totalRupees = 1800 
    one = X * 1
    fifty = ((Y * 1) / 2.0) 
    twentyfive = ((Z * 1) / 4.0) 
    total = one + fifty + twentyfive 
    result = ((totalRupees) / total) 
  
    return int(result) 
  
# Driver code 
if __name__=='__main__': 
    totalRupees = 1800
    X, Y, Z = 1, 2, 4
  
    Rupees = coin(totalRupees, X, Y, Z) 
  
    print("1 rupess coins = ", Rupees * 1) 
    print("50 paisa coins = ", Rupees * 2) 
    print("25 paisa coins = ", Rupees * 4) 
  
# This code is contributed by 
# Sanjit_Prasad 

