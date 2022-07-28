

# Python program to find sum  
# of first n terms 
  
# Function to calculate the sum 
def calculateSum(n): 
    return (n * (n + 1) // 2 + 
        pow((n * (n + 1) // 2), 2)) 
  
# Driver code 
  
# number of terms to be 
# included in the sum 
n = 3
  
# find the Sum 
print("Sum = ", calculateSum(n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

