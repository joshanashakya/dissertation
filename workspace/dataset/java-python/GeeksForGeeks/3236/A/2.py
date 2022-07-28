

# Python3 program to check if  
# difference of areas of two  
# sqaures is prime or not when 
# side length is large 
  
def isPrime(n) :  
      
    # Corner cases  
    if (n <= 1) :  
        return False
    if (n <= 3) :  
        return True
  
    # This is checked so that we   
    # can skip middle five numbers 
    # in below loop  
    if (n % 2 == 0 or n % 3 == 0) :  
        return False
  
    i = 5
    while(i * i <= n) :  
        if (n % i == 0 or n % (i + 2) == 0) :  
            return False
        i = i + 6
  
    return True
  
# Function to check if difference  
# of areas of square is prime 
def isDiffPrime(a, b): 
  
    # when a+b is prime and a-b is 1 
    if (isPrime(a + b) and a - b == 1): 
        return True
    else: 
        return False
  
# Driver code 
a = 6
b = 5
  
if (isDiffPrime(a, b)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed by ihritik 

