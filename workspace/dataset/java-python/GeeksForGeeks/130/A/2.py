

# Python program to find the number of  
# distinct XORs formed by rearranging  
# two binary strings 
  
# Function to calculate nCr % p  
# over a range 
def nCrRangeSum(n, r1, r2, p): 
  
    # Initialize the numerator  
    # and denominator  
    num = den = 1
  
    # Initialize the sum 
    sum = 0
      
    # nC0 is 1 
    if r1 == 0: 
        sum += 1
  
    # Traversing till the range 
    for i in range(r2): 
  
        # Computing the numerator 
        num = (num * (n - i)) % p 
  
        # Computing the denominator  
        den = (den * (i + 1)) % p  
  
        # If 'i' lies between the given range 
        # and is at an even interval from  
        # the starting range because  
        # the combinations at a step of 2  
        # is required  
        if(i - r1 >= -1 and (i - r1 + 1) % 2 == 0): 
  
            # Computing nCr and adding the value  
            # sum 
            sum += (num * pow(den, p - 2, p)) % p 
            sum %= p 
    return sum
  
# Function to find the number of  
# distinct XORs formed by  
# rearranging two binary strings 
def compute(A, B): 
  
    # Initializing the count variable 
    # to 0 
    c0A = c1A = c0B = c1B = 0
  
    # Iterating through A 
    for c in A: 
  
        # Increment the c1A variable 
        # if the current element is 1 
        if c == '1': 
            c1A += 1
  
        # Increment the c0A variable 
        # if the current element is 0 
        elif c == '0': 
            c0A += 1
  
    # Iterating through B 
    for c in B: 
  
        # Increment the c1B variable 
        # if the current element is 1 
        if c == '1': 
            c1B += 1
  
        # Increment the c0A variable 
        # if the current element is 0 
        elif c == '0': 
            c0B += 1
  
    # Finding the minimum number of '1's in the XOR 
    # and the maximum number of '1's in the XOR 
    max1xor = min(c0A, c1B) + min(c1A, c0B) 
    min1xor = N - min(c0B, c0A) - min(c1A, c1B) 
      
    # Compute the number of combinations between 
    # the minimum number of 1's and the maximum 
    # number of 1's and perform % with 10^9 + 7 
    ans = nCrRangeSum(N, min1xor, max1xor, 10**9 + 7) 
  
    # Return the answer 
    return ans 
  
# Driver code 
if __name__ == "__main__": 
  
    N = 3
    A = "010"
    B = "100"
  
    print(compute(A, B)) 

