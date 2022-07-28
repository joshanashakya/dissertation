

# Function to check whether 
# a number is prime or not. 
def is_prime(num): 
  
    # Count variable to store 
    # the number of factors of 'num' 
    count = 0
  
    # Counting the number of factors 
    for i in range(1, num + 1): 
  
        if i * i > num: 
            break
  
        if ((num) % i == 0): 
  
            if (i * i != (num)): 
                count += 2
            else: 
                count += 1
          
    # If number is prime return true 
    if (count == 2): 
        return True
    else: 
        return False
  
# Function to check for divisibility 
def is_divisible(n): 
  
    # if 'n' equals 1 then  
    # divisibility is possible 
    if (n == 1): 
        return "YES"
  
    # Else check whether 'n+1' is prime or not 
    else: 
  
        # If 'n+1' is prime then 'n!' is 
        # not divisible by 'n*(n+1)/2' 
        if (is_prime(n + 1)): 
            return "NO"
              
        # else divisibility occurs 
        else: 
            return "YES"
      
# Driver Code 
  
# Test for n=3 
n = 3
  
print(is_divisible(n)) 
  
# Test for n=4 
n = 4
  
print(is_divisible(n)) 
  
# This code is contributed  
# by mohit kumar 

