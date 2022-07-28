

# Python 3 program to count of multiples 
# in an Array before every element 
from collections import defaultdict 
import math 
   
# Function to find all factors of N 
# and keep their count in map 
def add_factors(n, mp): 
  
    # Traverse from 1 to sqrt(N) 
    # if i divides N, 
    # increment i and N/i in map 
    for i in range(1, int(math.sqrt(n)) + 1,): 
        if (n % i == 0): 
            if (n // i == i): 
                mp[i] += 1 
            else : 
                mp[i] += 1 
                mp[n // i] += 1 
   
# Function to count of multiples 
# in an Array before every element 
def count_divisors(a, n): 
   
    # To store factors all of all numbers 
    mp = defaultdict(int) 
   
    # Traverse for all possible i's 
    for i in range(n) : 
        # Printing value of a[i] in map 
        print(mp[a[i]], end=" ") 
   
        # Now updating the factors 
        # of a[i] in the map 
        add_factors(a[i], mp) 
   
# Driver code 
if __name__ == "__main__": 
      
    arr = [ 8, 1, 28, 4, 2, 6, 7 ] 
    n = len(arr) 
   
    # Function call 
    count_divisors(arr, n) 
   
# This code is contributed by chitranayal 

