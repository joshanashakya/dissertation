

# Python3 implementation of the approach 
import random 
  
# To store the random permutation 
permutation = [] 
  
# Utility function to print 
# the generated permutation 
def printPermutation() : 
  
    for i in permutation: 
        print(i, end = " ") 
  
# Function to return a random 
# number between x and y 
def give_random_number(l, r) : 
  
    x = random.randint(l, r) 
    return x 
  
# Recursive function to generate 
# the random permutation 
def generate_random_permutation(l, r) : 
  
    # Base condition 
    if (l > r) : 
        return
  
    # Random number returned from the function 
    n = give_random_number(l, r) 
  
    # Inserting random number in vector 
    permutation.append(n) 
  
    # Recursion call for [l, n - 1] 
    generate_random_permutation(l, n - 1) 
  
    # Recursion call for [n + 1, r] 
    generate_random_permutation(n + 1, r) 
  
# Driver code 
l = 5
r = 15
  
# Generate permutation 
generate_random_permutation(l, r) 
  
# Print the generated permutation 
printPermutation() 
  
# This code is contributed by ihritik 

