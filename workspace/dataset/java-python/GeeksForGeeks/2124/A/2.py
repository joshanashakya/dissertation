

# Python3 implementation of the approach  
  
# Function to return the count  
# of N-digit palindrome numbers  
def nDigitPalindromes(n) : 
  
    return (9 * pow(10, (n - 1) // 2));  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 2;  
  
    print(nDigitPalindromes(n));  
  
# This code is contributed by AnkitRai01 

