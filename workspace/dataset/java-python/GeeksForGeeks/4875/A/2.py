

# Python3 program to find minimum 
# elements to be removed so that 
# array becomes zig-zag. 
  
def minimumDeletions(a, n): 
  
    if (n <= 2): 
        return 0
  
    # If number of element is  
    # greater than 2. 
    count = 0
    for i in range(n - 2): 
      
        # If three element are  
        # consecutively increasing 
        # or decreasing. 
        if ((a[i] < a[i + 1] and
             a[i + 1] < a[i + 2]) or
            (a[i] > a[i + 1] and
             a[i + 1] > a[i + 2])): 
            count += 1
              
    return count 
  
# Driver Code 
a = [ 5, 2, 3, 6, 1 ] 
n = len(a) 
print(minimumDeletions(a, n)) 
  
# This code is contributed  
# by Anant Agarwal. 

