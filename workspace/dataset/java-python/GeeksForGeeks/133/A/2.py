

# Python3 program to find number of  
# sets without size A and B 
mod = 10**9 + 7
  
# Function to find a^m1 
def power(a, m1): 
    if (m1 == 0): 
        return 1
    elif (m1 == 1): 
        return a 
    elif (m1 == 2): 
        return (a * a) % mod 
           
    # If m1 is odd, then return a * a^m1/2 * a^m1/2 
    elif (m1 & 1): 
        return (a * power(power(a, m1 // 2), 2)) % mod 
    else: 
        return power(power(a, m1 // 2), 2) % mod 
  
# Function to find factorial of a number 
def factorial(x): 
    ans = 1
    for i in range(1, x + 1): 
        ans = (ans * i) % mod 
  
    return ans 
  
# Function to find inverse of x 
def inverse(x): 
    return power(x, mod - 2) 
  
# Function to find nCr 
def binomial(n, r): 
    if (r > n): 
        return 0
  
    ans = factorial(n) 
  
    ans = (ans * inverse(factorial(r))) % mod 
  
    ans = (ans * inverse(factorial(n - r))) % mod 
  
    return ans 
  
# Function to find number of sets without size a and b 
def number_of_sets(n, a, b): 
      
    # First calculate all sets 
    ans = power(2, n) 
  
    # Remove sets of size a 
    ans = ans - binomial(n, a) 
  
    if (ans < 0): 
        ans += mod 
  
    # Remove sets of size b 
    ans = ans - binomial(n, b) 
  
    # Remove empty set 
    ans -= 1
  
    if (ans < 0): 
        ans += mod 
  
    # Return the required answer 
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    N = 4
    A = 1
    B = 3
  
    # Function call 
    print(number_of_sets(N, A, B)) 
  
# This code is contributed by mohit kumar 29     

