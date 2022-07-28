

# Python3 program to find sum of 
# difference between last and  
# first element of each subset 
  
# Returns the sum of first 
# elements of all subsets 
def SumF(S, n): 
  
    sum = 0
  
    # Compute the SumF as given 
    # in the above explanation 
    for i in range(n): 
        sum = sum + (S[i] * pow(2, n - i - 1)) 
    return sum
  
# Returns the sum of last 
# elements of all subsets 
def SumL(S, n): 
  
    sum = 0
  
    # Compute the SumL as given 
    # in the above explanation 
    for i in range(n): 
        sum = sum + (S[i] * pow(2, i)) 
    return sum
  
  
# Returns the difference between sum 
# of last elements of each subset and 
# the sum of first elements of each subset 
def sumSetDiff(S, n): 
  
    return SumL(S, n) - SumF(S, n) 
  
# Driver program 
n = 4
S = [5, 2, 9, 6] 
print(sumSetDiff(S, n)) 
  
# This code is contributed by Anant Agarwal. 

