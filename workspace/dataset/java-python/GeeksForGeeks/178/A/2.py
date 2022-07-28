

# Python3 implementation to find the percentage 
# change in the area when the percentage change 
# in the length and breadth is given 
  
# Function to calculate percentage  
# change in area of rectangle 
def calculate_change(length, breadth): 
    change = 0
    change = length + breadth+((length * breadth)//100) 
    return change 
  
# Driver code 
if __name__ == "__main__": 
    cL = 20
    cB = -10
    cA = calculate_change(cL, cB) 
  
    print(cA) 
  
# This code is contributed by mohit kumar 29 

