

# Python3 implementation of the approach  
N = 20
  
# To store the factorials  
fact = [0] * N;  
  
# Function to update fact[] array  
# such that fact[i] = i!  
def pre() : 
  
    # 0! = 1  
    fact[0] = 1;  
    for i in range(1, N): 
  
        # i! = i * (i - 1)!  
        fact[i] = i * fact[i - 1];  
  
# Function to return the count  
# of possible permutations  
def CountPermutation(a, n):  
  
    # To store the result  
    ways = 1;  
  
    # Sort the array  
    a.sort(); 
  
    # Initial size of the block  
    size = 1;  
    for i in range(1, n): 
  
        # Increase the size of block  
        if (a[i] == a[i - 1]): 
            size += 1;  
          
        else : 
  
            # Update the result for  
            # the previous block  
            ways *= fact[size];  
  
            # Reset the size to 1  
            size = 1;  
  
    # Update the result for  
    # the last block  
    ways *= fact[size];  
  
    return ways;  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 1, 2, 4, 4, 2, 4 ];  
    n = len(a);  
  
    # Pre-calculating factorials  
    pre();  
  
    print(CountPermutation(a, n));  
      
# This code is contributed by AnkitRai01 

