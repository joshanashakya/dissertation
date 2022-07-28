

# Python3 implementation of the approach 
  
# Function to return the sum  
# of the digits of num ^ 2 
def squareDigitSum(num): 
  
    # To store the number of 1's 
    lengthN = len(num) 
  
    # Find the sum of the digits of num ^ 2 
    result = (lengthN//9)*81 + (lengthN % 9)**2
  
    return result 
  
# Driver code 
if __name__ == "__main__" : 
  
    N = "1111"
    print(squareDigitSum(N)) 

