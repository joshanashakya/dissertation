

# Python3 implementation of the approach 
  
# Function to print the required permutation 
def printPermutation(n, k): 
  
    # Not possible 
    if (k >= n or (n % 2 == 0 and
                   k == 0)): 
        print(-1); 
        return; 
    per = [0] * (n + 1); 
  
    # Initial permutation 
    for i in range(1, n + 1): 
        per[i] = i; 
  
    # Indices for which gcd(p[i], i) > 1 
    # in the initial permutation 
    cnt = n - 1; 
    i = 2; 
    while (i < n):  
  
        # Reduce the count by 2 
        if (cnt - 1 > k): 
              
            t = per[i]; 
            per[i] = per[i + 1]; 
            per[i + 1] = t; 
              
            # swap(per[i], per[i + 1]); 
            cnt -= 2; 
  
        # Reduce the count by 1 
        elif (cnt - 1 == k): 
              
            # swap(per[1], per[i]); 
            t = per[1]; 
            per[1] = per[i]; 
            per[i] = t; 
            cnt -= 1; 
        else: 
            break; 
        i += 2; 
  
    # Print the permutation 
    for i in range(1, n + 1): 
        print(per[i], end = " "); 
  
# Driver code 
n = 4; 
k = 3; 
printPermutation(n, k); 
  
# This code is contributed by mits 

