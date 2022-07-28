

# Python 3 program to find first 
# N Icanobif numbers 
  
# Iterative function to 
# reverse digits of num 
def reversedigit(num): 
    rev_num = 0
    while num > 0: 
        rev_num = rev_num * 10 + num % 10
        num = num // 10
    return rev_num 
  
# Function to print first 
# N Icanobif Numbers 
def icanobifNumbers(N): 
  
    # Initialize first, second numbers 
    first = 0
    second = 1
    if N == 1: 
        print(first) 
    elif N == 2: 
        print(first, second) 
    else: 
  
        # Print first two numbers 
        print(first, second, end = " ") 
        for i in range(3, N + 1): 
  
            # Reversing digit of previous 
            # two terms and adding them 
            x = reversedigit(first) 
            y = reversedigit(second) 
            print(x + y, end = " ") 
            temp = second 
            second = x + y 
            first = temp 
  
# Driver code 
N = 12
icanobifNumbers(N) 
  
# This code is contributed by Shrikant13 

