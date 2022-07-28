

# Python3 program to find nth term 
# divisible by a, b or c 
import sys 
  
# Function to return gcd of a and b 
def gcd(a, b): 
  
    if (a == 0): 
        return b; 
  
    return gcd(b % a, a); 
  
# Function to return the count of integers 
# from the range [1, num] which are 
# divisible by either a, b or c 
def divTermCount(a, b, c, num): 
      
    # Calculate the number of terms divisible by a, b 
    # and c then remove the terms which are divisible 
    # by both (a, b) or (b, c) or (c, a) and then 
    # add the numbers which are divisible by a, b and c 
    return ((num / a) + (num / b) + (num / c) - 
                (num / ((a * b) / gcd(a, b))) - 
                (num / ((c * b) / gcd(c, b))) - 
                (num / ((a * c) / gcd(a, c))) + 
                (num / ((a * b * c) / gcd(gcd(a, b), c)))); 
  
# Function for binary search to find the 
# nth term divisible by a, b or c 
def findNthTerm(a, b, c, n): 
  
    # Set low to 1 and high to LONG_MAX 
    low = 1; high = sys.maxsize; mid = 0; 
  
    while (low < high): 
        mid = low + (high - low) / 2; 
  
        # If the current term is less than 
        # n then we need to increase low 
        # to mid + 1 
        if (divTermCount(a, b, c, mid) < n): 
            low = mid + 1; 
  
        # If current term is greater than equal to 
        # n then high = mid 
        else: 
            high = mid; 
      
    return int(low); 
  
# Driver code 
a = 2; b = 3; c = 5; n = 100; 
  
print(findNthTerm(a, b, c, n)); 
  
# This code is contributed by 29AjayKumar 

