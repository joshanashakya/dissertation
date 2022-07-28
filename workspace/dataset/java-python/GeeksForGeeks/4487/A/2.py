

# Python3 program to find number  
# of ways in which n boys and n  
# girls can sit alternatively  
# sound a round table. 
  
# Get n  
n = 5
  
# find fac1 = (n-1)!  
fac1 = 1
for i in range(2, n): 
    fac1 = fac1 * i 
  
# Find fac2 = n!  
fac2 = fac1 * n 
  
# Find total number of ways 
totalWays = fac1 * fac2 
  
# Print the total number of ways  
print(totalWays) 
  
# This code is contributed  
# by sahilshelangia 

