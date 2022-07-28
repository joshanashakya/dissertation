

# Python3 Program to find the Product 
# of diagonal elements of a matrix 
  
# Function to find the product of diagonals 
def productDiagonals(arr, n): 
  
    product = 1; 
      
    # loop for calculating product of both 
    # the principal and secondary diagonals 
    for i in range(n): 
  
        # For principal diagonal index of row 
        # is equal to index of column 
        product = product * arr[i][i]; 
  
        # For secondary diagonal index 
        # of column is n-(index of row)-1 
        product = product * arr[i][n - i - 1]; 
      
    # Divide the answer by middle element for 
    # matrix of odd size 
    if (n % 2 == 1): 
        product = product // arr[n // 2][n // 2]; 
  
    return product; 
  
# Driver code 
if __name__ == '__main__': 
    arr1 = [[ 1, 2, 3, 4 ],[ 5, 6, 7, 8 ], 
            [ 9, 7, 4, 2 ],[ 2, 2, 2, 1 ]]; 
  
    # Function calling 
    print(productDiagonals(arr1, 4)); 
  
    arr2 = [[ 2, 1, 2, 1, 2 ],[ 1, 2, 1, 2, 1 ], 
            [ 2, 1, 2, 1, 2 ],[ 1, 2, 1, 2, 1 ], 
            [ 2, 1, 2, 1, 2 ]]; 
  
    # Function calling 
    print(productDiagonals(arr2, 5)); 
      
# This code is contributed by 29AjayKumar 

