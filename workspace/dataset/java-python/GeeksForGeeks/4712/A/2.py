

# Python3 program for finding determinant of generated matrix 
  
# Function to calculate determinant 
def calcDeterminant(arr,n): 
    determinant =0
  
    for i in range(n): 
        determinant+= pow(arr[i],3) 
  
    determinant -= 3*arr[0]*arr[1]*arr[2] 
  
    return determinant 
  
# Driver code 
arr = [4,5,3] 
n = len(arr) 
print(calcDeterminant(arr,n)) 
  
# This code is contributed by Shrikant13 

