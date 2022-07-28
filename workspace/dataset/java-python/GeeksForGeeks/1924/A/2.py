

# Python3 implementation of the approach 
  
# Function to return num % divisor 
# without using % (modulo) operator 
def getRemainder(num, divisor): 
  
    # While divisor is smaller 
    # than n, keep subtracting 
    # it from num 
    while (num >= divisor): 
        num -= divisor; 
  
    return num; 
  
# Driver code 
if __name__ == '__main__': 
  
    num = 100; divisor = 7; 
    print(getRemainder(num, divisor)); 
  
# This code is contributed by Princi Singh 

