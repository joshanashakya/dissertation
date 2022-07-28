

# Python 3 implementation of above approach  
  
#  Returns sum of digits of x  
def sumOfDigitsSingle(x) : 
    ans = 0
    while x : 
        ans += x % 10
        x //= 10
  
    return ans 
  
# Returns closest number to x in terms of 9's 
def closest(x) : 
    ans = 0
    while (ans * 10 + 9 <= x) : 
        ans = ans * 10 + 9
  
    return ans 
  
def sumOfDigitsTwoParts(N) : 
    A = closest(N) 
  
    return sumOfDigitsSingle(A) + sumOfDigitsSingle(N - A) 
  
  
# Driver Code 
if __name__ == "__main__" : 
  
    N = 35
    print(sumOfDigitsTwoParts(N)) 
  
# This code is contributed by ANKITRAI1 

