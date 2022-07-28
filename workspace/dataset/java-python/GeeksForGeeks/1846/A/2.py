

# Python3 program to check if XOR of 
# all numbers in range [L, R]  
# is Even or odd 
  
  
# Function to check if XOR of all numbers 
# in range [L, R] is Even or Odd 
  
def isEvenOrOdd( L, R ): 
  
    # Count odd Numbers in range [L, R] 
    oddCount = (R - L )/2
      
    if( R % 2 == 1 or L % 2 == 1): 
        oddCount = oddCount + 1
      
      
    # Check if count of odd Numbers 
    # is even or odd 
      
    if(oddCount % 2 == 0 ): 
        return "Even"
    else : 
        return "Odd"
          
  
      
# Driver Code 
  
L = 5
R = 15
  
print(isEvenOrOdd(L, R)); 

