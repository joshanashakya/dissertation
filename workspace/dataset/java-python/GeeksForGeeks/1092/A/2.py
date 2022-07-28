

# Python 3 implementation of the approach 
from math import gcd 
  
# Function to return the lcm of 
# all the elements of the array 
def lcmOfArray(arr, n): 
    if (n < 1): 
        return 0
  
    lcm = arr[0] 
  
    # To calculate lcm of two numbers 
    # multiply them and divide the result 
    # by gcd of both the numbers 
    for i in range(1, n, 1): 
        lcm = int((lcm * arr[i]) / 
               gcd(lcm, arr[i])) 
  
    # Return the LCM of the array elements 
    return lcm 
  
# Function to return the smallest perfect  
# square divisible by all the elements of arr[] 
def minPerfectSquare(arr, n): 
      
    # LCM of all the elements of arr[] 
    lcm = lcmOfArray(arr, n) 
    minPerfectSq = int(lcm) 
  
    # Check if 2 divides lcm odd 
    # number of times 
    cnt = 0
    while (lcm > 1 and lcm % 2 == 0): 
        cnt += 1
        lcm /= 2
      
    if (cnt % 2 != 0): 
        minPerfectSq *= 2
  
    i = 3
      
    # Check all the numbers that divide  
    # lcm odd number of times 
    while (lcm > 1): 
        cnt = 0; 
        while (lcm % i == 0): 
            cnt += 1
            lcm /= i 
  
        # If i divided lcm odd number of  
        # times then multiply the lcm with i 
        if (cnt % 2 != 0): 
            minPerfectSq *= i 
  
        i += 2
  
    # Return the answer 
    return minPerfectSq 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 3, 4, 5, 7] 
    n = len(arr) 
    print(minPerfectSquare(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

