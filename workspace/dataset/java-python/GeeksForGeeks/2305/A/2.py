

# Python3 program to check if the sum of  
# distinct digits of two integers are equal  
  
# Function to return the sum of  
# distinct digits of a number  
def distinctDigitSum(n) : 
      
    used = [False] * 10
    sum = 0
    while (n > 0) : 
  
        # Take last digit  
        digit = n % 10
          
        # If digit has not been used before  
        if (not used[digit]) :  
  
            # Set digit as used  
            used[digit] = True
            sum += digit 
              
        # Remove last digit  
        n = n // 10
          
    return sum
      
# Function to check whether the sum of  
# distinct digits of two numbers are equal  
def checkSum(m, n) : 
      
    sumM = distinctDigitSum(m)  
    sumN = distinctDigitSum(n)  
      
    if (sumM == sumN) : 
        return "YES"
    return "NO"
      
# Driver code  
if __name__ == "__main__" : 
  
    m = 2452
    n = 9222
      
    print(checkSum(m, n)) 
      
# This code is contributed by Ryuga 

