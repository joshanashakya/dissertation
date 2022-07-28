

# Python3 program to find  
# sum of first n terms 
def calculateSum(n): 
    # First term of AP 
    a1 = 1; 
      
    # First term of GP 
    a2 = 2; 
      
    # common ratio of GP 
    r = 2; 
      
    # common difference Of AP 
    d = 1; 
    return ((n) * (2 * a1 + (n - 1) * d) / 
                   2 + a2 * (pow(r, n) - 1) / 
                  (r - 1)); 
  
# Driver Code 
  
# no. of the terms  
# for the sum 
n = 5; 
  
# Find the Sn 
print ("Sum =", int(calculateSum(n))) 
  
# This code is contributed  
# by Surendra_Gangwar 

