

# Python implementation of the approach  
MAX = 32
  
# Function to return the count  
# of set bits in n  
def countSetBits(n) : 
    count = 0;  
    while (n):  
        n &= (n - 1);  
        count += 1;  
  
    return count;  
  
# Function to return the count  
# of required pairs  
def pairs(arr, n, k): 
  
    # To store the count  
    count = 0;  
  
    # Frequency array  
    f = [0 for i in range(MAX + 1)] 
  
    for i in range(n):  
        f[countSetBits(arr[i])] += 1;  
  
    for i in range(MAX + 1): 
        for j in range(1, MAX + 1): 
  
            # If current pair satisfies  
            # the given condition  
            if (i + j == k):  
  
                # (arr[i], arr[i]) cannot be a valid pair  
                if (i == j): 
                    count += ((f[i] * (f[i] - 1)) / 2);  
                else: 
                    count += (f[i] * f[j]);  
      
    return count;  
  
# Driver code  
arr = [ 1, 2, 3, 4, 5 ] 
n = len(arr) 
k = 4
  
print (pairs(arr, n, k))  
  
# This code is contributed by CrazyPro 

