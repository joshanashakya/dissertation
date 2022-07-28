

# Python3 code for better approach 
# to distribute candies 
import math as mt 
  
# Function to find out the number of 
# candies every person received 
def candies(n, k): 
  
    # Count number of complete turns 
    count = 0
  
    # Get the last term 
    ind = 1
  
    # Stores the number of candies 
    arr = [0 for i in range(k)] 
  
    while n > 0: 
  
        # Last term of last and 
        # current series 
        f1 = (ind - 1) * k 
        f2 = ind * k 
  
        # Sum of current and last series 
        sum1 = (f1 * (f1 + 1)) // 2
        sum2 = (f2 * (f2 + 1)) //2
  
        # Sum of current series only 
        res = sum2 - sum1 
  
        # If sum of current is less than N 
        if (res <= n): 
            count += 1
            n -= res 
            ind += 1
        else: # Individually distribute 
            i = 0
  
            # First term 
            term = ((ind - 1) * k) + 1
  
            # Distribute candies till there 
            while (n > 0): 
  
                # Candies available 
                if (term <= n): 
                    arr[i] = term 
                    i += 1
                    n -= term 
                    term += 1
                else: 
                    arr[i] = n 
                    i += 1
                    n = 0
  
    # Count the total candies 
    for i in range(k): 
        arr[i] += ((count * (i + 1)) + 
                   (k * (count * (count - 1)) // 2)) 
  
    # Print the total candies 
    for i in range(k): 
        print(arr[i], end = " ") 
  
# Driver Code 
n, k = 10, 3
candies(n, k) 
  
# This code is contributed by Mohit kumar 

