

# Python3 program to find the largest  
# number that cannot be formed 
# from given two coins 
  
# Utility function to find gcd 
def gcd(a, b): 
    while (a != 0): 
        c = a; 
        a = b % a; 
        b = c; 
      
    return b; 
  
# Function to print the desired output 
def forbenius(X, Y): 
  
    # Solution doesn't exist  
    # if GCD is not 1 
    if (gcd(X, Y) != 1): 
        print("NA"); 
        return; 
  
    # Else apply the formula 
    A = (X * Y) - (X + Y); 
    N = (X - 1) * (Y - 1) // 2; 
  
    print("Largest Amount =", A); 
    print("Total Count =", N); 
  
# Driver Code 
X = 2;  
Y = 5; 
forbenius(X, Y); 
  
X = 5;  
Y = 10; 
print(""); 
forbenius(X, Y); 
  
# This code is contributed by mits 

