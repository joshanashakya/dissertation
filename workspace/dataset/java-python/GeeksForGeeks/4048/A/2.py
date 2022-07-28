

# Python3 implementation 
  
# Counts the number of triplets 
# for a given value of b 
def getCount(A, B2, C): 
      
    count = 0
      
    # Count all triples in which a = i 
    i=1
    while(i<A): 
          
        # Smallest value j 
        # such that i*j > B2 
        j = (B2 // i) + 1
        # Count all (i, B2, x) 
        # such that x >= j 
        if (C >= j): 
            count = count + C - j + 1
              
        # count all (x, B2, y) such 
        # that x >= j this counts 
        # all such triples in 
        # which a >= j 
        if (A>= j and C >= i): 
            count = count+ (C - i + 1)    * (A - j + 1) 
              
        # As all triples with a >= j 
        # have been counted reduce 
        # A to j - 1. 
        if (A >= j): 
            A = j - 1
        i+=1
      
    return count 
  
  
# Counts the number of triples that 
# satisfy the given constraints 
def countTriplets(A, B, C): 
      
    ans = 0
    for i in range(1,B+1): 
        # GetCount of triples in which b = i 
        ans = (ans+ getCount(A, i * i, C)) 
      
    return ans 
  
  
# Driver Code 
  
A = 3
B = 2
C = 2
  
# Function calling 
print(countTriplets(A, B, C)) 
  
# This code is contributed by shubhamsingh10 

