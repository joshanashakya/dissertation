

# Python3 implementation to find the maximum  
# N-digit octal number which is perfect square  
from math import sqrt,ceil 
  
# Function to convert decimal number  
# to a octal number  
def decToOctal(n) :  
  
    # Array to store octal number  
    octalNum = [0]*100;  
  
    # Counter for octal number array  
    i = 0;  
    while (n != 0) : 
  
        # Store remainder in  
        # octal array  
        octalNum[i] = n % 8;  
        n = n // 8;  
        i += 1;  
  
    # Print octal number array  
    # in reverse order  
    for j in range(i - 1, -1, -1) : 
        print(octalNum[j], end= "");  
    print(); 
  
def nDigitPerfectSquares(n) : 
  
    # Largest n-digit perfect square  
    decimal = pow(ceil(sqrt(pow(8, n))) - 1, 2);  
    decToOctal(decimal);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 2;  
    nDigitPerfectSquares(n);  
  
# This code is contributed by AnkitRai01 

