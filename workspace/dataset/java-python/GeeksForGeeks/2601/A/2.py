

# Python3 implementation of the approach  
  
# Function to return the value of nCr  
def nCr(n, r) :  
  
    # Initialize the answer  
    ans = 1;  
  
    for i in range(1, r + 1) : 
  
        # Divide simultaneously by  
        # i to avoid overflow  
        ans *= (n - r + i);  
        ans //= i;  
  
    return ans;  
  
# Function to return the count of ways  
def total_ways(N, X) :  
  
    return (nCr(N - 1, X - 1) + nCr(N - 1, X));  
  
# Driver code  
if __name__ == "__main__" : 
  
    N = 5; X = 3;  
  
    print(total_ways(N, X));  
  
# This code is contributed by AnkitRai01 

