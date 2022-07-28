

      
#  Python3 program to find first natural number 
#  whose factorial divides x. 
  
   
#  GCD function to compute the greatest 
#  divisor among a and b 
def gcd(a,  b): 
    if ((a % b) == 0): 
        return b 
    return gcd(b, a % b) 
  
   
#  Returns first number whose factorial 
#  divides x. 
def firstFactorialDivisibleNumber(x): 
    i = 1 #  Result 
    new_x = x 
   
    for i in range(1,x): 
        #  Remove common factors 
        new_x /= gcd(i, new_x) 
   
        #  We found first i. 
        if (new_x == 1): 
            break
    return i 
   
#  Driver code 
def main(): 
    x = 16
    print(firstFactorialDivisibleNumber(x)) 
  
if __name__ == '__main__': 
    main() 
  
# This code is contributed by 29AjayKumar  

