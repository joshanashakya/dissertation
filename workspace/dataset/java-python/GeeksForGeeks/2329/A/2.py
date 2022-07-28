

# Python3 program to find the 
# number of ways Calculate  
# total ways to place 'x'  
# and 'y' at n places such  
# that no two 'x' are together 
  
# Function to return 
# number of ways  
def ways(n): 
      
    # for n=1 
    first = 2; 
  
    # for n=2 
    second = 3; 
    res = 0; 
  
    # iterate to find  
    # Fibonacci term 
    for i in range(3, n + 1): 
        res = first + second; 
        first = second; 
        second = res; 
  
    return res; 
      
# Driver Code  
  
# total number of places 
n = 7; 
print("Total ways are: " ,  
                 ways(n)); 
  
# This code is contributed by mits 

