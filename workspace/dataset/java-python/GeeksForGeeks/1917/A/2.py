

# Python3 program to Decimal  
# to binary conversion using 
# bitwise operator 
  
# Size of an integer is   
# assumed to be 32 bits 
  
# Function that convert  
# Decimal to binary 
def decToBinary(n): 
      
    # Size of an integer is 
    # assumed to be 32 bits 
    for i in range(31, -1, -1):  
        k = n >> i; 
        if (k & 1): 
            print("1", end = ""); 
        else: 
            print("0", end = ""); 
  
# Driver Code 
n = 32; 
decToBinary(n); 
  
# This code is contributed by mits 

