

# Python3 program to find m-th summation  
  
# Function to return mth summation 
def SUM(n, m): 
  
    # base case 
    if (m == 1): 
        return (n * (n + 1) / 2) 
          
    sum = SUM(n, m-1) 
    return int(sum * (sum + 1) / 2) 
  
  
# driver program 
n = 5
m = 3
print("SUM(", n, ", ", m, "):", SUM(n, m)) 
  
# This code is contributed by Smitha Dinesh Semwal 

