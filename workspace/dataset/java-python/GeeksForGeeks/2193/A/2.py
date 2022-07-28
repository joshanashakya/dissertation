

# Python3 program to largest and smallest digit of a number 
  
# Function to the largest and smallest digit of a number 
def Digits(n): 
    largest = 0
    smallest = 9
  
    while (n): 
        r = n % 10
  
        # Find the largest digit 
        largest = max(r, largest) 
  
        # Find the smallest digit 
        smallest = min(r, smallest) 
  
        n = n // 10
  
    print(largest,smallest) 
  
  
# Driver code 
  
n = 2346
  
# Function call 
Digits(n) 
  
# This code is contributed by mohit kumar 29 

