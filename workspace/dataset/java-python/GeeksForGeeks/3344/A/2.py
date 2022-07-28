

# Python 3 program to find out the maximum  
# product in the matrix which four elements  
# are adjacent to each other in one direction 
n = 5
  
# function to find max product 
def FindMaxProduct(arr, n): 
  
    max = 0
  
    # iterate the rows. 
    for i in range(n):  
  
        # iterate the columns. 
        for j in range( n):  
  
            # check the maximum product  
            # in horizontal row. 
            if ((j - 3) >= 0): 
                result = (arr[i][j] * arr[i][j - 1] * 
                          arr[i][j - 2] * arr[i][j - 3]) 
                  
                if (max < result): 
                    max = result 
  
            # check the maximum product  
            # in vertical row. 
            if ((i - 3) >= 0) : 
                result = (arr[i][j] * arr[i - 1][j] *
                          arr[i - 2][j] * arr[i - 3][j]) 
                  
                if (max < result): 
                    max = result 
  
            # check the maximum product in 
            # diagonal going through down - right  
            if ((i - 3) >= 0 and (j - 3) >= 0): 
                result = (arr[i][j] * arr[i - 1][j - 1] *
                          arr[i - 2][j - 2] * arr[i - 3][j - 3]) 
                  
                if (max < result): 
                    max = result 
  
            # check the maximum product in 
            # diagonal going through up - right 
            if ((i - 3) >= 0 and (j - 1) <= 0): 
                result = (arr[i][j] * arr[i - 1][j + 1] *
                          arr[i - 2][j + 2] * arr[i - 3][j + 3]) 
  
                if (max < result): 
                    max = result 
  
    return max
  
# Driver code 
if __name__ == "__main__": 
      
  
    # int arr[][4] = {{6, 2, 3, 4},  
    #                  {5, 4, 3, 1}, 
    #                  {7, 4, 5, 6}, 
    #                  {8, 3, 1, 0}}; 
    # int arr[][5] = {{1, 2, 1, 3, 4}, 
    #                  {5, 6, 3, 9, 2}, 
    #                  {7, 8, 8, 1, 2}, 
    #                  {1, 0, 7, 9, 3}, 
    #                  {3, 0, 8, 4, 9}}; 
                          
    arr = [[1, 2, 3, 4, 5], 
           [6, 7, 8, 9, 1], 
           [2, 3, 4, 5, 6], 
           [7, 8, 9, 1, 0], 
            [9, 6, 4, 2, 3]] 
  
    print(FindMaxProduct(arr, n)) 
  
# This code is contributed by ita_c 

