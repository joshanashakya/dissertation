

# Python 3 program to find the number 
# of permutations that satisfy 
# the given condition in an array 
  
# Function to calculate x ^ y 
# recursively 
def pow( x, y): 
  
    if (y == 1): 
        return x 
    if (y == 0): 
        return 1
  
    temp = pow(x, y // 2) 
  
    temp *= temp 
  
    if (y & 1): 
        temp *= x 
  
    return temp 
  
# Function to return the number of 
# permutations that satisfy the 
# given condition in an array 
def noOfPermutations(a, n): 
  
    # If there is only one element then 
    # only one permutation is available 
    if (n == 1): 
        return 1
  
    # Sort the array for calculating 
    # the number of elements occurring twice 
    a.sort() 
  
    # If the maximum element is occurring 
    # twice, then the number of permutations 
    # satisfying the condition is 0 
    if (a[n - 1] == a[n - 2]): 
        return 0
  
    # This variable will store the 
    # number of element occurring twice 
    x = 0
  
    # Loop to check the number of elements 
    # occurring twice 
    for i in range( n - 2): 
  
        # Check if this element 
        # is occuring twice 
        if (a[i] == a[i + 1]): 
  
            # If this element is occurring 
            # twice then check if this number 
            # is occurring more than twice 
            if (a[i] == a[i + 2]): 
  
                # If element occuring thrice 
                # then no permutation will 
                # satisfy the given condition 
                return 0
          
            x += 1
  
            # Since we have checked the next 
            # element as well, then we can 
            # increment the loop variable 
            i += 1
  
    return pow(2, n - 2 * x - 1) 
  
# Driver code 
if __name__ == "__main__": 
  
    a = [ 1, 2, 2, 3, 4 ] 
    n = len(a) 
    num = noOfPermutations(a, n) 
    print (num) 
  
# This code is contributed by chitranayal 

