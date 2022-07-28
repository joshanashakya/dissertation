

# Python3 implementation of the approach  
from math import ceil 
  
# Function to calculate Indian Standard Time  
def cal_IST(h, r) :  
  
    IST = round((h * r * 1.0) / 360, 3);  
  
    # Separate integer part  
    int_IST = int(IST);  
  
    # Separate float part and return ceil value  
    float_IST = ceil((IST - int_IST) * 60);  
  
    print(int_IST, ":", float_IST);  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Number of hours (1 - 24)  
    h = 20;  
  
    # Rotations in degrees  
    r = 150;  
  
    cal_IST(h, r);  
  
# This code is contributed by AnkitRai01 

