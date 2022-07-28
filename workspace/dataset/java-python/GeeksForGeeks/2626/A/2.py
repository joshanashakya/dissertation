

# Python code to calculate sum of series 
  
# function to calculate sum of series 
def calculateSum(n, k): 
      
    # Initialize res 
    res = 1
     
    # initialize MOD 
    MOD = 1000000007
      
  
    # loop to calculate n ^ k % MOD  
    # using Modular airthmatic 
    while k > 0 : 
  
          # if k is odd 
          # Multiply n with res    
          if ( k & 1 ) == 1 : 
              res = ( res * n ) % MOD 
  
  
          # k must be even now 
          # change k to k / 2 
          k = k // 2
    
          # change n to n ^ 2 
          n =( n * n ) % MOD 
            
  
    return res 
  
  
# Driver code 
  
n = 4
k = 3
  
print(calculateSum(n, k)) 

