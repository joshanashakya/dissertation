

# Python3 program to find product 
# of ASCII value of characters 
# in string 
  
# Function to find product 
# of ASCII value of characters 
# in string 
def productAscii(str): 
  
    prod = 1
  
    # Traverse string to find the product 
    for i in range(0, len(str)): 
        prod = prod * ord(str[i]) 
  
    # Return the product 
    return prod 
  
# Driver code 
if __name__=='__main__': 
    str = "GfG"
  
    print(productAscii(str)) 
  
# This code is contributed by 
# Sanjit_Prasad 

