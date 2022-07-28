

# Python3 program to represent  
# a number as sum of a co-prime  
# pair such that difference  
# between them is minimum 
import math 
  
# function to check if pair 
# is co-prime or not 
def coprime(a, b): 
    return 1 if(math.gcd(a, b) == 1) else 0; 
  
# function to  
# find and print  
# co-prime pair 
def pairSum(n): 
    mid = int(n / 2); 
    i = mid; 
    while(i >= 1): 
        if (coprime(i, n - i) == 1): 
            print(i, n - i); 
            break; 
        i = i - 1; 
  
# Driver code 
n = 11; 
pairSum(n); 
  
# This code is contributed 
# by mits 

