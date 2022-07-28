

# Python program prfirst M  
# terms of N-bonacci series. 
  
# Function to print bonacci series 
def bonacciseries(n, m) : 
  
    # Assuming m >= n. 
    a = [0] * m 
    a[n - 1] = 1
  
    # Computing every term as  
    # sum of previous n terms. 
    for i in range(n, m) : 
        for j in range(i - n, i) : 
            a[i] = a[i] + a[j] 
  
    for i in range(0, m) : 
        print (a[i], end = " ") 
  
# Driver Code 
N = 5
M = 15
bonacciseries(N, M) 
  
# This code is contributed  
# by Manish Shaw(manishshaw1) 

