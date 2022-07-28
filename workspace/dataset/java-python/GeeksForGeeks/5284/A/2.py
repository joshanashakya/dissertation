

# Python3 implementation of  
# above approach 
  
# Function To find digitsum  
# for a number 
def digitsum(n): 
  
    # Logic for digitsum 
    r = n % 9; 
    if (r == 0): 
        return 9; 
    else: 
        return r; 
  
# Function to find minimum digit sum 
def find(n, d): 
  
    # Variable to store answer 
    # Intialise by 10 as the answer 
    # will always be less than 10 
    minimum = 10; 
  
    # Values of digitsum will  
    # repeat after i=8, due to  
    # modulo taken with 9 
    for i in range(9): 
  
        current = (n + i * d); 
        minimum = min(minimum, 
                      digitsum(current)); 
  
    return minimum; 
  
# Driver Code 
n = 2546;  
d = 124; 
print("Minimum possible digitsum is :",  
                           find(n, d)); 
  
# This code is contributed by mits 

