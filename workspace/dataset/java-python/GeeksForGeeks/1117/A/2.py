

# Python3 program to Find the minimum  
# sum of given array after applying  
# given operation. 
import math 
  
# Function to Find the minimum sum 
# of given array after applying  
# given operation. 
def MinSum(a, n): 
  
    # to store final gcd value 
    gcd = a[0] 
  
    # get gcd of the whole array 
    for i in range(1, n): 
        gcd = math.gcd(a[i], gcd) 
  
    return n * gcd 
  
# Driver code 
if __name__ == "__main__": 
  
    a = [20, 14, 6, 8, 15 ] 
  
    n = len(a) 
  
    # function call 
    print(MinSum(a, n)) 
  
# This code is contributed by ita_c 

