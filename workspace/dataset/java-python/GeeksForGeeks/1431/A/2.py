

# Python3 program to print the sum  of  
# all numbers in range L and R 
  
# Function to return the sum of all natural numbers 
def sumNatural(n): 
  
    sum = (n*(n+1))//2
  
    return sum
  
# Function to return the sum 
# of all numbers in range L and R 
def suminRange(l, r): 
    return sumNatural(r) - sumNatural(l-1) 
  
#  Driver Code 
l =2; r= 5
print("Sum of Natural numbers from L to R is ",suminRange(l, r)) 
  
# This code is contributed by Shrikant13 

