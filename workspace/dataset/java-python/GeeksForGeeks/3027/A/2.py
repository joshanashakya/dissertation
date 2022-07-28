

# Python3 program to find the product  
# of N with its largest odd digit  
  
# Function to return the largest  
# odd digit in n  
def largestOddDigit(n) :  
  
    # If all digits are even then -1  
    # will be returned  
    maxOdd = -1
    while (n > 0) : 
  
        # Last digit from n  
        digit = n % 10
  
        # If current digit is odd and > maxOdd  
        if (digit % 2 == 1 and digit > maxOdd) :  
            maxOdd = digit 
  
        # Remove last digit  
        n = n // 10
  
    # Return the maximum odd digit  
    return maxOdd  
  
# Function to return the product  
# of n with its largest odd digit  
def getProduct(n) :  
  
    maxOdd = largestOddDigit(n) 
  
    # If there are no odd digits in n  
    if (maxOdd == -1) : 
        return -1
  
    # Product of n with its largest 
    # odd digit  
    return (n * maxOdd) 
  
# Driver code  
if __name__ == "__main__" : 
  
    n = 12345
    print(getProduct(n))  
  
# This code is contributed by Ryuga 

