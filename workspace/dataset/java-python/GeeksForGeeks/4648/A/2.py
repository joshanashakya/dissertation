

# Python 3 program to find minimal  
# 0 Fibonacci for a prime number p 
  
# Returns position of first Fibonacci  
# number whose modulo p is 0. 
def findMinZero(p): 
    first = 1
    second = 1
    number = 2
    next = 1
  
    while (next): 
        next = (first + second) % p 
        first = second 
        second = next
        number = number + 1
      
    return number 
  
# Driver code 
if __name__ == '__main__': 
    p = 7
    print("Minimal zero is:", findMinZero(p)) 
  
# This code is contributed by 
# Surendra_Gangwar 

