

# Python3 program to find the converging element 
# of the diagonals in a square matrix 
  
# Driver code 
n = 5
a = [[ 1, 2, 3, 4, 5 ], 
     [ 5, 6, 7, 8, 6 ], 
     [ 9, 5, 6, 8, 7 ], 
     [ 2, 3, 5, 6, 8 ], 
     [ 1, 2, 3, 4, 5 ]] 
  
# If n is even, then convergence 
# element will be null. 
if (n % 2 == 0): 
    print("NULL") 
else : 
      
    # finding the mid 
    mid = n // 2
  
    # finding the converging element 
    convergingele = a[mid][mid] 
  
    print(convergingele) 
  
# This code is contributed by Mohit Kumar 

