

# Python3 implementation to find distinct  
# elements common to all rows of a matrix 
MAX = 100
  
# function to individually sort 
# each row in increasing order 
def sortRows(mat, n): 
  
    for i in range(0, n): 
        mat[i].sort(); 
  
# function to find all the common elements 
def findAndPrintCommonElements(mat, n): 
  
    # sort rows individually 
    sortRows(mat, n) 
  
    # current column index of each row is  
    # stored from where the element is being  
    # searched in that row 
      
    curr_index = [0] * n 
    for i in range (0, n): 
        curr_index[i] = 0
          
    f = 0
  
    while(curr_index[0] < n): 
      
        # value present at the current  
        # column index of 1st row 
        value = mat[0][curr_index[0]] 
  
        present = True
  
        # 'value' is being searched in  
        # all the subsequent rows 
        for i in range (1, n): 
          
            # iterate through all the elements  
            # of the row from its current column  
            # index till an element greater than  
            # the 'value' is found or the end of  
            # the row is encountered 
            while (curr_index[i] < n and
                   mat[i][curr_index[i]] <= value): 
                curr_index[i] = curr_index[i] + 1
                  
            # if the element was not present at  
            # the column before to the 'curr_index'  
            # of the row 
            if (mat[i][curr_index[i] - 1] != value): 
                present = False
  
            # if all elements of the row have 
            # been traversed) 
            if (curr_index[i] == n): 
              
                f = 1
                break
              
        # if the 'value' is common to all the rows 
        if (present): 
            print(value, end = " ") 
  
        # if any row have been completely traversed 
        # then no more common elements can be found 
        if (f == 1): 
            break
      
        curr_index[0] = curr_index[0] + 1
  
# Driver Code 
mat = [[12, 1, 14, 3, 16], 
       [14, 2, 1, 3, 35], 
       [14, 1, 14, 3, 11], 
       [14, 25, 3, 2, 1], 
       [1, 18, 3, 21, 14]] 
  
n = 5
findAndPrintCommonElements(mat, n) 
  
# This code is contributed by iAyushRaj 

