

# Python3 code to find the minimum  
# number of mails 
import math 
  
# Function returns the min no of  
# mails required 
def MinimumMail(n, k, x): 
      
    # Using the formula derived above 
    m = ((n - 1) + int(math.ceil((n - 1) * 1.0 / x) * 
         (n - 1) + math.ceil(n * 1.0 / x) * (k - n))); 
  
    return m; 
  
# Driver Code 
  
# no of questions 
N = 4; 
  
# no of students 
K = 9; 
  
# maximum no of questions  
# a mail can hold 
X = 2; 
  
# Calling function 
print(MinimumMail(N, K, X)); 
  
# This code is contributed by mits 

