

# Python 3 program to count number of  
# possible strings with n characters. 
  
# Function to calculate number of strings 
def possibleStrings(n, r, b, g): 
      
    # Store factorial of numbers up to n 
    # for further computation 
    fact = [0 for i in range(n + 1)] 
    fact[0] = 1
    for i in range(1, n + 1, 1): 
        fact[i] = fact[i - 1] * i 
  
    # Find the remaining values to be added 
    left = n - (r + g + b) 
    sum = 0
  
    # Make all possible combinations of  
    # R, B and G for the remaining value 
    for i in range(0, left + 1, 1): 
        for j in range(0, left - i + 1, 1): 
            k = left - (i + j) 
  
            # Compute permutation of each  
            # combination one by one and add them. 
            sum = (sum + fact[n] / (fact[i + r] * 
                         fact[j + b] * fact[k + g])) 
      
    # Return total no. of  
    # strings/permutation 
    return sum
  
# Driver code 
if __name__ == '__main__': 
    n = 4
    r = 2
    b = 0
    g = 1
    print(int(possibleStrings(n, r, b, g))) 
      
# This code is contributed by 
# Sanjit_Prasad 

