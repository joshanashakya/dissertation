

# Python 3 implementation of above approach 
  
# Function to check if n is palindrome 
def isPalindrome(n): 
      
    # Find the appropriate divisor 
    # to extract the leading digit 
    divisor = 1
    while (int(n / divisor) >= 10): 
        divisor *= 10
  
    while (n != 0): 
        leading = int(n / divisor) 
        trailing = n % 10
  
        # If first and last digits are 
        # not same then return false 
        if (leading != trailing): 
            return False
  
        # Removing the leading and trailing 
        # digits from the number 
        n = int((n % divisor) / 10) 
  
        # Reducing divisor by a factor 
        # of 2 as 2 digits are dropped 
        divisor = int(divisor / 100) 
    return True
  
# Function to find the largest  
# palindromic number 
def largestPalindrome(A, n): 
    currentMax = -1
  
    for i in range(0, n, 1): 
          
        # If a palindrome larger than 
        # the currentMax is found 
        if (A[i] > currentMax and isPalindrome(A[i])): 
            currentMax = A[i] 
      
    # Return the largest palindromic  
    # number from the array 
    return currentMax 
  
# Driver Code 
if __name__ == '__main__': 
    A = [1, 232, 54545, 999991] 
    n = len(A) 
  
    # print required answer 
    print(largestPalindrome(A, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

