

# Python 3 program to find the  
# possible number of triangles  
# that can be formed from set of  
# points on three lines 
  
  
# Returns factorial of a number 
def factorial(n): 
    fact = 1
    for i in range(2, n + 1): 
        fact = fact * i 
    return fact 
  
# calculate c(n, r) 
def ncr(n, r): 
  
    return (factorial(n) // (factorial(r) * 
                             factorial(n - r))) 
  
# Driver code 
if __name__ == "__main__": 
    m = 3
    n = 4
    k = 5
    totalTriangles = (ncr(m + n + k, 3) - 
                      ncr(m, 3) - ncr(n, 3) - 
                      ncr(k, 3)) 
    print(totalTriangles) 
  
# This code is contributed  
# by ChitraNayal 

