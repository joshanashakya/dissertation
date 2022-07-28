

# Python3 implementation of the approach  
  
# Function to return the value of (str % k)  
def getMod(_str, n, k) :  
  
    # pwrTwo[i] will store ((2^i) % k)  
    pwrTwo = [0] * n  
    pwrTwo[0] = 1 % k  
    for i in range(1, n):  
        pwrTwo[i] = pwrTwo[i - 1] * (2 % k)  
        pwrTwo[i] %= k  
  
    # To store the result  
    res = 0
    i = 0
    j = n - 1
    while (i < n) :  
  
        # If current bit is 1  
        if (_str[j] == '1') :  
  
            # Add the current power of 2  
            res += (pwrTwo[i])  
            res %= k  
              
        i += 1
        j -= 1
  
    return res  
  
# Driver code  
_str = "1101"
n = len(_str)  
k = 45
  
print(getMod(_str, n, k))  
  
# This code is contributed by 
# divyamohan123 

