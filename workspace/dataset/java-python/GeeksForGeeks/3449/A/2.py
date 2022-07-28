

# Python3 Program to find Nth Armstrong Number 
import math; 
import sys; 
  
# Function to find Nth Armstrong Number 
def NthArmstrong(n): 
  
    count = 0; 
      
    # upper limit from integer  
    for i in range(1, sys.maxsize): 
  
        num = i;  
        rem = 0; 
        digit = 0; 
        sum = 0; 
          
        # Copy the value for num in num  
        num = i; 
          
        # Find total digits in num  
        digit = int(math.log10(num) + 1); 
          
        # Calculate sum of power of digits  
        while(num > 0): 
            rem = num % 10; 
            sum = sum + pow(rem, digit); 
            num = num // 10; 
          
        # Check for Armstrong number  
        if(i == sum): 
            count += 1; 
        if(count == n): 
            return i; 
  
# Driver Code 
n = 12; 
print(NthArmstrong(n)); 
  
# This code is contributed by chandan_jnu 

