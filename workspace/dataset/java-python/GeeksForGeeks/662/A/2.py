

# Python3 implementation of the approach  
  
# Function to return the reverse of n  
def reverse(n):  
    rev = 0;  
    while (n > 0): 
        d = n % 10;  
        rev = rev * 10 + d;  
        n = n // 10;  
    return rev;  
  
# Function that returns true  
# if n is a palindrome  
def isPalin(n):  
    return (n == reverse(n));  
  
  
# Function to return the  
# count of digits of n  
def countDigits(n):  
    c = 0;  
    while (n > 0):  
        n = n // 10;  
        c += 1; 
    return c;  
  
# Function to return the count of digits  
# in all the palindromic numbers of arr[]  
def countPalinDigits(arr, n):  
    s = 0;  
    for i in range(n): 
  
        # If arr[i] is a one digit number  
        # or it is a palindrome  
        if (arr[i] < 10 or isPalin(arr[i])): 
            s += countDigits(arr[i]);  
  
    return s;  
  
  
# Driver code  
arr = [ 121, 56, 434 ];  
n = len(arr);  
print(countPalinDigits(arr, n));  
  
# This code contributed by Rajput-Ji 

