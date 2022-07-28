

# Python 3 Program to validate above logic  
  
# Function to check if the number  
# is divisible by 41 or not  
def isDivisible(n) : 
  
    while n // 100 : 
  
        # Extracting the last digit  
        d = n % 10
  
        # Truncating the number 
        n //= 10
  
        # Subtracting the four times  
        # the last digit from the   
        # remaining number  
        n -= d * 4
  
    # return true if number is divisible by 41 
    return n % 41 == 0
      
  
      
# Driver Code 
if __name__ == "__main__" : 
  
    n = 104413920565933
      
    if isDivisible(n) : 
        print("Yes") 
  
    else : 
        print("No") 
          
# This code is contributed by ANKITRAI1 

