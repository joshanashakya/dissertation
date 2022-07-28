

# Python3 program to find sum of greatest 
# odd divisor of numbers in given range 
  
# Function to return sum of first 
# n odd numbers 
def square(n): 
    return n * n;  
  
# Recursive function to return sum 
# of greatest odd divisor of numbers  
# in range [1, n] 
def sum(n): 
  
    if (n == 0): 
        return 0; 
    if (n % 2 == 1): 
          
        # Odd n 
        return (square(int((n + 1) / 2)) + 
                   sum(int(n / 2)));  
    else: 
          
        # Even n 
        return (square(int(n / 2)) +
                   sum(int(n / 2))); 
  
# Function to return sum of greatest 
# odd divisor of numbers in range [a, b] 
def oddDivSum(a, b): 
  
    return sum(b) - sum(a - 1); 
  
# Driver code 
a, b = 3, 9; 
print(oddDivSum(a, b)); 
  
# This code is contributed by mits 

