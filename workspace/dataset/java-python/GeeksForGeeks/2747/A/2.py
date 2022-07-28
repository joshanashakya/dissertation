

# Python3 program to calculate the  
# value of pi up to n decimal places  
from math import acos 
  
# Function that prints the  
# value of pi upto N  
# decimal places  
def printValueOfPi(N) :  
  
    # Find value of pi upto  
    # using acos() function  
    pi = round(2 * acos(0.0), N);  
      
    # Print value of pi upto  
    # N decimal places  
    print(pi);  
  
# Driver Code  
if __name__ == "__main__" :  
  
    N = 4;  
  
    # Function that prints  
    # the value of pi  
    printValueOfPi(N);  
      
# This code is contributed by AnkitRai01 

