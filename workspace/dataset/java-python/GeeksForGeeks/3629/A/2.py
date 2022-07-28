

# Python program to find n^2 - m^2  
# is prime or not.  
  
# Check a number is prime or not  
def isprime(x):  
  
    # run a loop upto square  
    # of given number  
    for i in range(2, math.sqrt(x)):  
        if (x % i == 0) : 
            return False;  
    return True;  
  
# Check if n^2 - m^2 is prime  
def isNSqMinusnMSqPrime( m, n):  
  
    if (n - m == 1 and isprime(m + n)):  
        return True;  
    else: 
        return False;  
  
# Driver code  
m = 13; 
n = 16;  
if (isNSqMinusnMSqPrime(m, n)) : 
    print ( "YES");  
else: 
    print ("NO");  
  
# This code is contributed  
# by Shivi_Aggarwal 

