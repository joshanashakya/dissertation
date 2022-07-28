

# Python3 program to find the smallest  
# twin in given range  
import math 
  
def printTwins(low, high):  
  
    # Create a boolean array "prime[0..high]"  
    # and initialize all entries it as true.  
    # A value in prime[i] will finally be  
    # false if i is Not a prime, else true.  
    prime = [True] * (high + 1); 
    twin = False;  
  
    prime[0] = prime[1] = False;  
  
    # Look for the smallest twin  
    for p in range(2, int(math.floor( 
                          math.sqrt(high)) + 2)): 
          
        # If p is not marked, then it 
        # is a prime  
        if (prime[p]):  
              
            # Update all multiples of p  
            for i in range(p * 2, high + 1, p):  
                prime[i] = False;  
  
    # Now print the smallest twin in range  
    for i in range(low, high + 1):  
        if (prime[i] and prime[i + 2]):  
            print("Smallest twins in given range: (",  
                               i, ",", (i + 2), ")");  
            twin = True; 
            break;  
      
    if (twin == False): 
        print("No such pair exists"); 
  
# Driver Code 
printTwins(10, 100);  
      
# This code is contributed  
# by chandan_jnu 

