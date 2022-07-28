

# Python program to count number of digits 
# which is prime and also divides number 
  
# Function to find the number of 
# digits in number which divides the 
# number and is also a prime number 
def countDigit(n): 
    prime = [False]*10
  
    # Only 2, 3, 5 and 7 are prime  
    # one-digit number 
    prime[2] = True
    prime[3] = True; 
    prime[5] = True
    prime[7] = True; 
  
    temp = n 
    count = 0; 
      
    # Loop to compute all the digits 
    # of the number untill it  
    # is not equal to the zero 
    while (temp != 0): 
          
        # Fetching each digit 
        # of the number 
        d = temp % 10; 
  
        temp //= 10; 
  
        # Checking if digit is greater than 0 
        # and can divides n and is prime too 
        if (d > 0 and n % d == 0 and prime[d]): 
            count += 1
  
    return count 
  
# Driver Code 
n = 1032
  
print(countDigit(n)) 
  
# This code is contributed by ANKITKUMAR34 

