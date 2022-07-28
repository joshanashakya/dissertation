

# Python3 implementation of the approach  
import math 
  
# Function that returns true if num  
# can be formed with the digits in 
# digits[] array  
def canBePicked(digits, num):  
  
    copyDigits = []; 
      
    # Copy of the digits array  
    for i in range(len(digits)): 
        copyDigits.append(digits[i]);  
          
    while (num > 0):  
  
        # Get last digit  
        digit = num % 10;  
  
        # If digit array doesn't contain 
        # current digit  
        if (copyDigits[digit] == 0):  
            return False;  
  
        # One occurrence is used  
        else: 
            copyDigits[digit] -= 1;  
  
        # Remove the last digit  
        num = math.floor(num / 10);  
  
    return True;  
  
# Function to return the count of 
# required alphabets  
def countAlphabets(n):  
  
    count = 0;  
  
    # To store the occurrences of  
    # digits (0 - 9)  
    digits = [0] * 10;  
    while (n > 0):  
  
        # Get last digit  
        digit = n % 10;  
  
        # Update the occurrence of the digit  
        digits[digit] += 1;  
  
        # Remove the last digit  
        n = math.floor(n / 10);  
  
    # If any lowercase character can be  
    # picked from the current digits  
    for i in range(ord('a'), ord('z') + 1):  
        if (canBePicked(digits, i)):  
            count += 1;  
  
    # If any uppercase character can be  
    # picked from the current digits  
    for i in range(ord('A'), ord('Z') + 1):  
        if (canBePicked(digits, i)):  
            count += 1;  
  
    # Return the required count  
    # of alphabets  
    return count;  
  
# Driver code  
n = 1623455078;  
print(countAlphabets(n));  
  
# This code is contributed by mits 

