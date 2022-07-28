

# Python 3 program to validate above logic 
  
# Function to check if the number is  
# divisible by 23 or not  
def isDivisible(n) : 
  
    # While there are at least 3 digits 
    while n // 100 : 
  
        # Extracting the last 
        d = n % 10
  
        # Truncating the number  
        n //= 10
  
        # Adding seven times the last   
        # digit to the remaining number  
        n += d * 7
  
    return (n % 23 == 0) 
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 1191216
  
    # function calling 
    if (isDivisible(n)) : 
        print("Yes") 
  
    else : 
        print("No") 
  
# This code is contributed by ANKITRAI1 

