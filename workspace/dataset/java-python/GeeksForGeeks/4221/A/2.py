

# Python implementation of the above approach 
  
# Function to count of all rotations 
# which are odd and even 
def countOddRotations(n): 
    odd_count = 0; even_count = 0
    while n != 0: 
        digit = n % 10
        if digit % 2 == 0: 
            odd_count += 1
        else: 
            even_count += 1
        n = n//10
    print("Odd =", odd_count) 
    print("Even =", even_count) 
  
# Driver code 
n = 1234
countOddRotations(n) 
  
# This code is contributed by Shrikant13 

