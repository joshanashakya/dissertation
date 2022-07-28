

# Python3 program to find sum of 
# bitwise ors of all subarrays. 
def totalSum(a, n): 
    sum = 0; 
    for i in range(n): 
        sum1 = 0; 
          
        # perform Bitwise OR operation 
        # on all the subarray present 
        # in array 
        for j in range(i, n): 
              
            # OR operation 
            sum1 = (sum1 | a[j]); 
              
            # now add the sum after 
            # performing the 
            # Bitwise OR operation 
            sum = sum + sum1; 
    return sum; 
  
# Driver code 
a = [1, 2, 3, 4, 5]; 
n = len(a); 
print(totalSum(a, n)); 
  
# This code is contributed by mits 

