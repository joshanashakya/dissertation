

# Python3 implementation of the approach  
  
# Function to return the  
# gcd of a and b  
def gcd(a, b) :  
  
    if (a == 0) : 
        return b;  
  
    return gcd(b % a, a);  
  
# Function to return the count of integers  
# from the range [1, num] which are  
# divisible by either a, b or c  
def divTermCount(a, b, c, num) :  
  
    # Calculate the number of terms divisible by a, b  
    # and c then remove the terms which are divisible  
    # by both (a, b) or (b, c) or (c, a) and then  
    # add the numbers which are divisible by a, b and c  
    return ((num // a) + (num // b) + (num // c) - 
                 (num // ((a * b) // gcd(a, b))) - 
                 (num // ((c * b) // gcd(c, b))) - 
                 (num // ((a * c) // gcd(a, c))) + 
                 (num // ((a * b * c) // gcd(gcd(a, b), c))));  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = 7; b = 3; c = 5; n = 100;  
  
    print(divTermCount(a, b, c, n));  
  
# This code is contributed by AnkitRai01 

