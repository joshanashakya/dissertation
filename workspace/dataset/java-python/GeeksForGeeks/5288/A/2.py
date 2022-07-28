

# Python3 program to find the sum of series  
# Function to return required sum  
  
def sum(x,y,n): 
      
    # sum of first series  
    sum1 = ((x**2)*(x**(2*n)-1))//(x**2 - 1) 
      
    # sum of second series 
    sum2 = (x*y*(x**n*y**n-1))//(x*y-1) 
    return (sum1+sum2) 
      
# Driver Code  
if __name__=='__main__': 
    x = 2
    y = 2
    n = 2
# function call to print sum  
    print(sum(x, y, n)) 
      
# this code is contributed by sahilshelangia 

