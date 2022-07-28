

# Python3 implementation of the approach 
  
# Function to return the sum  
# of the digits of n 
def sumOfDigits(n) : 
  
    res = 0; 
  
    # Loop for each digit of the number 
    while (n > 0) : 
        res += n % 10
        n /= 10
  
    return res; 
  
# Function to return the greatest 
# number less than n such that 
# the sum of its digits is greater 
# than the sum of the digits of n 
def findNumber(n) : 
  
    # Starting from n-1 
    i = n - 1; 
  
    # Check until 1 
    while (i > 0) : 
  
        # If i satisfies the given condition 
        if (sumOfDigits(i) > sumOfDigits(n)) : 
            return i 
              
        i -= 1
  
    # If the condition is not satisfied 
    return -1; 
  
# Driver code 
if __name__ == "__main__" : 
      
    n = 824; 
    print(findNumber(n)) 
  
# This code is contributed by Ryuga 

