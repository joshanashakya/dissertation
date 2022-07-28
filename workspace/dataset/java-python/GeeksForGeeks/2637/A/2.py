

# python program to find out'Nth' term of this sequence  
  
# Function to generate a fixed number 
def nthTerm(N): 
    nth = 0
    nth = (N * N * (N + 1))//2
    return nth 
  
# Driver code 
N = 5
print(nthTerm(N)) 
  
# This code is contributed by Shrikant13 

