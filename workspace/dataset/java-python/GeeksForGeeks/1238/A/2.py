

# Python3 program to find 
# maximum area rectangle 
from math import ceil, floor 
  
# Function to find max area 
def maxArea(perimeter): 
    length = int(ceil(perimeter / 4)) 
    breadth = int(floor(perimeter / 4)) 
  
    # return area 
    return length * breadth 
  
# Driver code 
if __name__ == '__main__': 
    n = 38
    print("Maximum Area =", maxArea(n)) 

