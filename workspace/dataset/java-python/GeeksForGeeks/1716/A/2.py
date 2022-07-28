

# python3 program to check 
# pentagonal numbers. 
import math  
  
# Function to determine if 
# N is pentagonal or not. 
def isPentagonal( N ) : 
  
    i = 1
    while True: 
  
        # Substitute values of i 
        # in the formula. 
        M = (3 * i * i - i) / 2
        i += 1
      
        if ( M >= N ): 
            break
      
    return (M == N) 
      
# Driver method 
N = 12
if (isPentagonal(N)): 
    print(N , end = ' ') 
    print ("is pentagonal " )  
else: 
    print (N , end = ' ') 
    print ("is not pentagonal") 
  
# This code is contributed by Gitanjali. 

