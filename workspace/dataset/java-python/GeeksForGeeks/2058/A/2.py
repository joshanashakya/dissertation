

# Python program to count 
# total number of ways 
# to reach n-th stair with 
# all jumps alowed 
  
def calculateLeaps(n): 
    if n == 0 or n == 1: 
        return 1; 
    else: 
        leaps = 0; 
        for i in range(0,n): 
            leaps = leaps + calculateLeaps(i); 
        return leaps; 
  
# Driver code 
print(calculateLeaps(4)); 
  
# This code is contributed by mits 

