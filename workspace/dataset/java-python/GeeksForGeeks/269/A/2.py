

# A Simple Method to count cubes between a and b 
  
def printCubes(a, b) : 
    # Traverse through all numbers in given range 
    # and one by one check if number is prime 
    for i in range(a, b + 1) : 
          
        # Check if current number 'i' 
        # is perfect cube 
        j = 1
        for j in range(j ** 3, i + 1 ) : 
              
            if (j ** 3 == i) : 
                print( j ** 3, end = " ") 
                break
              
  
# Driver code 
  
a = 1; b = 100
print("Perfect cubes in given range: ") 
printCubes(a, b) 
  
  
# This code is contributed by Nikita Tiwari. 

