

# Python3 program to calculate the sum  
# of upper and lower triangle 
  
# function to calculate sum 
def Sum(mat, r, c): 
  
    i, j = 0, 0; 
    upper_sum = 0; 
    lower_sum = 0; 
      
    # to calculate sum of upper triangle 
    for i in range(r): 
        for j in range(c): 
            if (i <= j): 
                upper_sum += mat[i][j]; 
  
    print("Upper sum is ", upper_sum); 
      
    # to calculate sum of lower 
    for i in range(r): 
        for j in range(c): 
            if (j <= i): 
                lower_sum += mat[i][j]; 
  
    print("Lower sum is ", lower_sum); 
  
# Driver Code 
r = 3; 
c = 3; 
  
# giving the matrix 
mat = [[ 6, 5, 4 ], 
       [ 1, 2, 5 ], 
       [ 7, 9, 7 ]]; 
  
# calling the function 
Sum(mat, r, c); 
  
# This code is contributed by 29AjayKumar 

