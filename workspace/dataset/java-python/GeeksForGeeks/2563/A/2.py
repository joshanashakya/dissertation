

# Python implementation of the 
# above approach 
  
# Function to prthe largest 
# N-digit even and odd numbers 
# of base B 
def findNumbers(n, b): 
    # Intialise the Number 
    even = 0; 
    odd = 0; 
  
    # If Base B is even, then 
    # B^n will give largest 
    # Even number of N+1 digit 
    if (b % 2 == 0): 
  
        # To get even number of 
        # N digit subtract 2 from 
        # B^n 
        even = pow(b, n) - 2; 
  
        # To get odd number of 
        # N digit subtract 1 from 
        # B^n 
        odd = pow(b, n) - 1; 
      
  
    # If Base B is odd, then 
    # B^n will give largest 
    # Odd number of N+1 digit 
    else: 
  
        # To get even number of 
        # N digit subtract 1 from 
        # B^n 
        even = pow(b, n) - 1; 
  
        # To get odd number of 
        # N digit subtract 2 from 
        # B^n 
        odd = pow(b, n) - 2; 
      
    print("Even Number = ",int(even)); 
    print("Odd Number = ", int(odd)); 
  
# Driver's Code 
if __name__ == '__main__': 
    N = 2; 
    B = 5; 
  
    # Function to find the 
    # numbers 
    findNumbers(N, B); 
      
# This code is contributed by 29AjayKumar 

