

# Python program to check whether a number 
# is divisible by 43 or not 
  
# Function to check if the number is  
# divisible by 43 or not  
def isDivisible(n) :  
  
    # While there are at least two digits  
    while n // 100 :  
  
        # Extracting the last  
        d = n % 10
  
        # Truncating the number  
        n //= 10
  
        # Adding thirteen  times the last  
        # digit to the remaining number  
        n = abs(n+(d * 13)) 
  
    # Finally return if the two-digit 
    # number is divisible by 43 or not 
    return (n % 43 == 0)  
  
# Driver Code  
if __name__ == "__main__" :  
      
    N = 2795
  
    if (isDivisible(N)):  
        print("Yes")  
    else :  
        print("No")  

