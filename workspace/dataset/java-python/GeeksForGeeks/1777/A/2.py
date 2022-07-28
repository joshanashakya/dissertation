

# Python Program to check whether 
# number is semiprime or not 
import math 
# Utility function to check whether 
# number is semiprime or not 
def checkSemiprime(num): 
    cnt = 0
  
    for i in range(2, int(math.sqrt(num)) + 1): 
        while num % i == 0: 
            num /= i 
            cnt += 1 # Increment count 
                    # of prime number 
  
        # If count is greater than 2, 
        # break loop  
        if cnt >= 2:  
            break
    # If number is greater than 1, add it to 
    # the count variable as it indicates the 
    # number remain is prime number 
    if(num > 1): 
        cnt += 1
  
    # Return '1' if count is equal to '2' else 
    # return '0' 
    return cnt == 2
  
# Function to print 'True' or 'False' 
# according to condition of semiprime 
def semiprime(n): 
    if checkSemiprime(n) == True: 
        print("True") 
    else: 
        print("False") 
  
# Driver code 
n = 6
semiprime(n) 
  
n = 8
semiprime(n); 

