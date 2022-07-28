

# Python3 code to count number of  
# digits that divides the number. 
  
# Return the number of digits 
# that divides the number. 
def countDigit (n): 
    temp = n 
    count = 0
    while temp != 0: 
          
        # Fetching each digit  
        # of the number 
        d = temp % 10
        temp /= 10
      
        # Checking if digit is greater 
        # than 0 and can divides n. 
        if d > 0 and n % d == 0: 
            count += 1
    return count 
      
# Driven Code 
n = 1012
print(countDigit(n)) 
  
# This code is contributed by "Sharad_Bhardwaj". 

