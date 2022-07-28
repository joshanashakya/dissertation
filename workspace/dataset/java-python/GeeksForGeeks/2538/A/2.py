

# Python Program to find the 
# product of first N factorials 
  
# To compute (a * b) % MOD 
def mulmod(a, b, mod): 
    res = 0 # Initialize result 
    a = a % mod 
    while (b > 0): 
  
        # If b is odd, add 'a' to result 
        if (b % 2 == 1): 
            res = (res + a) % mod 
  
        # Multiply 'a' with 2 
        a = (a * 2) % mod 
  
        # Divide b by 2 
        b //= 2
  
    # Return result 
    return res % mod 
  
# This function computes factorials and 
# product by using above function i.e. 
# modular multiplication 
def findProduct(N): 
    # Initialize product and fact with 1 
    product = 1; fact = 1
    MOD = 1e9 + 7
    for i in range(1, N+1): 
  
        # ith factorial 
        fact = mulmod(fact, i, MOD) 
  
        # product of first i factorials 
        product = mulmod(product, fact, MOD) 
  
        # If at any iteration, product becomes 
        # divisible by MOD, simply return 0 
        if not product: 
            return 0
    return int(product) 
  
# Driver Code to Test above functions 
N = 3
print(findProduct(N)) 
N = 5
print(findProduct(N)) 
  
# This code is contributed by Ansu Kumari 

