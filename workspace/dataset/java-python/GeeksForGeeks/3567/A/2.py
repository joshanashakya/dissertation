

# python 3 implementation of the approach 
  
# Function to find powers of 2, 3 and 7 in x 
def Divisors(x): 
    # To keep count of each divisor 
    c = 0
  
    # To store the result 
    v = [] 
  
    # Count powers of 2 in x 
    while (x % 2 == 0): 
        c += 1
        x /= 2
  
    v.append(c) 
  
    c = 0
  
    # Count powers of 3 in x 
    while (x % 3 == 0): 
        c += 1
        x /= 3
  
    v.append(c) 
  
    c = 0
  
    # Count powers of 7 in x 
    while (x % 7 == 0): 
        c += 1
        x /= 7
  
    v.append(c) 
  
    # Reamining number which is not 
    # divisible by 2, 3 or 7 
    v.append(x) 
  
    return v 
  
# Function to return the minimum number of 
# given operations required to make a and b equal 
def MinOperations(a, b): 
    # a = x * 2^a1 * 3^a2 * 7^a3 
    # va[0] = a1 
    # va[1] = a2 
    # va[2] = a3 
    # va[3] = x 
    va = Divisors(a) 
  
    # Similarly for b 
    vb = Divisors(b) 
  
    # If a and b cannot be made equal 
    # with the given operation. Note 
    # that va[3] and vb[3] contain 
    # remaining numbers after repeated  
    # divisions with 2, 3 and 7. 
    # If remaining numbers are not same 
    # then we cannot make them equal. 
    if (va[3] != vb[3]): 
        return -1
  
    # Minimum number of operations required 
    minOperations = abs(va[0] - vb[0]) + abs(va[1] - vb[1]) + abs(va[2] - vb[2]) 
  
    return minOperations 
  
# Driver code 
if __name__ == '__main__': 
    a = 14
    b = 28
    print(MinOperations(a, b)) 
  
# This code is contributed by 
# Sanjit_Prasad 

