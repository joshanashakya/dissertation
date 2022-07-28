

# Python3 implementation of the approach 
  
# Function to return the sum  
# of the digits of num ^ 2 
def squareDigitSum(num): 
  
    summ = 0
    num = int(num) 
      
    # Store the square of num 
    squareNum = num * num 
  
    # Find the sum of its digits 
    while squareNum > 0: 
        summ = summ + (squareNum % 10) 
        squareNum = squareNum//10
  
    return summ 
      
# Driver code 
if __name__ == "__main__": 
  
    N = "1111"
    print(squareDigitSum(N)) 

