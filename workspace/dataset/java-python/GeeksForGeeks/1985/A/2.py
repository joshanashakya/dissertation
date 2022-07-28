

# Python code to Print first k  
# digits of 1/n where n is a  
# positive integer 
import math 
  
# Function to print first k digits 
# after dot in value of 1/n. n is 
# assumed to be a positive integer. 
def Print(n, k): 
    rem = 1 # Initialize remainder 
      
    # Run a loop k times to print 
    # k digits 
    for i in range(0, k): 
        # The next digit can always 
        # be obtained as doing  
        # (10*rem)/10 
        print(math.floor(((10 * rem) 
                       / n)), end="") 
          
        # Update remainder 
        rem = (10*rem) % n 
  
# Driver program to test 
# above function 
n = 7
k = 3
Print(n, k); 
print(" ") 
n = 21
k = 4
Print(n, k); 
  
# This code is contributed by Sam007. 

