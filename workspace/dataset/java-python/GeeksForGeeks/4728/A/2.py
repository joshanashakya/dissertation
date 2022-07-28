

# Python3 implementation of the above approach  
  
# Iterative function to calculate  
# (x ^ y) % p in O(log y)  
def power(x, y, p) :  
  
    # Initialize result  
    res = 1;  
  
    # Update x if it is >= p  
    x = x % p;  
  
    while (y > 0) : 
  
        # If y is odd, multiply x with result  
        if (y and 1) : 
            res = (res * x) % p;  
  
        # y must be even now  
        # y = y // 2  
        y = y >> 1;  
        x = (x * x) % p;  
          
    return res;  
  
# Function to return XXX.....(N times) % M  
def findModuloByM(X, N, M) :  
  
    # Return the mod by M of smaller numbers  
    if (N < 6) : 
  
        # Creating a string of N X's  
        temp = chr(48 + X) * N 
  
        # Converting the string to int  
        # and calculating the modulo  
        res = int(temp) % M;  
  
        return res;  
  
    # Checking the parity of N  
    if (N % 2 == 0) : 
  
        # Dividing the number into equal half  
        half = findModuloByM(X, N // 2, M) % M;  
  
        # Utilizing the formula for even N  
        res = (half * power(10, N // 2, 
                                M) + half) % M;  
  
        return res;  
  
    else : 
          
        # Dividing the number into equal half  
        half = findModuloByM(X, N // 2, M) % M;  
  
        # Utilizing the formula for odd N  
        res = (half * power(10, N // 2 + 1, M) +
               half * 10 + X) % M;  
  
        return res;  
          
# Driver code  
if __name__ == "__main__" : 
  
    X = 6; N = 14; M = 9;  
  
    # Print XXX...(N times) % M  
    print(findModuloByM(X, N, M));  
  
# This code is contributed by Ryuga 

