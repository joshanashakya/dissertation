

# Python3 implementation of the approach  
  
# Function to return the minimum  
# number of cubes whose sum is k  
def MinOfCubed(k): 
      
    # If k is less than the 2 ^ 3  
    if (k < 8):  
        return k;  
  
    # Initialize with the maximum  
    # number of cubes required  
    res = k;  
    for i in range(1, k + 1):  
        if ((i * i * i) > k):  
            return res;  
        res = min(res, MinOfCubed(k - (i * i * i)) + 1);  
    return res;  
  
# Driver code  
num = 15;  
print(MinOfCubed(num)); 
  
# This code contributed by PrinciRaj1992  

