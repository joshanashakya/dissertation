

# Python3 program to find all pairs 
# with given GCD and LCM. 
import math 
  
# Function to calculate GCD 
# of two numbers 
def gcd(a, b): 
  
    if (a == 0): 
        return b 
    return math.gcd(b % a, a) 
  
# Function to count number of  
# pairs with given GCD and LCM 
def countPairs(G, L): 
  
    # To store count 
    count = 0
  
    # To store product a*b = G*L 
    p = G * L 
  
    # p/a will be b if a divides p 
    for a in range(1, L + 1): 
        if (not (p % a) and 
            math.gcd(a, p // a) == G): 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
  
    G = 2
    L = 12
    print ("Total possible pair with GCD ",  
                               G, end = "") 
    print (" & LCM ", L, end = "") 
    print (" = ", countPairs(G, L)) 
  
# This code is contributed by ita_c 

