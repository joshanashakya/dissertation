

# Python 3 program to find the count  
# of numbers in a range whose smallest 
# factor is K 
  
# Function to check if k is  
# a prime number or not 
def isPrime( k): 
  
    # Corner case 
    if (k <= 1): 
        return False
  
    # Check from 2 to n-1 
    for i in range(2, k): 
        if (k % i == 0): 
            return false 
  
    return True
  
# Function to check if a number  
# is not divisible by any number 
# between 2 and K-1 
def check(num, k): 
    flag = 1
  
    # to check if the num is divisible  
    # by any numbers between 2 and k - 1 
    for i in range(2, k) : 
        if (num % i == 0): 
            flag = 0
  
    if (flag == 1) : 
          
        # if not divisible by any  
        # number between 2 and k - 1 
        # but divisible by k 
        if (num % k == 0): 
            return 1
        else: 
            return 0
    else: 
        return 0
  
# Function to find count of  
# numbers in range [a, b]  
# with smallest factor as K 
def findCount(a, b, k): 
      
    count = 0
  
    # a number can be divisible only  
    # by k and not by any number 
    # less than k only if k is a prime 
    if (not isPrime(k)): 
        return 0
    else : 
          
        for i in range(a, b + 1) : 
  
            # to check if a number has 
            # smallest factor as K 
            ans = check(i, k) 
            if (ans == 1): 
                count += 1
            else: 
                continue
  
    return count 
  
# Driver code 
if __name__ == "__main__": 
    a = 2020
    b = 6300
    k = 29
  
    print(findCount(a, b, k)) 
  
# This code is contributed  
# by ChitraNayal 

