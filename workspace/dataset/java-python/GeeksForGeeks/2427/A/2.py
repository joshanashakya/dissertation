

# Python 3 program to find sum of numbers from 
# 1 to N which are divisible by X or Y 
from math import ceil, floor 
  
# Function to calculate the sum 
# of numbers divisible by X or Y 
def sum(N, X, Y): 
    S1 = floor(floor(N / X) * floor(2 * X + 
               floor(N / X - 1) * X) / 2) 
    S2 = floor(floor(N / Y)) * floor(2 * Y + 
               floor(N / Y - 1) * Y) / 2
    S3 = floor(floor(N / (X * Y))) * floor (2 * (X * Y) + 
               floor(N / (X * Y) - 1) * (X * Y))/ 2
  
    return S1 + S2 - S3 
  
# Driver code 
if __name__ == '__main__': 
    N = 14
    X = 3
    Y = 5
  
    print(int(sum(N, X, Y))) 
  
# This code is contributed by  
# Surendra_Gangwar 

