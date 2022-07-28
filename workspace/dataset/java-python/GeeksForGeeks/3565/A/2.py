

# Python 3 program to find the  
# minimum numbers required to get to S 
  
# Function to find the minimum 
# numbers required to get to S 
def minimumNumbers(n, s): 
  
    if (s % n): 
        return s / n + 1; 
    else: 
        return s / n; 
  
# Driver Code 
n = 5; 
s = 11; 
print(int(minimumNumbers(n, s))); 
  
# This code is contributed  
# by Shivi_Aggarwal 

