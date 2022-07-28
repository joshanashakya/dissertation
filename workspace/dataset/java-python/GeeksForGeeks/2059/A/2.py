

# python3 program to count 
# total number of ways 
# to reach n-th stair with 
# all jumps alowed 
  
def calculateLeaps(n): 
    if (n == 0): 
        return 1; 
    return (1 << (n - 1)); 
  
# Driver code 
print(calculateLeaps(4)); 
  
# This code is contributed 
# by mits 

