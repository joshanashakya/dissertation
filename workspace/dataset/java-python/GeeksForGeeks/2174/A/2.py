

# Python3 program to answer queries 
# for N-th prime factor of a number 
from math import sqrt,ceil 
N = 10001
  
# 2-D vector that stores prime factors 
v = [[] for i in range(N)] 
  
# Function to pre-store prime 
# factors of all numbers till 10^6 
def preprocess(): 
      
    # calculate unique prime factors for 
    # every number till 10^6 
    for i in range(1, N): 
  
        num = i 
  
        # find prime factors 
        for j in range(2,ceil(sqrt(num)) + 1): 
            if (num % j == 0): 
                  
                # store if prime factor 
                v[i].append(j) 
  
                while (num % j == 0): 
                    num = num // j 
  
        if(num > 2): 
            v[i].append(num) 
  
# Function that returns answer 
# for every query 
def query(number, n): 
    return v[number][n - 1] 
  
# Driver Code 
  
# Function to pre-store unique prime factors 
preprocess() 
  
# 1st query 
number = 6
n = 1
print(query(number, n)) 
  
# 2nd query 
number = 210
n = 3
print(query(number, n)) 
  
# 3rd query 
number = 210
n = 2
print(query(number, n)) 
  
# 4th query 
number = 60
n = 2
print(query(number, n)) 
  
# This code is contributed by mohit kumar 29 

