

# Python 3 program to count unary numbers 
# in a range 
  
# Function to check if a number is unary 
def isUnary(n): 
      
    # Base case. Note that if we repeat 
    # above process for 7, we get 1. 
    if (n == 1 or n == 7): 
        return True
    elif (int(n / 10) == 0): 
        return False
  
    # rec case 
    sum = 0
    while (n != 0): 
        x = n % 10
        sum = sum + x * x 
        n = int(n / 10) 
  
    return isUnary(sum) 
  
# Function to count unary numbers 
# in a range 
def countUnary(a, b): 
    count = 0
  
    for i in range(a, b + 1, 1): 
        if (isUnary(i) == 1): 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    a = 1000
    b = 1099
  
    print(countUnary(a, b)) 
      
# This code is contributed by 
# Sanjit_Prasad 

