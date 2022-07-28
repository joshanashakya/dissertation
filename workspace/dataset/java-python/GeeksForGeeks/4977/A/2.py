

# Python implementation of the approach 
  
m, n = 6, 4; 
  
# Function to find a row in the 
# given matrix using linear search 
def linearCheck(ar, arr): 
    for i in range(m): 
  
        # Assume that the current row matched 
        # with the given array 
        matched = True; 
  
        for j in range(n): 
  
            # If any element of the current row doesn't 
            # match with the corresponding element 
            # of the given array 
            if (ar[i][j] != arr[j]): 
  
                # Set matched to false and break; 
                matched = False; 
                break; 
        # If matched then return the row number 
        if (matched): 
            return i + 1; 
    # No row matched with the given array 
    return -1; 
  
# Driver code  
if __name__ == "__main__" :  
  
    mat = [  
        [ 0, 0, 1, 0 ],  
        [ 10, 9, 22, 23 ],  
        [ 40, 40, 40, 40 ],  
        [ 43, 44, 55, 68 ],  
        [ 81, 73, 100, 132 ],  
        [ 100, 75, 125, 133 ] 
        ];  
          
    row = [ 10, 9, 22, 23 ]; 
      
    print(linearCheck(mat, row));  
      
# This code is contributed by Princi Singh 

