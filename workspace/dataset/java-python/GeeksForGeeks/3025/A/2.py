

# Python3 program to find the  
# smallest number 
# having at least n digits  
# in factorial 
  
import math 
  
# Returns the number of digits  
# present in n! 
def findDigitsInFactorial(n): 
      
    # factorial of -ve number  
    # doesn't exists 
    if (n < 0): 
        return 0
  
    # base case 
    if (n <= 1): 
        return 1
  
    # Use Kamenetsky formula to calculate the 
    # number of digits 
    M_E=2.7182818284590452354
    M_PI=3.14159265358979323846
    x = ((n*math.log10(n/M_E)+math.log10(2*M_PI*n)/2.0)) 
  
    return int(math.floor(x)+1) 
  
# This function receives an  
# integer n and returns 
# an integer whose factorial has  
# at least n digits 
def findNum(n): 
      
    # (2*n)! always has more  
    # digits than n 
    low = 0
    hi = 2*n 
  
    # n <= 0 
    if (n <= 0): 
        return -1
  
    # case for n = 1 
    if (findDigitsInFactorial(low) == n): 
        return int(round(low)) 
  
    # now use binary search to  
    # find the number 
    while (low <= hi): 
        mid = int((low+hi) / 2) 
  
        # if (mid-1)! has lesser digits than n 
        # and mid has n or more then mid is the 
        # required number 
        if ((findDigitsInFactorial(mid) >= n and 
            findDigitsInFactorial(mid-1)<n)): 
            return int(round(mid)) 
  
        elif (findDigitsInFactorial(mid) < n): 
            low = mid+1
  
        else: 
            hi = mid-1
              
    return int(round(low)) 
  
# Driver code 
if __name__=='__main__': 
    print(findNum(1)); 
    print(findNum(2)); 
    print(findNum(5)); 
    print(findNum(24)); 
    print(findNum(100)); 
    print(findNum(1221)); 
  
# this code is contributed by  
# mits 

