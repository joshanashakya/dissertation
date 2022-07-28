

# Python3 implementation of the approach  
  
# Function to return the minimum number of  
# given operations required to reduce n to 1  
def minOperations(n):  
  
    # To store the count of operations  
    count = 0
  
    # To store the digit  
    d = 0
  
    # If n is already then no  
    # operation is required  
    if (n == 1):  
        return 0
  
    # Extract all the digits except  
    # the first digit  
    while (n > 9):  
  
        # Store the maximum of that digits  
        d = max(n % 10, d)  
        n //= 10
  
        # for each digit  
        count += 10
      
    # First digit  
    d = max(d, n - 1)  
  
    # Add the value to count  
    count += abs(d)  
  
    return count - 1
  
# Driver code  
if __name__ == '__main__':  
  
    n = 240
  
    print(minOperations(n))  
  
# This code is contributed by ashutosh450 

