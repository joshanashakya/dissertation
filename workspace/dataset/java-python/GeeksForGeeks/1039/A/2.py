

# Python3 program to count the numbers  
# within a range whose prime factors  
# are only 2 and 3 
  
# Function to count the number within  
# a range whose prime factors are only  
# 2 and 3 
def findTwoThreePrime(l, r) : 
  
    # Start with 2 so that 1  
    # doesn't get counted 
    if (l == 1) : 
        l += 1
  
    count = 0
  
    for i in range(l, r + 1) : 
        num = i 
  
        # While num is divisible by 2,  
        # divide it by 2 
        while (num % 2 == 0) : 
            num //= 2; 
  
        # While num is divisible by 3,  
        # divide it by 3 
        while (num % 3 == 0) : 
            num //= 3
  
        # If num got reduced to 1 then it has 
        # only 2 and 3 as prime factors 
        if (num == 1) : 
            count += 1
  
    return count 
  
# Driver code 
if __name__ == "__main__" : 
  
    l = 1
    r = 10
      
    print(findTwoThreePrime(l, r)) 
      
# This code is contributed by Ryuga 

