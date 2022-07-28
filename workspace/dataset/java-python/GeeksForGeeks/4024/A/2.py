

# Python program to find sum of digits of 
# n in different bases from 2 to n-1. 
   
# def to calculate sum of  
# digit for a given base 
def solve(n, base) : 
       
    # Sum of digits 
    result = 0 
       
    # Calculating the number (n) by 
    # taking mod with the base and adding  
    # remainder to the result and  
    # parallelly reducing the num value . 
    while (n > 0) : 
      
        remainder = n % base  
        result = result + remainder   
        n = int(n / base) 
       
    # returning the result  
    return result  
   
def printSumsOfDigits(n) : 
       
    # def calling for  
    # multiple bases 
    for base in range(2, n) : 
        print (solve(n, base), end=" ") 
  
# Driver code 
n = 8
printSumsOfDigits(n) 
   
# This code is contributed by Manish Shaw 
# (manishshaw1) 

