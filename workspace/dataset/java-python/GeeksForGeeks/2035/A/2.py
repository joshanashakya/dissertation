

# Python program to 
# calculate minimum number 
# of powers of x to make 
# sum equal to n. 
  
# Return minimum power 
# terms of x required 
def minPower(n,x): 
  
    # if x is 1, return 
    # n since any power 
    # of 1 is 1 only. 
    if (x==1): 
        return n 
   
    # Consider n = a * x  + b where a = n/x 
    # and b = n % x. 
    ans = 0
    while (n > 0): 
  
        # Update count of powers for 1's added 
        ans += (n%x) 
   
        # Repeat the process for reduced n 
        n //= x 
  
   
    return ans 
      
# Driver code 
n = 5 
x = 3
print(minPower(n, x)) 
  
# This code is contributed 
# by Anant Agarwal. 

