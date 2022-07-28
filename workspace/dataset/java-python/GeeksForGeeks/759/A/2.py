

# Python3 implementation of above approach 
  
# We declare the vector of factors for storing the 
factors = [] 
  
# function to find out the factors of a number 
def findFactors(n): 
      
    # we loop until the i reaches the sqrt(n) 
    for i in range(1, n + 1): 
        if i * i > n: 
            break
  
        # we check if i is a factor of n 
        if (n % i == 0): 
  
            # if both the factors are same 
            # only push one factor 
            if ((n / i) == i): 
                factors.append(i) 
            else: 
  
                # factor1 is pushed 
                factors.append(n // i) 
  
                # factor2 is pushed 
                factors.append(i) 
  
def findProduct(n): 
      
    # initialise the product with -1 
    product = -1
    si = len(factors) 
  
    for i in range(si): 
        for j in range(si): 
            for k in range(si): 
  
                # we find the sum of factors 
                # and store it in s 
                s = factors[i] + factors[j] + factors[k] 
  
                # we check whether the fourth 
                # factor exists or not 
                if ((n - s) in factors): 
                      
                    # product of factors 
                    p = factors[i] * factors[j] * \ 
                        factors[k] * (n - s) 
  
                    # we check whether we have a better 
                    # p now if yes update 
                    if (p > product): 
                        product = p 
  
    return product 
  
# Driver code 
n = 10
  
# initializes the vectors 
# with the divisors of n 
findFactors(n) 
  
# sorts the factors vector 
factors = sorted(factors) 
  
# prints out the maximized product. 
print(findProduct(n)) 
  
# This code is contributed by Mohit Kumar 

