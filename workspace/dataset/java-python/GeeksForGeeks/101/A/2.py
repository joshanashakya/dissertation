

# Python 3 program to find the  
# largest, good number in the  
# divisors of given number N. 
  
# function to return distinct  
# prime factors 
def PrimeFactors(n): 
  
    # to store distinct  
    # prime factors 
    v = [] 
  
    x = n 
  
    # run a loop upto sqrt(n) 
    i = 2
    while(i * i <= n): 
        if (x % i == 0) : 
  
            # place this prime factor 
            # in vector 
            v.append(i) 
            while (x % i == 0): 
                x //= i 
                  
        i += 1
  
    # This condition is to handle  
    # the case when n is a prime  
    # number greater than 1 
    if (x > 1): 
        v.append(x) 
  
    return v 
  
# function that returns good number 
def GoodNumber(n): 
      
    # distinct prime factors 
    v = PrimeFactors(n) 
  
    # to store answer 
    ans = 1
  
    # product of all distinct prime 
    # factors is required answer 
    for i in range(len(v)): 
        ans *= v[i] 
  
    return ans 
  
# Driver code 
if __name__ == "__main__": 
    n = 12
  
    # function call 
    print(GoodNumber(n)) 
  
# This code is contributed 
# by ChitraNayal 

