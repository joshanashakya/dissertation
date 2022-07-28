

# Python3 program to find n-th  
# number with sum of digits as 10.  
def findNth(n):  
    count = 0; 
      
    curr = 19; 
  
    while (True):  
  
        # Find sum of digits in 
        # current no.  
        sum = 0; 
        x = curr; 
        while (x > 0): 
            sum = sum + x % 10; 
            x = int(x / 10); 
  
        # If sum is 10, we increment 
        # count  
        if (sum == 10):  
            count+= 1;  
  
        # If count becomes n, we return  
        # current number.  
        if (count == n):  
            return curr; 
          
        curr += 9; 
  
    return -1;  
  
# Driver Code 
print(findNth(5));  
  
# This code is contributed  
# by mits 

