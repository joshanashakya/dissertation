

# Python 3 implementation of the approach 
mod = 1000000007
  
# Function to return  
# the factorial of a number 
def fact(n): 
    res = 1
    for i in range(2, n + 1): 
        res = res * i 
    return res 
  
# Function to return the value of nCr 
def nCr(n, r): 
    return int(fact(n) / (fact(r) * 
                          fact(n - r))) 
  
# Function to return 'a' raised to the power n 
# with complexity O(log(n)) 
def powmod(a, n): 
    if (n == 0): 
        return 1
    pt = powmod(a, int(n / 2)) 
    pt = (pt * pt) % mod 
    if (n % 2): 
        return (pt * a) % mod 
    else: 
        return pt 
  
# Function to return the number of sub-sets 
# whose median is also present in the set 
def CountSubset(arr, n): 
      
    # Number of odd length sub-sets 
    ans = powmod(2, n - 1) 
  
    # Sort the array 
    arr.sort(reverse = False) 
    for i in range(n): 
        j = i + 1
  
        # Checking each element for leftmost middle 
        # element while they are equal 
        while (j < n and arr[j] == arr[i]): 
              
            # Calculate the number of elements in 
            # right of rightmost middle element 
            r = n - 1 - j 
  
            # Calculate the number of elements in 
            # left of leftmost middle element 
            l = i 
  
            # Add selected even length subsets 
            # to the answer 
            ans = (ans + nCr(l + r, l)) % mod 
            j += 1
  
    return ans 
  
# Driver code 
if __name__ == '__main__': 
    arr = [2, 3, 2] 
    n = len(arr) 
    print(CountSubset(arr, n)) 
  
# This code is contributed by 
# Surendra_Gangwar 

