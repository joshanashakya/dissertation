

# Python3 implementation of the above approach 
  
# Function that will check 
# whether number is prime or not 
def prime(n): 
    for i in range(2, n + 1): 
        if i * i > n + 1: 
            break
  
        if (n % i == 0): 
            return False
  
    return True
  
# Function to print the 3rd number 
def thirdNumber(a, b): 
    summ = 0
    temp = 0
  
    summ = a + b 
    temp = 1
  
    #If the summ is odd 
    if (summ & 1): 
        temp = 2
  
    #If summ is not prime 
    while (prime(summ + temp) == False): 
        temp += 2
  
    print(temp) 
  
# Driver code 
a = 3
b = 5
  
thirdNumber(a, b) 
  
# This code is contributed by Mohit Kumar 

