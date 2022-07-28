

# Python 3 program to check if  
# any permutation of a number 
# is divisible by 3 and is Palindromic 
  
# Function to check if any permutation 
# of a number is divisible by 3 
# and is Palindromic 
def isDivisiblePalindrome(n): 
  
    # Hash array to store frequency 
    # of digits of n 
    hash = [0] * 10
   
    digitSum = 0
  
    # traverse the digits of integer 
    # and store their frequency 
    while (n) : 
  
        # Calculate the sum of 
        # digits simultaneously 
        digitSum += n % 10
        hash[n % 10] += 1
        n //= 10
  
    # Check if number is not 
    # divisible by 3 
    if (digitSum % 3 != 0): 
        return False
  
    oddCount = 0
    for i in range(10) : 
        if (hash[i] % 2 != 0): 
            oddCount += 1
  
    # If more than one digits have  
    # odd frequency, palindromic  
    # permutation not possible 
    if (oddCount > 1): 
        return False
    else: 
        return True
  
# Driver Code 
n = 34734
  
if (isDivisiblePalindrome(n)): 
    print("True")  
else: 
    print("False") 
  
# This code is contributed 
# by ChitraNayal 

