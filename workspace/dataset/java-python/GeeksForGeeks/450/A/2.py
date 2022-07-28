

# Python 3 program to find count of all 
# majority elements in a Matrix 
N = 3 # Rows 
M = 3 # Columns 
  
# Function to find count of all 
# majority elements in a Matrix 
def majorityInMatrix(arr): 
      
    # we take length equal to max  
    # value in array 
    mp = {i:0 for i in range(7)} 
  
    # Store frequency of elements 
    # in matrix 
    for i in range(len(arr)): 
        for j in range(len(arr)): 
            mp[arr[i][j]] += 1
      
    # loop to iteratre through map  
    countMajority = 0
    for key, value in mp.items(): 
          
        # check if frequency is greater than 
        # or equal to (N*M)/2 
        if (value >= (int((N * M) / 2))): 
            countMajority += 1
      
    return countMajority 
  
# Driver Code 
if __name__ == '__main__': 
    mat = [[1, 2, 2], 
           [1, 3, 2], 
           [1, 2, 6]] 
    print(majorityInMatrix(mat)) 
  
# This code is contributed by 
# Shashank_Sharma 

