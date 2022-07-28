

# Python program to check whether a number 
# is divisible by 31 or not 
  
# Function to check if the number is  
# divisible by 31 or not  
def isDivisible(n) :  
  
    # While there are at least two digits  
    while n // 100 :  
  
        # Extracting the last  
        d = n % 10
  
        # Truncating the number  
        n //= 10
  
        # Subtracting three times the last  
        # digit to the remaining number  
        n = abs(n-(d * 3)) 
  
    # Finally return if the two-digit 
    # number is divisible by 31 or not 
    return (n % 31 == 0)  
  
# Driver Code  
if __name__ == "__main__" :  
  
    n = 1922
  
    if (isDivisible(n)) :  
        print("Yes")  
    else :  
        print("No")  

