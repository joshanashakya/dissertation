

# Python3 program to find maximum/minimum  
# number of isolated vertices.  
  
# Function to find out the minimum and  
# maximum number of isolated vertices  
def find(n, m) : 
  
    # Condition to find out minimum  
    # number of isolated vertices  
    if (n <= 2 * m): 
        print("Minimum ", 0)  
    else: 
        print("Minimum ", n - 2 * m )  
  
    # To find out maximum number of  
    # isolated vertices  
    # Loop to find out value of number  
    # of vertices that are connected  
    for i in range(1, n + 1):  
        if (i * (i - 1) // 2 >= m):  
            break
      
    print("Maximum ", n - i) 
      
# Driver Code 
if __name__ == '__main__': 
      
    # Number of vertices  
    n = 4
  
    # Number of edges  
    m = 2
  
    # Calling the function to maximum and  
    # minimum number of isolated vertices  
    find(n, m) 
  
# This code is contributed by  
# SHUBHAMSINGH10 

