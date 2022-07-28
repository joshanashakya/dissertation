

# Python 3 program to find the ratio  
# of the distance between the centers  
# of the circles and the point of intersection  
# of two direct common tangents to the circles 
# which do not touch each other 
  
# Function to find the GCD 
from math import gcd 
  
# Function to find the ratio 
def ratiotang(r1, r2): 
    print("The ratio is", int(r1 / gcd(r1, r2)), ":",  
                          int(r2 / gcd(r1, r2))) 
  
# Driver code 
if __name__ == '__main__': 
    r1 = 4
    r2 = 6
    ratiotang(r1, r2) 
  
# This code is contributed by 
# Surendra_Gangwar 

