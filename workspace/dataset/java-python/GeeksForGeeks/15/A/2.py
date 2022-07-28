

# Python program to check if a number 
# is divisible by 47 or not 
  
# Function to check if the number is  
# divisible by 47 or not  
def isDivisible(n) :  
   
    # While there are at least two digits  
    while n // 100 :  
   
        # Extracting the last  
        d = n % 10
   
        # Truncating the number  
        n //= 10
   
        # Subtracting fourteen times the last  
        # digit to the remaining number  
        n = abs(n- (d * 14)) 
   
    # Finally return if the two-digit 
    # number is divisible by 43 or not 
    return (n % 47 == 0)  
   
# Driver Code  
if __name__ == "__main__" :  
       
    n = 59173
  
    if (isDivisible(n)) :  
        print("Yes")  
    else :  
        print("No")  

