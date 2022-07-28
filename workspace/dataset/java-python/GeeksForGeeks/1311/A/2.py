

# from math module import everything 
from math import *
  
# Python 3 implementation of above approach 
  
# Function to count the divisors  
def countDivisors(n) : 
    count = 0
      
    # Note that this loop runs till square root  
    for i in range(1,int(sqrt(n)+1)) : 
        if n % i == 0 : 
  
            # If divisors are equal, print only one  
            if n / i == i : 
                count += 1
                  
            # Otherwise print both 
            else : 
                count += 2
  
    return count 
  
# Function to count the number with  
# maximum divisors  
def MaximumDivisors(X,Y) : 
    result = 0
    maxDivisors = 0
  
    # create list to store number of divisors  
    arr = [] 
      
    # initialize with 0 upto length Y-X+1 
    for i in range(Y - X + 1) : 
        arr.append(0) 
  
    # Traverse from X to Y    
    for i in range(X,Y+1) : 
  
        # Count the number of divisors of i  
        Div = countDivisors(i) 
  
        # Store the value of div in an array  
        arr[i - X] = Div 
          
        # Update the value of maxDivisors  
        maxDivisors = max(Div,maxDivisors) 
          
    # Traverse the array   
    for i in range (Y - X + 1) : 
  
        # Count the value equals to maxDivisors 
        if arr[i] == maxDivisors : 
            result += 1
  
    return result 
  
# Driver code 
if __name__ == "__main__" : 
  
    X, Y = 1, 10
  
    # function call  
    print(MaximumDivisors(X,Y)) 

