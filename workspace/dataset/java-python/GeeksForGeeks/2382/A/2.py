

# Python 3 program to find n-th number 
# in thes sorted list of multiples of  
# two numbers. 
import math 
  
# Return the Nth number in the sorted 
# list of multiples of two numbers. 
def nthElement(a, b, n): 
  
    # Finding LCM of a and b. 
    lcm = (a * b) / int(math.gcd(a, b)) 
  
    # Binary Search. 
    l = 1
    r = min(a, b) * n 
    while (l <= r): 
      
        # Finding the middle element. 
        mid = (l + r) >> 1
  
        # count of number that are less 
        # than mid and multiples of a  
        # and b 
        val = (int(mid / a) + int(mid / b) 
                         - int(mid / lcm)) 
  
        if (val == n): 
            return int( max(int(mid / a) * a, 
                          int(mid / b) * b) ) 
  
        if (val < n): 
            l = mid + 1
        else: 
            r = mid - 1
      
# Driven Program 
a = 5
b = 3
n = 5
print(nthElement(a, b, n)) 
  
# This code is contributed by Smitha. 

