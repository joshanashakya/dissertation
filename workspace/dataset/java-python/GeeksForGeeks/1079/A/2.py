

# Python3 implmentation to find the 
# Kth number in the list formed 
# from product of any two numbers 
# in the array and sorting them 
  
# Function to find number of pairs 
def check(x, pos, neg, k): 
    pairs = 0
  
    p = len(neg) - 1
    nn = len(neg) - 1
    pp = len(pos) - 1
  
    # Negative and Negative 
    for i in range(len(neg)): 
        while (p >= 0 and neg[i] * neg[p] <= x): 
            p -= 1
  
        # Add Possible Pairs 
        pairs += min(nn - p, nn - i) 
  
    # Positive and Positive 
    p = 0
    for i in range(len(pos) - 1, -1, -1): 
        while (p < len(pos) and pos[i] * pos[p] <= x): 
            p += 1
  
        # Add Possible pairs 
        pairs += min(p, i) 
  
    # Negative and Positive 
    p = len(pos) - 1
    for i in range(len(neg) - 1, -1, -1): 
        while (p >= 0 and neg[i] * pos[p] <= x): 
            p -= 1
  
        # Add Possible pairs 
        pairs += pp - p 
  
    return (pairs >= k) 
  
# Function to find the kth 
# element in the list 
def kth_element(a, n, k): 
    pos, neg = [],[] 
  
    # Seperate Postive and 
    # Negative elements 
    for i in range(n): 
        if (a[i] >= 0): 
            pos.append(a[i]) 
        else: 
            neg.append(a[i]) 
  
    # Sort the Elements 
    pos = sorted(pos) 
    neg = sorted(neg) 
  
    l = -10**18
    ans = 0
    r = 10**18
  
    # Binary search 
    while (l <= r): 
        mid = (l + r) >> 1
        if (check(mid, pos, neg, k)): 
            ans = mid 
            r = mid - 1
        else: 
            l = mid + 1
  
    # Return the required answer 
    return ans 
  
# Driver code 
a = [-4, -2, 3, 3] 
k = 3
  
n = len(a) 
  
# Function call 
print(kth_element(a, n, k)) 
  
# This code is contributed by mohit kumar 29 

