

# Python3 Program to check if 
# the nth is odd or even in a 
# sequence where each term is  
# sum of previous two term 
MAX = 100; 
  
# Return if the nth  
# term is even or odd. 
def findNature(a, b, n): 
    seq = [0] * MAX; 
    seq[0] = a; 
    seq[1] = b; 
  
    for i in range(2, n + 1): 
        seq[i] = seq[i - 1] + seq[i - 2]; 
  
    # Return true if odd 
    return (seq[n] & 1); 
  
# Driver Code 
a = 2; 
b = 4; 
n = 3; 
  
if(findNature(a, b, n)): 
    print("Odd"); 
else: 
    print("Even"); 
  
# This code is contributed by mits 

