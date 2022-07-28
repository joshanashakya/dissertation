

# Python3 implementation of above  
# approach 
import math as mt  
  
# function to check prime 
def isPrime(n): 
    i, c = 0, 0
    for i in range(1, n // 2): 
        if (n % i == 0): 
            c += 1
      
    if (c == 1): 
        return 1
    else: 
        return 0
  
# Function to generate smallest possible 
# number with given digits 
def findMinNum(arr, n): 
      
    # Declare a Hash array of size 10 
    # and initialize all the elements to zero 
    first, last = 0, 0
    Hash = [0 for i in range(10)] 
  
    # store the number of occurrences of 
    # the digits in the given array into  
    # the Hash table 
    for i in range(n): 
        Hash[arr[i]] += 1
  
    # Traverse the Hash in ascending order 
    # to print the required number 
    print("Minimum number: ", end = "") 
    for i in range(0, 10): 
          
        # Print the number of times  
        # a digits occurs 
        for j in range(Hash[i]): 
            print(i, end = "") 
              
    print() 
      
    # extracting the first digit 
    for i in range(10): 
        if (Hash[i] != 0): 
            first = i 
            break
          
    # extracting the last digit 
    for i in range(9, -1, -1): 
        if (Hash[i] != 0): 
            last = i 
            break
          
    num = first * 10 + last 
    rev = last * 10 + first 
  
    # printing the prime combinations 
    print("Prime combinations: ", end = "") 
    if (isPrime(num) and isPrime(rev)): 
        print(num, " ", rev) 
    elif (isPrime(num)): 
        print(num) 
    elif (isPrime(rev)): 
        print(rev) 
    else: 
        print("No combinations exist") 
  
# Driver code 
arr = [ 1, 2, 4, 7, 8] 
findMinNum(arr, 5) 
  
# This code is contributed by 
# Mohit kumar 29 

