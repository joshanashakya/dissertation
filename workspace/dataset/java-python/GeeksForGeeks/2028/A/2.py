

# python3 program to find count of digits in N  
# factorial raised to N 
  
import math 
   
def countDigits( n): 
  
    # we take sum of logarithms as explained 
    # in the approach 
    ans = 0
    for i in range (1,n+1): 
        ans += math.log10(i) 
   
    #multiply the result with n 
    ans = ans * n 
    return 1 + math.floor(ans) 
  
   
if __name__ == "__main__": 
  
    n = 4
    print (countDigits(n)) 
  

