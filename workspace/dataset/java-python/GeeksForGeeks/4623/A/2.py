

# Python3 code to print fibonacci  
# numbers till n using direct formula.  
import math 
  
# Function to calculate fibonacci  
# using recurrence relation formula  
def fibonacci(n): 
  
    for i in range(n):  
        # Using direct formula  
        fib = ((pow((1 + math.sqrt(5)), i) -
                pow((1 - math.sqrt(5)), i)) / 
               (pow(2, i) * math.sqrt(5)));  
                  
        print(int(fib), end = " ");  
  
# Driver code  
n = 8;  
fibonacci(n);  
  
# This code is contributed by mits 

