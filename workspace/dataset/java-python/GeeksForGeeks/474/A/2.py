

# Python 3 program to count 
# all those numbers in 
# given range whose count 
# of prime factors  
# is k 
  
def printKPFNums(A, B, K) : 
  
    # Count prime factors 
    # of all numbers 
    # till B. 
    prime = [ True]*(B+1) 
    p_factors= [ 0 ]*(B+1) 
    for p in range(2,B+1) : 
        if (p_factors[p] == 0)  : 
            for i in range(p,B+1,p) : 
                p_factors[i] = p_factors[i] + 1
   
    # Print all numbers with 
    # k prime factors 
    for i in range(A,B+1) : 
        if (p_factors[i] == K) : 
            print( i ,end=" ") 
  
  
# Driver code 
A = 14
B = 18
K = 2
printKPFNums(A, B, K) 
  
  
# This code is contributed 
# by Nikita Tiwari. 

