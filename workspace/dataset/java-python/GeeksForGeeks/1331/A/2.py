

# Python3 program to represent a number as a 
# sum of maximum possible number of 
# Prime Numbers 
  
  
# Function to represent a number as a 
# sum of the maximum possible number 
# of Prime Numbers 
def printAsMaximalPrimeSum( n): 
   
    # If n is odd, print one 3 
    if ( n % 2 == 1):   
        print("3 ",end="")  
        n -= 3 
       
  
    # Now n is even, print 2 n/2 times 
    while ( n>0):   
        print("2 ",end="") 
        n -= 2 
       
   
      
# Driver Code 
  
n = 5 
printAsMaximalPrimeSum( n)  
  
# This code is contributed by ihritik 

