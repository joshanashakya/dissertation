

# Python 3 program to find  
# factorial of given number 
  
# Function to find factorial of given number 
def factorial(n): 
       
    i = n 
    fact = 1
      
    while(n / i != n): 
        fact = fact * i 
        i -= 1
          
    return fact 
  
# Driver Code 
num = 5; 
print("Factorial of", num, "is", 
factorial(num)) 
   
# This code is contributed by Smitha Dinesh Semwal 

