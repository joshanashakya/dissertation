

# Python3 implementation to find the  
# sum of all perfect numbers  
# lying in the range [L, R]  
  
from math import sqrt 
  
# Array to store the sum  
pref = [0]*10000;  
  
# Function to check if a number is  
# a perfect number or not  
def isPerfect(n)  : 
  
    sum = 1;  
  
    # Iterating till the square root  
    # of the number and checking if  
    # the sum of divisors is equal  
    # to the number or not  
    for i in range(2, int(sqrt(n)) + 1) : 
        if (n % i == 0) : 
            if (i * i != n) : 
                sum = sum + i + n // i;  
            else : 
                sum = sum + i;  
                  
    # If it is a perfect number, then  
    # return the number  
    if (sum == n and n != 1) : 
        return n;  
  
    # Else, return 0  
    return 0;  
  
# Function to precompute the sum  
# of perfect squares and store  
# then in an array  
def precomputation() : 
  
    for i in range(1, 10000) :  
        pref[i] = pref[i - 1] + isPerfect(i);  
  
if __name__ == "__main__" :  
  
  
    L = 6; R = 28;  
  
    precomputation();  
  
    print(pref[R] - pref[L - 1]);  
  
# This code is contributed by AnkitRai01 

