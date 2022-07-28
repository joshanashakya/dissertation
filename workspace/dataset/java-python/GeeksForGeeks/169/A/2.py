

# Python 3 Program to check  
# if the number is divisible 
# by 19 or not  
  
# Function to check if the number  
# is divisible by 19 or not  
def isDivisible(n) : 
      
    while (n // 100) : 
                  
        # Extracting the last digit  
        d = n % 10
  
        # Truncating the number  
        n //= 10
  
        # Adding twice the last digit  
        # to the remaining number  
        n += d * 2
  
    # return true if number  
    # is divisible by 19  
    return (n % 19 == 0)  
  
# Driver Code 
if __name__ == "__main__" : 
  
    n = 101156
      
    if (isDivisible(n)) :  
        print("Yes" ) 
          
    else : 
        print("No")  
      
# This code is contributed  
# by ANKITRAI1 

