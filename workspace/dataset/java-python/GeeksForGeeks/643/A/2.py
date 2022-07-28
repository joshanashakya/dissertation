

# Python3 implementation of the approach  
  
# Function to return 
# the nth XOR Fibonacci number  
def nthXorFib(n, a, b): 
    if n == 0 :  
        return a  
    if n == 1 :  
        return b  
    if n == 2 :  
        return a ^ b  
  
    return nthXorFib(n % 3, a, b)  
  
# Driver code  
a = 1
b = 2
n = 10
print(nthXorFib(n, a, b))  
  
# This code is contributed by divyamohan123  

