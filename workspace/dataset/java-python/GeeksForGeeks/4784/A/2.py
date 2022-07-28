

# Program to find average of odd  
# numbers till a given odd number. 
  
# Function to calculate the  
# average of odd numbers 
def averageOdd(n) : 
    if (n % 2 == 0) : 
        print("Invalid Input") 
        return -1
      
      
    return (n + 1) // 2
      
# driver function 
n = 15
print(averageOdd(n)) 
  
  
  
# This code is contributed by Nikita tiwari. 

