

# Python 3 program to determine the quadrant 
# of a complex number 
  
# Function to determine the quadrant 
# of a complex number 
def quadrant(s): 
    l = len(s) 
    # Storing the index of '+' 
    if ('+' in s): 
        i = s.index('+') 
  
    # Storing the index of '-' 
    else: 
        i = s.index('-') 
  
    # Finding the real part 
    # of the complex number 
    real = s[0:i] 
  
    # Finding the imaginary part 
    # of the complex number 
    imaginary = s[i + 1:l - 1] 
  
    x = int(real) 
    y = int(imaginary) 
  
    if (x > 0 and y > 0): 
        print("Quadrant 1") 
  
    elif(x < 0 and y > 0): 
        print("Quadrant 2") 
  
    elif (x < 0 and y < 0): 
        print("Quadrant 3") 
  
    elif (x > 0 and y < 0): 
        print("Quadrant 4") 
  
    elif (x == 0 and y > 0): 
        print("Lies on positive","Imaginary axis") 
  
    elif (x == 0 and y < 0): 
        print("Lies on negative","Imaginary axis") 
  
    elif (y == 0 and x < 0): 
        print("Lies on negative","X-axis") 
  
    elif (y == 0 and x > 0): 
        print("Lies on positive","X-axis") 
  
    else: 
        print("Lies on the Origin") 
  
# Driver code 
if __name__ == '__main__': 
    s = "5+3i"
    quadrant(s) 
      
# This code is contributed by Surendra_Gangwar 

