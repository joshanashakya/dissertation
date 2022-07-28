

# implementation of the approach 
from math import pow
  
# Function to return the count 
# of digits in num 
def countDigits(num): 
    cnt = 0
    while (num > 0): 
        cnt += 1
        num //= 10
    return cnt 
  
# Function to return the sum 
# of first n digits of num 
def sumFromStart(num, n, rem): 
      
    # Remove the unnecessary digits 
    num //= pow(10, rem) 
  
    sum = 0
    while (num > 0): 
        sum += (num % 10) 
        num //= 10
    return sum
  
# Function to return the sum 
# of the last n digits of num 
def sumFromEnd(num, n): 
    sum = 0
    for i in range(n): 
        sum += (num % 10) 
        num //= 10
      
    return sum
  
def getAverage(n, k, l): 
      
    # If the average can't be calculated without 
    # using the same digit more than once 
    totalDigits = countDigits(n) 
    if (totalDigits < (k + l)): 
        return -1
  
    # Sum of the last l digits of n 
    sum1 = sumFromEnd(n, l) 
  
    # Sum of the first k digits of n 
    # (totalDigits - k) must be removed from the 
    # end of the number to get the remaining 
    # k digits from the beginning 
    sum2 = sumFromStart(n, k, totalDigits - k) 
  
    # Return the average 
    return (sum1 + sum2) / (k + l) 
  
# Driver code 
if __name__ == '__main__': 
    n = 123456
    k = 2
    l = 3
    print(getAverage(n, k, l)) 
  
# This code is contributed by 
# Surendra_Gangwar 

