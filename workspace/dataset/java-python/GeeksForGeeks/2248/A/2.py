

# Python3 Program to count  
# Number of ways in which two  
# Beautiful girls are in different group  
  
# This function will  
# return the factorial of a  
# given number 
def factorial(n) : 
  
    result = 1
    for i in range(1, n + 1) : 
        result *= i 
          
    return result 
  
# This function will calculate nCr of given  
# n and r  
def nCr(n, r) : 
  
    return (factorial(n) // (factorial(r)  
            * factorial(n - r))) 
  
  
# This function will  
# Calculate number of ways  
def calculate_result(n) : 
  
    result = 2 * nCr((n -2), (n // 2 - 1)) 
  
    return result 
  
  
# Driver code 
if __name__ == "__main__" : 
  
    a, b = 2, 4
    print(calculate_result(2 * a)) 
    print(calculate_result(2 * b)) 
  
# This code is contributed by  
# ANKITRAI1 

