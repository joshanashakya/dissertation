

from math import log10,floor 
  
# A optimised program to find the  
# number of digits in a factorial in base b 
  
# Returns the number of digits present  
# in n! in base b Since the result can be large 
# long long is used as return type 
def findDigits(n, b): 
      
    # factorial of -ve number  
    # doesn't exists 
    if (n < 0): 
        return 0
      
    M_PI = 3.141592
    M_E = 2.7182
  
    # base case 
    if (n <= 1): 
        return 1
  
    # Use Kamenetsky formula to calculate 
    # the number of digits 
    x = ((n * log10(n / M_E) + log10(2 * M_PI * n) / 2.0)) / (log10(b)) 
  
    return floor(x) + 1
  
# Driver Code 
if __name__ == '__main__': 
      
    #calling findDigits(Number, Base) 
    print(findDigits(4, 16)) 
    print(findDigits(5, 8)) 
    print(findDigits(12, 16)) 
    print(findDigits(19, 13)) 
  
# This code is contributed by Surendra_Gangwar 

