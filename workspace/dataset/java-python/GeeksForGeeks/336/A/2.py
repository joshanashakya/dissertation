

# Python3 implementation of the approach  
mod = 1000000007 
arr = [[None for i in range(1001)] for j in range(1001)]  
  
# Function to store pascal triangle in 2-d array  
def Preprocess():  
   
    arr[0][0] = 1 
    for i in range(1, 1001):   
        arr[i][0] = 1 
        for j in range(1, i):   
            arr[i][j] = (arr[i - 1][j - 1] + arr[i - 1][j]) % mod  
           
        arr[i][i] = 1 
       
# Function to return a raised to the power n  
# with complexity O(log(n))  
def powmod(a, n):  
   
    if not n:  
        return 1 
    pt = powmod(a, n // 2)  
    pt = (pt * pt) % mod  
    if n % 2:  
        return (pt * a) % mod  
    else: 
        return pt  
  
# Function to return the number of sub-sets  
# whose median is also present in the set  
def CountSubset(val, n):  
   
    # Number of odd length sub-sets  
    ans = powmod(2, n - 1)  
  
    # Sort the array  
    val.sort()  
    for i in range(0, n):   
        j = i + 1 
  
        # Checking each element for leftmost middle  
        # element while they are equal  
        while j < n and val[j] == val[i]:   
  
            # Calculate the number of elements in  
            # right of rightmost middle element  
            r = n - 1 - j  
  
            # Calculate the number of elements in  
            # left of leftmost middle element  
            l = i  
  
            # Add selected even length  
            # subsets to the answer  
            ans = (ans + arr[l + r][l]) % mod  
            j += 1
  
    return ans  
   
# Driver code  
if __name__ == "__main__":  
   
    Preprocess()  
    val = [2, 3, 2] 
    n = len(val)  
    print(CountSubset(val, n)) 
  
# This code is contributed by Rituraj Jain 

