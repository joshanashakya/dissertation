

# Python3 program to find Sum of digits with even 
# number of 1’s in their binary representation 
  
# Function to count and check the 
# number of 1's is even or odd 
def countOne(n): 
    count = 0
    while (n): 
        n = n & (n - 1) 
        count += 1
  
    if (count % 2 == 0): 
        return 1
    else: 
        return 0
  
# Function to calculate the summ 
# of the digits of a number 
def summDigits(n): 
    summ = 0
    while (n != 0): 
        summ += n % 10
        n //= 10
  
    return summ 
  
# Driver Code 
arr = [4, 9, 15] 
  
n = len(arr) 
total_summ = 0
  
# Iterate through the array 
for i in range(n): 
    if (countOne(arr[i])): 
        total_summ += summDigits(arr[i]) 
  
print(total_summ ) 
  
# This code is contributed by Mohit Kumar 

