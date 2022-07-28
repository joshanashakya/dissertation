

# Python3 program to count the number of 
# prime digits in a number 
  
# Function to find the count of 
# prime digits in a number 
def countDigit(n): 
    temp = n 
    count = 0
  
    # Loop to compute all the digits 
    # of the number 
    while (temp != 0): 
  
        # Finding every digit of the 
        # given number 
        d = temp % 10
  
        temp //= 10
  
        # Checking if digit is prime or not 
        # Only 2, 3, 5 and 7 are prime 
        # one-digit number 
        if (d == 2 or d == 3 or d == 5 or d == 7): 
            count += 1
  
    return count 
  
# Driver code 
if __name__ == '__main__': 
    n = 1234567890
  
    print(countDigit(n)) 
  
# This code is contributed by mohit kumar 29 

