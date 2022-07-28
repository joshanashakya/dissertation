

# Python3 implementation of the approach 
  
# Function to return the count 
# of divisors of a number 
def divisor(a): 
  
    div = 1; 
    count = 0; 
    for i in range(2, int(pow(a, 1 / 2)) + 1): 
  
        # Count the powers of the current 
        # prime i which divides a 
        while (a % i == 0): 
            count += 1; 
            a = a / i; 
              
        # Update the count of divisors 
        div = div * (count + 1); 
  
        # Reset the count 
        count = 0; 
      
    # If the remaining a is prime then a^1 
    # will be one of its prime factors 
    if (a > 1):  
        div = div * (2); 
      
    return div; 
  
# Function to count numbers having odd 
# number of divisors in range [A, B] 
def OddDivCount(a, b): 
  
    # To store the count of elements 
    # having odd number of divisors 
    res = 0; 
  
    # Iterate from a to b and find the 
    # count of their divisors 
    for i in range(a, b + 1): 
          
        # To store the count of divisors of i 
        divCount = divisor(i); 
  
        # If the divisor count of i is odd 
        if (divCount % 2):  
            res += 1; 
  
    return res; 
  
# Driver code 
if __name__ == '__main__': 
    a, b = 1, 10; 
    print(OddDivCount(a, b)); 
  
# This code is contributed by PrinciRaj1992 

