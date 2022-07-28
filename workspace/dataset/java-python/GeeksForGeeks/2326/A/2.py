

# Python3 implementation of the approach 
  
# Function to return the count of odd days 
def oddDays(N): 
  
    # Count of years divisible 
    # by 100 and 400 
    hund1 = N // 100
    hund4 = N // 400
  
    # Every 4th year is a leap year 
    leap = N >> 2
    ordd = N - leap 
  
    # Every 100th year is divisible by 4 
    # but is not a leap year 
    if (hund1): 
        ordd += hund1 
        leap -= hund1 
  
    # Every 400th year is divisible by 100 
    # but is a leap year 
    if (hund4): 
        ordd -= hund4 
        leap += hund4 
  
    # Total number of extra days 
    days = ordd + leap * 2
  
    # modulo(7) for final answer 
    odd = days % 7
  
    return odd 
  
# Driver code 
  
# Number of days 
N = 100
print(oddDays(N)) 
  
# This code is contributed 
# by mohit kumar 

