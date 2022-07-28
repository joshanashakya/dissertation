

# Python3 program to find the sum of n terms 
  
def calculateSum(n): 
    return ((2 * (n * (n + 1) / 2)**2) + 
           ((n * (n + 1) * (2 * n + 1)) / 6)) 
      
#Driver code 
  
n = 4
print("Sum =",calculateSum(n)) 
  
# this code is contributed by Shashank_Sharma 

