

# Python 3 code for implementing cos function 
  
from math import fabs, cos 
  
# Function for calculation 
def cal_cos(n): 
    accuracy = 0.0001
  
    # Converting degrees to radian 
    n = n * (3.142 / 180.0) 
      
    x1 = 1
      
    # maps the sum along the series 
    cosx = x1 
      
    # holds the actual value of sin(n) 
    cosval = cos(n) 
    i = 1
  
    denominator = 2 * i * (2 * i - 1) 
    x1 = -x1 * n * n / denominator 
    cosx = cosx + x1 
    i = i + 1
    while (accuracy <= fabs(cosval - cosx)): 
        denominator = 2 * i * (2 * i - 1) 
        x1 = -x1 * n * n / denominator 
        cosx = cosx + x1 
        i = i + 1
  
    print('{0:.6}'.format(cosx)) 
  
# Driver Code 
if __name__ == '__main__': 
    n = 30
    cal_cos(n) 
  
# This code is contributed by 
# Sahil_Shelangia 

