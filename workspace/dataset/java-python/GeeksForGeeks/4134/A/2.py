

# Python3 program to find partition point in  
# array to maximize xor sum 
  
# Function to calculate Prefix Xor array 
def ComputePrefixXor(arr, PrefixXor, n): 
    PrefixXor[0] = arr[0]; 
      
    # Calculating prefix xor 
    for i in range(1, n): 
        PrefixXor[i] = PrefixXor[i - 1] ^ arr[i]; 
  
# Function to find partition point in  
# array to maximize xor sum 
def Xor_Sum(arr, n): 
    # To store prefix xor 
    PrefixXor = [0] * n; 
      
    # Compute the prfix xor 
    ComputePrefixXor(arr, PrefixXor, n); 
  
    # To store sum and index 
    sum, index = 0, 0; 
  
    # Calculate the maximum sum that can be obtained 
    # splitting the array at some index i 
    for i in range(n): 
          
        # PrefixXor[i] = Xor of all arr  
        # elements till i'th index PrefixXor[n-1] 
        # ^ PrefixXor[i] = Xor of all elements  
        # from i+1' th index to n-1'th index 
        if (PrefixXor[i] + (PrefixXor[n - 1] ^  
                            PrefixXor[i]) > sum):  
            sum = PrefixXor[i] +\ 
                 (PrefixXor[n - 1] ^ PrefixXor[i]); 
            index = i; 
  
    # Return the index 
    return index + 1; 
  
# Driver code 
arr = [ 1, 4, 6, 3, 8, 13, 34, 2, 21, 10 ]; 
n = len(arr); 
  
# Function call 
print(Xor_Sum(arr, n)); 
  
# This code is contributed by Rajput-Ji 

