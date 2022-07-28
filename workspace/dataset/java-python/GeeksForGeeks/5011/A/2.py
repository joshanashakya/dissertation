

# Python program to find sum of 
# harmonic series using recursion 
  
def sum(n): 
  
    # Base condition 
    if n < 2: 
        return 1
  
    else: 
        return 1 / n + (sum(n - 1)) 
          
print(sum(8)) 
print(sum(10)) 

