

# Python 3 implementation of the 
# Custom Fibonacci series 
  
# Function to return the nth term 
# of the required sequence 
def nth_term(a, b, n): 
    z = 0
    if (n % 6 == 1): 
        z = a 
    elif (n % 6 == 2): 
        z = b 
    elif (n % 6 == 3): 
        z = b - a 
    elif (n % 6 == 4): 
        z = -a 
    elif (n % 6 == 5): 
        z = -b 
    if (n % 6 == 0): 
        z = -(b - a) 
    return z 
  
# Driver code 
if __name__ == '__main__': 
    a = 10
    b = 17
    n = 3
  
    print(nth_term(a, b, n)) 
      
# This code is contributed by Surendra_Gangwar 

