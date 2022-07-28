

# python implementation of the approach 
  
# Function to return the 
# sum of digits of x 
def sumOfDigits(x): 
    sum = 0
    while x != 0: 
        sum += x % 10
        x = x//10
    return sum
  
  
# Function to return the count 
# of required numbers 
def countNumbers(l, r): 
    count = 0
    for i in range(l, r + 1): 
  
        # If i is divisible by 2 and 
        # sum of digits of i is divisible by 3 
        if i % 2 == 0 and sumOfDigits(i) % 3 == 0: 
            count += 1
    return count 
  
# Driver code 
l = 1000; r = 6000
print(countNumbers(l, r)) 
  
# This code is contributed by Shrikant13 

