

# Python program to count number  
# of Co-prime pairs from 1 to N  
# with product equals to N  
  
# import everything from math lib 
from math import *
  
# Function to count number of  
# Co-prime pairs from 1 to N 
# with product equals to N  
def countCoprimePairs(n) : 
  
    count = 0
  
    print("The co-prime pairs are: ") 
  
    # find all the co- prime pairs  
    # Traverse from 2 to sqrt(N) and  
    # check if i, N//i are coprimes  
    for i in range(2, int(sqrt(n)) + 1) : 
  
        # check if N is divisible by i,  
        # so that the other term in pair  
        # i.e. N/i is integral  
        if n % i == 0 : 
  
            # Check if i and N/i are coprime  
            if gcd(i, n // i) == 1 : 
  
                # Display the co- prime pairs  
                print("(", i,",", (n // i),")") 
                count += 1
  
    print("Number of coprime pairs : ", count) 
                  
# Driver code      
if __name__ == "__main__" : 
  
    N = 120
  
    countCoprimePairs(N) 
  
# This code is contributed by ANKITRAI1 

