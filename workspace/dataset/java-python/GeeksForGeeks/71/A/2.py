

# Python3 program to find the 
# three numbers 
  
# fucntion to find 3 distinct number 
# with given product 
def getnumbers(n): 
       
     # Declare a vector to store 
    # divisors 
    divisor = [] 
  
    # store all divisors of number 
    # in array 
    for i in range(2, n + 1): 
  
        # store all the occurence of 
        # divisors 
        while (n % i == 0): 
            divisor.append(i) 
            n //= i 
  
    # check if n is not equals to -1 
    # then n is also a prime factor 
    if (n != 1): 
        divisor.append(n) 
  
    # Initialize the variables with 1 
    a, b, c, size = 0, 0, 0, 0
    a = b = c = 1
    size = len(divisor) 
  
    for i in range(size): 
  
        # check for first number a 
        if (a == 1): 
            a = a * divisor[i] 
  
        # check for second number b 
        elif (b == 1 or b == a): 
            b = b * divisor[i] 
  
        # check for third number c 
        else: 
            c = c * divisor[i] 
  
    # check for all unwanted codition 
    if (a == 1 or b == 1 or c == 1
        or a == b or b == c or a == c): 
        print("-1") 
    else: 
        print(a, b, c) 
  
# Driver function 
  
n = 64
getnumbers(n) 
  
# This code is contributed by mohit kumar 29 

