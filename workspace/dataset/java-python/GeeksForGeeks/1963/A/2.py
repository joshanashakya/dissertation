

# Python3 program to print all numbers upto  
# n bits with no consecutive set bits. 
  
def printNonConsecutive(n): 
  
    # Let us first compute   
    # 2 raised to power n. 
    p = (1 << n) 
  
    # loop 1 to n to check  
    # all the numbers 
    for i in range(1, p): 
  
        # A number i doesn't contain 
        # consecutive set bits if 
        # bitwise and of i and left 
        # shifted i do't contain a 
        # common set bit. 
        if ((i & (i << 1)) == 0): 
            print(i, end = " ") 
  
# Driver code 
n = 3
printNonConsecutive(n) 
  
# This code is contributed by Anant Agarwal. 

