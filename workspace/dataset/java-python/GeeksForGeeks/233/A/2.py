

# Python3 program to find  
# x such that dx + igSum(x)  
# is equal to n. 
  
# utility function  
# for digit sum 
def digSum(n): 
    sum = 0; 
    rem = 0; 
    while(n): 
        rem = n % 10; 
        sum = sum + rem; 
        n = int(n / 10); 
    return sum; 
  
# function for finding x 
def findX(n): 
      
    # iterate from 1 to n. 
    # For every no. 
    # check if its digit 
    # sum with it is# equal to n. 
    for i in range(n + 1): 
        if (i + digSum(i) == n): 
            return i; 
      
    # if no such i 
    # found return -1 
    return -1; 
  
# Driver Code 
n = 43; 
print("x = ", findX(n)); 
  
# This code is contributed by mits 

