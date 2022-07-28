

# Python3 implementation of the approach  
from math import sqrt 
  
# Function to find the required triplets  
def findTriplets(x) :  
  
    # To store the factors  
    fact = [];  
    factors = set();  
  
    # Find factors in sqrt(x) time  
    for i in range(2, int(sqrt(x))) : 
        if (x % i == 0) : 
            fact.append(i);  
              
            if (x / i != i) : 
                fact.append(x // i);  
                  
            factors.add(i);  
            factors.add(x // i);  
  
    found = False;  
    k = len(fact);  
      
    for i in range(k) : 
  
        # Choose a factor  
        a = fact[i];  
          
        for j in range(k) : 
  
            # Choose another factor  
            b = fact[j];  
  
            # These conditions need to be  
            # met for a valid triplet  
            if ((a != b) and (x % (a * b) == 0)  
                and (x / (a * b) != a)  
                and (x / (a * b) != b)  
                and (x / (a * b) != 1)) : 
  
                # Print the valid triplet  
                print(a,b,x // (a * b));  
                found = True;  
                break;  
      
        # Triplet found  
        if (found) : 
            break;  
  
    # Triplet not found  
    if (not found) :  
        print("-1");  
  
# Driver code  
if __name__ == "__main__" :  
  
    x = 105;  
  
    findTriplets(x);  
  
# This code is contributed by AnkitRai01 

