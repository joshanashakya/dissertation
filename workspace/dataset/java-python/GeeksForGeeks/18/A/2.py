

# Python program to check whether a number 
# is divisible by 71 or not 
  
# Function to check if the number is  
# divisible by 71 or not  
def isDivisible(n) :  
  
    # While there are at least two digits  
    while n // 100 :  
  
        # Extracting the last  
        d = n % 10
  
        # Truncating the number  
        n //= 10
  
        # Subtracting seven times the last  
        # digit to the remaining number  
        n = abs(n-(d * 7)) 
  
    # Finally return if the two-digit 
    # number is divisible by 71 or not 
    return (n % 71 == 0)  
  
# Driver Code  
if __name__ == "__main__" :  
      
    N = 5041
  
    if (isDivisible(N)) :  
        print("Yes")  
    else :  
        print("No")  

