

# Python3 program to find sum 
# of first n odd numbers 
  
def oddSum(n) : 
    sum = 0
    curr = 1
    i = 0
    while i < n: 
        sum = sum + curr 
        curr = curr + 2
        i = i + 1
    return sum
  
# Driver Code 
n = 20
print (" Sum of first" , n, "Odd Numbers is: ", 
                                oddSum(n) )  
  
# This code is contributed by rishabh_jain 

