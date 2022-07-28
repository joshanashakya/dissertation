

# Python3 implementation of above approach 
  
# Function to convert the number into binary  
# and store the number into an array 
def convertToBinary(num, a, n): 
  
    pointer = n - 1
    while (num > 0): 
        a[pointer] = num % 2
        num = num // 2
        pointer -= 1
  
# Function to check if the sum of the digits till 
# the mid of the array and the sum of the digits 
# from mid till n is the same, if they are same 
# then print that binary 
def checkforsum(a, n): 
  
    sum1 = 0
    sum2 = 0
    mid = n // 2
  
    # Calculating the sum from 0 till mid  
    # and store in sum1 
    for i in range(mid): 
        sum1 = sum1 + a[i] 
  
    # Calculating the sum from mid till n  
    # and store in sum2 
    for j in range(mid, n): 
        sum2 = sum2 + a[j] 
  
    # If sum1 is same as sum2 print the binary 
    if (sum1 == sum2): 
        for i in range(n): 
            print(a[i], end = "") 
        print() 
  
# Function to prsequence 
def print_seq(m): 
  
    n = (2 * m) 
  
    # Creating the array 
    a = [0 for i in range(n)] 
  
  
    for i in range(pow(2, n)): 
  
        # Converting the number 
        # into binary first 
        convertToBinary(i, a, n) 
  
        # Checking if the sum of the first half  
        # of the array is same as the sum of  
        # the next half 
        checkforsum(a, n) 
  
# Driver Code 
m = 2
  
print_seq(m) 
  
# This code is contributed by mohit kumar 

