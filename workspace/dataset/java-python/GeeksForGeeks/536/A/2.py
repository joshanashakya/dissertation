

# Python3 program to count pairs in array  
# such that one element is power of another  
  
from math import log 
  
# Function to check if given number number y  
# is power of x  
def isPower(x, y) :  
  
    # log function to calculate value  
    res1 = log(y) // log(x); 
    res2 = log(y) / log(x); 
      
    # compare to the result1  
    # or result2 both are equal  
    return (res1 == res2);  
  
# Function to find pairs from array  
def countPower( arr, n) : 
      
    res = 0; 
      
    # Iterate through all pairs 
    for i in range(n) : 
        for j in range(i + 1, n) : 
            # Increment count if one is 
            # the power of other 
            if isPower(arr[i], arr[j]) or isPower(arr[j], arr[i]) : 
                res += 1; 
  
    return res;  
  
# Driver code  
if __name__ == "__main__" : 
      
    a = [ 16, 2, 3, 9 ];  
    n = len(a);  
      
    print(countPower(a, n));  
  
# This code is contributed by AnkitRai01 

