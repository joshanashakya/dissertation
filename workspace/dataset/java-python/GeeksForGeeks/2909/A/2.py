

#  Python3 program to maximum value of 
# division of two numbers in an array 
  
# Function to maximum value of 
# division of two numbers in an array 
def Divison(a, n): 
  
    maxi = -10**9
    mini = 10**9
  
    # Traverse through the array 
    for i in a: 
        maxi = max(i, maxi) 
        mini = min(i, mini) 
  
    # Return the required answer 
    return maxi // mini 
  
# Driver code 
a = [3, 7, 9, 3, 11] 
  
n = len(a) 
  
print(Divison(a, n)) 
  
# This code is contributed by Mohit Kumar 

