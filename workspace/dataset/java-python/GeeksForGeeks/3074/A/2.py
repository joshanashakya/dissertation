

# Python 3 code to find 
# modular inverse 
# from 1 to n w.r.t a 
# big prime number 
  
# Function to calculate modular 
# inverse using D.P 
def modularInverse( n, prime) : 
  
    dp =[0]*(n+1) 
    dp[0] = dp[1] = 1
    for i in range( 2, n+1) : 
        dp[i] = dp[prime % i] *(prime - prime // i) % prime  
   
    for i in range( 1, n+1) : 
        print(dp[i] ,end=" ") 
          
   
# Driver code 
n = 10
prime = 17
  
modularInverse(n, prime) 
  
# This code is contributed 
# by Nikita Tiwari. 

