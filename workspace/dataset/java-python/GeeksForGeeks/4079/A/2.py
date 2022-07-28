

# Python3 program to find two vertices of an  
# isosceles triangle in which there is  
# rectangle with opposite side (0, 0) and (x, y)  
  
# Function to find two vertices of an  
# isosceles triangle in which there is  
# rectangle with opposite side (0, 0) and (x, y)  
def Vertices(x, y) :  
  
    # Required value;  
    val = abs(x) + abs(y);  
  
    # print x1 and y1  
    if x < 0 : 
        x = -1
    else : 
        x = 1
          
    print(val * x,"0",end = " ");  
  
    # print x2 and y3  
    if y < 0 : 
        y = -1
    else : 
        y = 1
      
    print("0",val * y);  
  
  
# Driver code  
if __name__ == "__main__" : 
  
    x = 3; y = 3;  
  
    # Function call  
    Vertices(x, y);  
  
# This code is contributed by AnkitRai01 

