

# Python 3 implementation of the 
# above approach  
  
# Function to check if it is possible  
def printPossible( a, b, c): 
  
    if ((a + b + c) % 2 != 0 or a + b < c): 
        print ("NO") 
    else: 
        print ("YES") 
  
# Driver code  
if __name__ == "__main__": 
  
    a = 2
    b = 4
    c = 2
    printPossible(a, b, c) 
  
# This code is contributed  
# by ChitraNayal 

