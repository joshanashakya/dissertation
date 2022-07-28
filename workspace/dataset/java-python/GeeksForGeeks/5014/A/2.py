

# Python program to find  
# N-th term of the series:  
# 9, 23, 45, 75, 113...  
def nthTerm(N):  
      
    # calculate Nth term of series 
    return ((2 * N + 3) * 
            (2 * N + 3) - 2 * N); 
  
# Driver Code  
  
# Get the value of N  
n = 4
  
# Find the Nth term  
# and print it  
print(nthTerm(n))  
  
# This code is contributed by Bilal 

