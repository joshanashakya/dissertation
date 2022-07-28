

# Python 3 program to count the  
# number of numbers formed by  
# digits a and b exactly of a  
# length N such that the sum of  
# the digits of the number thus  
# formed is of digits a and b. 
  
mod = 1000000007
N = 1000005
fact = [0] * N 
invfact = [0] * N 
  
# function to check if sum of 
# digits is made of a and b 
def check(x, a, b): 
  
    # sum of digits is 0 
    if (x == 0): 
        return 0
  
    while (x) : 
  
        # if any of digits in sum  
        # is other than a and b 
        if (x % 10 != a and x % 10 != b): 
            return 0
  
        x //= 10
  
    return 1
  
# calculate the modInverse V of 
# a number in O(log n) 
def modInverse(a, m): 
  
    m0 = m 
    y = 0
    x = 1
  
    if (m == 1): 
        return 0
  
    while (a > 1) : 
  
        # q is quotient 
        q = a // m 
        t = m 
  
        # m is remainder now, process 
        # same as Euclid's algo 
        m = a % m 
        a = t 
        t = y 
  
        # Update y and x 
        y = x - q * y 
        x = t 
  
    # Make x positive 
    if (x < 0): 
        x += m0 
  
    return x 
  
# function to pregenerate factorials 
def pregenFact(): 
  
    fact[0] = fact[1] = 1
    for i in range(1, 1000001): 
        fact[i] = fact[i - 1] * i % mod 
  
# function to pre calculate the 
# modInverse of factorials 
def pregenInverse(): 
      
    invfact[0] = invfact[1] = 1
  
    # calculates the modInverse of 
    # the last factorial 
    invfact[1000000] = modInverse(fact[1000000], mod) 
  
    # precalculates the modInverse  
    # of all factorials by formulae 
    for i in range(999999, 0, -1): 
        invfact[i] = ((invfact[i + 1] * 
                      (i + 1)) % mod) 
  
# function that returns 
# the value of nCi 
def comb(big, smal): 
      
    return (fact[big] * invfact[smal] % mod * 
                        invfact[big - smal] % mod) 
  
# function that returns the  
# count of numbers 
def count(a, b, n): 
      
    # function call to pre-calculate  
    # the factorials and modInverse  
    # of factorials 
    pregenFact() 
    pregenInverse() 
  
    # if a and b are same 
    if (a == b) : 
        return (check(a * n, a, b)) 
  
    ans = 0
    for i in range(n + 1) : 
        if (check(i * a + (n - i) * b, a, b)) : 
            ans = (ans + comb(n, i)) % mod 
    return ans 
  
# Driver Code 
if __name__=="__main__": 
    a = 3
    b = 4
    n = 11028
    print(count(a, b, n)) 
  
# This code is contributed  
# by ChitraNayal 

