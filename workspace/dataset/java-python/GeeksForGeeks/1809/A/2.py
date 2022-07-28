

# Python 3 implementation of above approach 
  
# Function to check if the given number  
# is divisible by sum of its digits 
def isDivisible(n): 
  
    temp = n 
  
    # Find sum of digits 
    sum = 0; 
    while (n):  
      
        k = n % 10; 
        sum += k; 
        n /= 10; 
      
    # check if sum of digits divides n 
    if (temp % sum == 0): 
        return "YES"; 
  
    return "NO"; 
  
# Driver Code 
n = 123; 
  
print(isDivisible(n)); 
  
# This code is contributed by  
# Akanksha Rai 

