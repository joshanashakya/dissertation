

# Python3 code to determine whether the 
# number is Peterson number or not 
  
# To quickly find factorial of digits 
fact = [1, 1, 2, 6, 24, 120, 720, 
        5040, 40320, 362880] 
  
# Function to check if a number 
# is Peterson or not 
def peterson (n): 
    num = n 
    sum = 0
      
    # stores the sum of factorials of  
    # each digit of the number. 
    while n > 0: 
        digit = int(n % 10) 
        sum += fact[digit] 
        n = int(n / 10) 
      
    # Condition check for a number 
    # to be a Peterson Number 
    return (sum == num) 
  
# Driver Code 
n = 145
print("Yes" if peterson(n) else "No") 
  
# This code is contributed by "Sharad_Bhardwaj".. 

