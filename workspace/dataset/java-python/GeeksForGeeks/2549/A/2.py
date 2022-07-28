

# Python3 program for  
# Digit Product Sequence 
  
# function to produce and  
# print Digit Product Sequence 
  
def digit_product_Sum(N): 
      
    # Array which store sequence 
    a = [0] * (N + 1); 
      
    # Temporary variable 
    # to store product 
    product = 1; 
      
    # Initialize first element  
    # of the array with 1 
    a[0] = 1; 
      
    # Run a loop from 1 to N.  
    # Check if previous number  
    # is single digit or not.  
    # If yes then product = 1  
    # else take modulus. Then  
    # again check if previous  
    # number is sigle digit or 
    # not if yes then store  
    # previous number, else store  
    # its first value Then for 
    # every i store value in  
    # the array. 
    for i in range(1, N + 1): 
        product = int(a[i - 1] / 10); 
        if (product == 0): 
            product = 1; 
        else: 
            product = a[i - 1] % 10; 
          
        val = int(a[i - 1] / 10); 
        if (val == 0): 
            val = a[i - 1]; 
        a[i] = a[i - 1] + (val * product); 
      
    # Print sequence 
    for i in range(N): 
        print(a[i], end = " "); 
          
# Driver Code 
  
# Value of N 
N = 10; 
  
# Calling function 
digit_product_Sum(N); 
  
# This Code is contributed 
# by mits. 

