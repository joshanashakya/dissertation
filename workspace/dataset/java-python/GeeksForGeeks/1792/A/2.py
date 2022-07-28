

# Python program to find sum in Nth group 
  
# calculate sum of Nth group 
def nth_group(n): 
    return n * (2 * pow(n, 2) + 1) 
  
# Driver code 
N = 5
print(nth_group(N)) 

