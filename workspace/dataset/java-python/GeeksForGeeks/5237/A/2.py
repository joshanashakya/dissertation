

# Python 3 Program to calculate  
# area and perimeter of a rhombus 
# using diagonals 
from math import sqrt, pow
  
# calculate area and perimeter 
# of a rhombus 
def rhombusAreaPeri(d1, d2): 
    area = (d1 * d2) / 2
    perimeter = 2 * sqrt(pow(d1, 2) + 
                         pow(d2, 2)) 
  
    print("The area of rhombus with diagonals",  
                d1, "and", d2, "is", area, ".") 
  
    print("The perimeter of rhombus with diagonals", 
                d1, "and", d2, "is", perimeter, "." ) 
  
# Driver code 
if __name__ == '__main__': 
    d1 = 2
    d2 = 4
    rhombusAreaPeri(d1, d2) 
  
# This code is contributed  
# by Surendra_Gangwar 

