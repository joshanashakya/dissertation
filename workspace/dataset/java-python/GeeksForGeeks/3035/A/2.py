

   
# Python3 program to find power  
# of a prime number ‘r’ in n! 
  
# Function to return power of a  
# no. 'r' in factorial of n 
def power(n, r): 
          
    # Keep dividing n by powers of  
    # 'r' and update count 
    count = 0; i = r 
      
    while((n / i) >= 1): 
        count += n / i 
        i = i * r 
          
    return int(count) 
  
# Driver Code 
n = 6; r = 3
print(power(n, r))  
  
# This code is contributed by Smitha Dinesh Semwal. 

