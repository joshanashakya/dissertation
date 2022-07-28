

# Python3 implementation of the above approach 
  
# Function to find out the number of 
# candies every person received 
def candies(n, k): 
  
    # Count number of complete turns 
    count = 0; 
  
    # Get the last term 
    ind = 1; 
  
    # Stores the number of candies 
    arr = [0] * k; 
  
    low = 0; 
    high = n; 
  
    # Do a binary search to find the  
    # number whose sum is less than N. 
    while (low <= high): 
  
        # Get mide 
        mid = (low + high) >> 1; 
        sum = (mid * (mid + 1)) >> 1; 
  
        # If sum is below N 
        if (sum <= n):  
  
            # Find number of complete turns 
            count = int(mid / k); 
  
            # Right halve 
            low = mid + 1; 
        else: 
  
            # Left halve 
            high = mid - 1; 
  
    # Last term of last complete series 
    last = (count * k); 
  
    # Subtract the sum till 
    n -= int((last * (last + 1)) / 2); 
  
    i = 0; 
  
    # First term of incomplete series 
    term = (count * k) + 1; 
  
    while (n): 
        if (term <= n): 
            arr[i] = term; 
            i += 1; 
            n -= term; 
            term += 1; 
        else: 
            arr[i] += n; 
            n = 0; 
  
    # Count the total candies 
    for i in range(k): 
        arr[i] += ((count * (i + 1)) + 
                int(k * (count * (count - 1)) / 2)); 
  
    # Print the total candies 
    for i in range(k): 
        print(arr[i], end = " "); 
  
# Driver Code 
n = 7; 
k = 4; 
candies(n, k); 
  
# This code is contributed by chandan_jnu 

