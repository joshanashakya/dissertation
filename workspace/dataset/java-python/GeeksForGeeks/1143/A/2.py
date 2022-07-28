

# Python3 program to Count of numbers 
# between 0 to M which have GCD 
# with M equals to K. 
  
# Function to calculate GCD 
# using euler totient function 
def EulerTotientFunction(limit): 
    copy = limit 
  
    # Finding the prime factors of 
    # limit to calculate it's 
    # euler totient function 
    primes = [] 
  
    for i in range(2, limit + 1): 
        if i * i > limit: 
            break
        if (limit % i == 0): 
            while (limit % i == 0): 
                limit //= i 
            primes.append(i) 
  
    if (limit >= 2): 
        primes.append(limit) 
  
    # Calculating the euler totien 
    # function of (m//k) 
    ans = copy 
    for it in primes: 
        ans = (ans // it) * (it - 1) 
  
    return ans 
  
# Function prthe count of 
# numbers whose GCD with M 
# equals to K 
def CountGCD(m, k): 
  
    if (m % k != 0): 
          
        # GCD of m with any integer 
        # cannot be equal to k 
        print(0) 
        return
  
    if (m == k): 
          
        # 0 and m itself will be 
        # the only valid integers 
        print(2) 
        return
  
    # Finding the number upto which 
    # coefficient of k can come 
    limit = m // k 
  
    ans = EulerTotientFunction(limit) 
  
    print(ans) 
  
# Driver code 
if __name__ == '__main__': 
  
    M = 9
    K = 1
    CountGCD(M, K) 
  
# This code is contributed by mohit kumar 29     

