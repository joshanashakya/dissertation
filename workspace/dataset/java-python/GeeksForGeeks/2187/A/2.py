

# Python3 implementation of the approach  
from math import gcd 
  
# Function to return minimum GCD  
# among all subarrays  
def minGCD(arr, n) : 
  
    minGCD = 0; 
      
    # Minimum GCD among all sub-arrays  
    # will be the GCD of all the elements 
    # of the array 
    for i in range(n) : 
        minGCD = gcd(minGCD, arr[i]); 
          
    return minGCD;  
  
# Function to return minimum LCM  
# among all subarrays  
def minLCM(arr, n) : 
  
    minLCM = arr[0];  
  
    # Minimum LCM among all sub-arrays   
    # will be the minimum element from  
    # the array  
    for i in range(1, n) :  
        minLCM = min(minLCM, arr[i]);  
  
    return minLCM;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 66, 14, 521 ];  
    n = len(arr);  
  
    print("LCM = ", minLCM(arr, n),  
          ", GCD =", minGCD(arr, n));  
  
# This code is contributed by Ryuga 

