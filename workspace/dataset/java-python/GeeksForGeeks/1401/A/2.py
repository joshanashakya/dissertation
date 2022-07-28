

def factorial(n):  
    fact = 1;  
    for i in range(2, n + 1):  
        fact = fact * i  
    return (fact)  
  
def result(n, m): 
    return(factorial(n) - factorial(n - m + 1) * factorial(m)) 
  
# driver code 
print(result(5, 3)) 

