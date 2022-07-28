

# Python 3 program to find  
# lower_bound of x in prefix  
# sums array using binary lifting. 
import math 
  
# function to make prefix  
# sums array 
def MakePreSum( arr, presum, n): 
  
    presum[0] = arr[0] 
    for i in range(1, n): 
        presum[i] = presum[i - 1] + arr[i] 
  
# function to find lower_bound of x in 
# prefix sums array using binary lifting. 
def BinaryLifting(presum, n, x): 
  
    # intisalize position 
    pos = 0
  
    # find log to the base 2  
    # value of n. 
    LOGN = int(math.log2(n)) 
  
    # if x less than first number. 
    if (x <= presum[0]): 
        return 0
  
    # starting from most significant bit. 
    for i in range(LOGN, -1, -1) : 
  
        # if value at this position less 
        # than x then updateposition 
        # Here (1<<i) is similar to 2^i. 
        if (pos + (1 << i) < n and
            presum[pos + (1 << i)] < x) : 
            pos += (1 << i) 
  
    # +1 because 'pos' will have position 
    # of largest value less than 'x' 
    return pos + 1
  
# Driver code 
if __name__ == "__main__": 
      
    # given array 
    arr = [ 2, 5, 7, 1, 6,  
            9, 12, 4, 6 ] 
  
    # value to find 
    x = 8
  
    # size of array 
    n = len(arr) 
  
    # to store prefix sum 
    presum = [0] * n 
  
    # call for prefix sum 
    MakePreSum(arr, presum, n) 
  
    # fucntion call 
    print(BinaryLifting(presum, n, x)) 
  
# This code is contributed 
# by ChitraNayal 

