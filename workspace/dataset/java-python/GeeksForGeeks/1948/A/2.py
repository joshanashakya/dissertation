

# Python3 implementation of the approach  
maxN = 10
  
# To store factorial values  
fact = [0]*maxN;  
  
# Function to return ncr  
def ncr(n, r) :  
  
    return (fact[n] // fact[r]) // fact[n - r];  
  
# Function to return the required sum  
def findSum(arr, n) :  
  
    # Intialising factorial  
    fact[0] = 1;  
    for i in range(1, n) :  
        fact[i] = i * fact[i - 1];  
  
    # Multiplier  
    mul = 0;  
  
    # Finding the value of multipler  
    # according to the formula  
    for i in range(n) : 
        mul += (2 ** i) * ncr(n - 1, i);  
  
    # To store the final answer  
    ans = 0;  
  
    # Calculate the final answer  
    for i in range(n) : 
        ans += mul * arr[i];  
  
    return ans;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 1 ];  
    n = len(arr);  
  
    print(findSum(arr, n));  
  
# This code is contributed by AnkitRai01 

