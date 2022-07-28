

# Python implementation to  
# print solid 2D shapes 
import math 
  
# def to print a circle 
def circle(radius) : 
  
    for i in range(0, 2 * 
                   radius + 1) : 
      
        for j in range(0, 2 * 
                       radius + 1) : 
          
            distance = math.sqrt((i - radius) *
                                 (i - radius) +
                                 (j - radius) *
                                 (j - radius)) 
  
            if (distance > radius - 0.5 and
                distance < radius + 0.5) : 
                print ("*", end = "") 
              
            else : 
                print (" ", end = "")  
          
        print () 
  
# def to print a  
# square or a rectangle 
def rectangle(l, b) : 
  
    for i in range(1, l + 1) : 
      
        for j in range(1, b + 1) : 
            if (i == 1 or i == l or
                j == 1 or j == b) : 
                print ("*", end = "") 
              
            else : 
                print (" ", end = "") 
        print () 
      
# def to print triangle 
def triangle(side) : 
  
    for i in range(1, side + 1) : 
      
        for j in range(i, side) : 
            print (" ", end = "") 
  
        for j in range(1, 2 * i) : 
          
            if (i == side or j == 1 or
                j == (2 * i - 1)) : 
                print ("*", end = "") 
          
            else : 
                print (" ", end = "") 
          
        print () 
  
# def to print hexagon 
def hexagon(length) : 
  
    k = length 
    l = 2 * length - 1
    for i in range(1, length) : 
      
        for j in range(0, 3 * length) : 
            if (j >= k and j <= l) : 
                print ("*", end = "") 
              
            else : 
                print (" ", end = "") 
        print () 
        k = k - 1
        l = l + 1
      
    k = 1
    l = 3 * length - 2
    for i in range(0, length) : 
  
        for j in range(0, 3 * length) : 
            if (j >= k and j <= l) : 
                print ("*", end = "") 
            else : 
                print (" ", end = "") 
        print () 
        k = k + 1
        l = l - 1
  
# def takes user choice 
def printPattern(choice) : 
      
    # For Circle 
    if(choice == 1) : 
        circle(4) 
      
    # For rectangle/square 
    elif(choice == 2) : 
        rectangle(3, 8) 
      
    # For triangle  
    elif(choice == 3) : 
        triangle(6) 
      
    # For hexagon 
    elif(choice == 4) : 
        hexagon(4) 
  
# Driver Code 
choice = 3
printPattern(choice) 
  
# This code is contributed by 
# Manish Shaw(manishshaw1) 

