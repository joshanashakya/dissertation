

# Python3 implementation of the above approach 
  
# Print the sum and product of digits 
# that divides the number. 
def countDigit(n): 
    temp = n 
    sum = 0
    product = 1
    while(temp != 0): 
          
        # Fetching each digit of the number 
        d = temp % 10
        temp //= 10
          
        # Checking if digit is greater  
        # than 0 and can divides n. 
        if(d > 0 and n % d == 0): 
            sum += d 
            product *= d 
              
    print("Sum =", sum) 
    print("Product =", product) 
  
# Driver code 
if __name__=='__main__': 
      
    n = 1012
    countDigit(n) 
  
# This code is contributed  
# by Kirti_Mangal 
     

