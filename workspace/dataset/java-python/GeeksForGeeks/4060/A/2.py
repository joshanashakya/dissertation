

# Function to return sum  
def sum(k, n): 
    sum = (pow(k, n + 1) - 
           pow(k - 1, n + 1));  
  
    return sum;  
  
# Driver code  
n = 3;  
K = 3;  
print(sum(K, n));  
  
# This code is contributed by mits 

