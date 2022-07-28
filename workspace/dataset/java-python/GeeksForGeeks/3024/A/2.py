

# Python 3 implementation of the  
# above approach 
from math import floor, pow
  
import sys 
  
# Function to return digit sum 
def digitSum(n): 
    ans = 0; 
    while (n): 
        ans += n % 10; 
        n = int(n / 10); 
  
    return ans 
  
# Function to find out the smallest  
# integer 
def findInt(n, m): 
    minDigit = floor(m / 9) 
  
    # Start of the iterator (Smallest  
    # multiple of n) 
    start = (int(pow(10, minDigit)) - 
             int(pow(10, minDigit)) % n) 
  
    while (start < sys.maxsize): 
        if (digitSum(start) == m): 
            return start 
        else: 
            start += n 
    return -1
  
# Driver code 
if __name__ == '__main__': 
    n = 13
    m = 32
    print(findInt(n, m)) 
  
# This code is cotributed by 
# Surendra_Gangwar 

