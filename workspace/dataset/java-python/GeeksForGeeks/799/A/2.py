

# Python3 program to find the remainder 
# when the First digit of a number 
# is divided by its Last digit 
  
# Function to find the remainder 
def findRemainder(n): 
      
    # Get the last digit 
    l = n % 10
   
    # Get the first digit 
    while (n >= 10): 
        n //= 10
    f = n 
  
    # Compute the remainder 
    remainder = f % l 
  
    print(remainder) 
  
# Driver code 
n = 5223
  
findRemainder(n) 
  
# This code is contributed by Mohit Kumar  

