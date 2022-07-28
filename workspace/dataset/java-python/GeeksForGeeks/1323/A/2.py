

# Python 3 program to check if a number is  
# Quartan Prime or not 
  
# Utility function to check 
# if a number is prime or not 
def isPrime(n) :  
    # Corner cases  
    if (n <= 1) :  
        return False
    if (n <= 3) :  
        return True
    
    # This is checked so that we can skip   
    # middle five numbers in below loop  
    if (n % 2 == 0 or n % 3 == 0) :  
        return False
    
    i = 5
    while(i * i <= n) :  
        if (n % i == 0 or n % (i + 2) == 0) :  
            return False
        i = i + 6
    
    return True
            
# Driver Code  
n = 17
      
# Check if number is prime  
# and of the form 16 * n + 1 
  
if(isPrime(n) and (n % 16 == 1) ): 
  
    print("YES") 
  
else: 
  
    print("NO") 
  
            

