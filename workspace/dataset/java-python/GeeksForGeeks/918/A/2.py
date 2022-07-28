

# Python 3 program to find  
# GCD of a^n and b. 
def gcd(a, b): 
    if (a == 0): 
        return b 
    return gcd(b % a, a) 
  
# Returns GCD of a^n and b. 
def powGCD(a, n, b): 
    for i in range(0, n + 1, 1): 
        a = a * a 
  
    return gcd(a, b) 
  
# Driver code 
if __name__ == '__main__': 
    a = 10
    b = 5
    n = 2
    print(powGCD(a, n, b)) 
      
# This code is contributed  
# by Surendra_Gangwar 

