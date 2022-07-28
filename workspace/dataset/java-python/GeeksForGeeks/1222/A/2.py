

# Python 3 program to find surface area 
# and volume of the Pentagonal Prism 
  
# function for surface area 
def surfaceArea(a, b, h): 
    return 5 * a * b + 5 * b * h 
  
# function for VOlume 
def volume(b, h): 
    return (5 * b * h) / 2
  
# Driver Code 
if __name__ == '__main__': 
    a = 5
    b = 3
    h = 7
  
    print("surface area =", surfaceArea(a, b, h), 
                   ",", "volume =", volume(b, h)) 
  
# This code is contributed by 
# Sanjit_Prasad 

