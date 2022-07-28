

# Python3 program for efficient approach to  
# find largest number having digits in  
# non-decreasing order.  
  
# Prints the largest number smaller than s  
# and digits in non-decreasing order.  
def nondecdigits(s):  
    m = len(s);  
  
    # array to store digits of number  
    a = [0] * m;  
  
    # conversion of characters of string  
    # int number  
    for i in range(m):  
        a[i] = ord(s[i]) - ord('0');  
  
    # variable holds the value of index  
    # after which all digits are set 9  
    level = m - 1;  
    for i in range(m - 1, 0, -1):  
          
        # Checking the condition if the digit  
        # is less than its left digit  
        if (a[i] < a[i - 1]):  
            a[i - 1] -= 1;  
            level = i - 1;  
  
    # If first digit is 0 no need to print it */ 
    if (a[0] != 0): 
        for i in range(level + 1):  
            print(a[i], end = "");  
        for i in range(level + 1, m):  
            print("9", end = "");  
    else: 
        for i in range(1, level):  
            print(a[i], end = "");  
        for i in range(level + 1, m): 
            print("9", end = "");  
  
# Driver Code  
n = "200";  
nondecdigits(n);  
  
# This code is contributed by mits 

