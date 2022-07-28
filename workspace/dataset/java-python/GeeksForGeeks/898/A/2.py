

# Python3 program to find all common 
# divisors of N numbers 
  
# Function to calculate gcd of 
# two numbers 
def gcd(a, b): 
    if (a == 0): 
        return b 
    return gcd(b % a, a) 
  
# Function to prall the 
# common divisors 
def printAllDivisors(arr, N): 
      
    # Variable to find the gcd 
    # of N numbers 
    g = arr[0] 
  
    # Set to store all the 
    # common divisors 
    divisors = dict() 
  
    # Finding GCD of the given 
    # N numbers 
    for i in range(1, N): 
        g = gcd(arr[i], g) 
  
    # Finding divisors of the 
    # HCF of n numbers 
    for i in range(1, g + 1): 
        if i*i > g: 
            break
        if (g % i == 0): 
            divisors[i] = 1
            if (g // i != i): 
                divisors[g // i] = 1
  
    # Prall the divisors 
    for it in sorted(divisors): 
        print(it, end=" ") 
  
# Driver's Code 
if __name__ == '__main__': 
    arr= [6, 90, 12, 18, 30, 24] 
    n = len(arr) 
  
    # Function to prall the 
    # common divisors 
    printAllDivisors(arr, n) 
  
# This code is contributed by mohit kumar 29 

