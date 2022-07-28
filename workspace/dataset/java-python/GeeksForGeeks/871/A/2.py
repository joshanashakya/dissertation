

# Python3 implementation to prelements of 
# the Array which can be expressed as 
# power of some integer to given exponent K 
  
# Method returns Nth power of A 
def nthRoot(A, N): 
  
    xPre = 7
  
    # Smaller eps, denotes more accuracy 
    eps = 1e-3
  
    # Initializing difference between two 
    # roots by INT_MAX 
    delX = 10**9
  
    # x^K denotes current value of x 
    xK = 0
  
    # loop untiwe reach desired accuracy 
    while (delX > eps): 
  
        # calculating current value from previous 
        # value by newton's method 
        xK = ((N - 1.0) * xPre+ A /pow(xPre, N - 1))/ N 
  
        delX = abs(xK - xPre) 
        xPre = xK 
  
    return xK 
  
# Function to check 
# whether its k root 
# is an integer or not 
def check(no, k): 
    kth_root = nthRoot(no, k) 
    num = int(kth_root) 
  
    if (abs(num - kth_root) < 1e-4): 
        return True
  
    return False
  
# Function to find the numbers 
def printExpo(arr, n, k): 
    for i in range(n): 
        if (check(arr[i], k)): 
            print(arr[i],end=" ") 
  
# Driver code 
if __name__ == '__main__': 
  
    K = 6
  
    arr = [46656, 64, 256,729, 16, 1000] 
    n = len(arr) 
  
    printExpo(arr, n, K) 
  
# This code is contributed by mohit kumar 29 

