

# Python3 implementation of the above approach 
import math as mt 
  
# Function to check for a prime number 
def Prime(n): 
      
    if n == 1: 
        return False
          
    for i in range(2, mt.ceil(mt.sqrt(n + 1))): 
        if n % i == 0: 
            return False
    return True
      
# Function to find the sum of array 
def checkSumPrime(string): 
    summ = 0
    for i in range(1, len(string)): 
        summ += abs(int(string[i - 1]) - 
                    int(string[i])) 
          
    if Prime(summ): 
        return True
    else: 
        return False
  
# Driver code 
num = 142
  
string = str(num) 
  
s = [i for i in string] 
  
if checkSumPrime(s): 
    print("Prime") 
else: 
    print("Not Prime\n") 
  
# This code is contributed by Mohit Kumar 

