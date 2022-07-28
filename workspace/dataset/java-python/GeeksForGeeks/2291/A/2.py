

# Python program implementation of above approach 
  
# Function to check if given number is  
# divisible by any of its digits 
def isDivisible(n): 
    temp = n 
  
    # check if any of digit divides n 
    while(n): 
        k = n % 10
  
        # check if K divides N 
        if(temp % k == 0): 
            return "YES"
  
        n /= 10; 
  
    # Number is not divisible by  
    # any of digits 
    return "NO"
  
# Driver Code 
n = 9876543
print(isDivisible(n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

