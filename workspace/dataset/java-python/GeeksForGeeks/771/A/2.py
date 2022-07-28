

# Python3 program to count the 
# number of numbers between  
# 1 and 1000, including both,  
# that are divisible by 3 or 4 
   
# function to count the divisors 
def countDivisors(N, a, b): 
       
    # Counts of numbers  
    # divisible by a and b  
    count1 = N // a  
    count2 = N // b  
       
    # inclusion-exclusion  
    # principle applied 
    count3 = (N // (a * b)) 
       
    return count1 + count2 - count3 
   
# Driver Code 
N = 1000
a = 3
b = 4
print(countDivisors(N, a, b)) 
   
# This code is contributed by shubhamsingh10 

