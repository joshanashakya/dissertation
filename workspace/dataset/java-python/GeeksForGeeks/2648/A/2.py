

# Python program to print first n  
# Fibonacci numbers 
  
# Function to print first n  
# Fibonacci Numbers 
def printFibonacciNumbers(n): 
      
    f1 = 0
    f2 = 1
    if (n < 1): 
        return
    for x in range(0, n): 
        print(f2, end = " ") 
        next = f1 + f2 
        f1 = f2 
        f2 = next
          
# Driven code 
printFibonacciNumbers(7) 
  
# This code is contributed by Danish Raza 

