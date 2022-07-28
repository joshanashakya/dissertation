

# Python3 program to implement  
# the above approach  
from math import gcd 
  
# Function to print all the numbers  
def printNumbers(a, n, x) :  
  
    flag = False
  
    # Iterate for every element in the array  
    for i in range(n) : 
  
        num = a[i] 
  
        # Find the gcd  
        g = gcd(num, x) 
  
        # Iterate till gcd is 1  
        # of number and x  
        while (g != 1) :  
  
            # Divide the number by gcd  
            num //= g 
  
            # Find the new gcdg  
            g = gcd(num, x) 
  
        # If the number is 1 at the end  
        # then print the number  
        if (num == 1) : 
            flag = True;  
            print(a[i], end = " "); 
  
    # If no numbers have been there  
    if (not flag) : 
        print("There are no such numbers")  
  
# Driver Code  
if __name__ == "__main__" :  
  
    x = 60
    a = [ 2, 5, 10, 7, 17 ] 
    n = len(a)  
  
    printNumbers(a, n, x) 
      
# This code is contributed by Ryuga 

