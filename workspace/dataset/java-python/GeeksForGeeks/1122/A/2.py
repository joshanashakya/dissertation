

# Epsilon value is used at various steps  
# to ensure correctness upto 10^15 digits. 
import math 
EPS = 1E-15;  
  
def findMinValue(arr, n):  
  
    # add logarithmic value of all  
    # elements to sum  
    sum = 0;  
    for i in range(n):  
        sum += math.log10(arr[i]) + EPS;  
  
    # to find the nth root of sum  
    xl = (sum / n + EPS);  
  
    # to find the antilog of xl  
    res = math.pow(10.0, xl) + EPS;  
    return math.ceil(res + EPS);  
  
# Driver code  
arr = [4, 2, 1, 10, 6];  
n = len(arr);  
print(findMinValue(arr, n));  
  
# This code is contributed by mits 

