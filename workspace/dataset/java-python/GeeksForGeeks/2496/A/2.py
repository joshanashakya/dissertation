

# Python3 program to find all factorial  
# numbers smaller than or equal to n. 
  
def printFactorialNums( n): 
    fact = 1
    x = 2
    while fact <= n: 
        print(fact, end = " ") 
          
        # Compute next factorial 
        # using previous 
        fact = fact * x 
          
        x += 1
  
# Driver code 
n = 100
printFactorialNums(n) 
  
# This code is contributed by "Abhishek Sharma 44" 

