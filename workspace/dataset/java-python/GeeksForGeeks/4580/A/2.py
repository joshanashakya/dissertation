

# Python3 implementation of the approach 
  
import sys 
  
R = 4 
C = 4 
  
# Function to find the index of first 1  
# in the binary array arr[]  
def first(arr, low, high) :  
  
    if (high >= low) : 
  
        # Get the middle index  
        mid = low + (high - low) // 2;  
  
        # Check if the element at middle index is first 1  
        if ((mid == 0 or arr[mid - 1] == 0) and arr[mid] == 1) : 
            return mid;  
  
        # If the element is 0, recur for right side  
        elif (arr[mid] == 0) : 
            return first(arr, (mid + 1), high);  
  
        # If element is not first 1, recur for left side  
        else : 
            return first(arr, low, (mid - 1));  
      
    return -1;  
  
  
# Function to print rows with maximum  
# and minimum number of zeroes  
def rowWith0s(mat) :  
  
    # Initialize max values  
    row_index = 0; max = -(sys.maxsize - 1);  
  
    # Initialize min values  
    min_row_index = 0; min = sys.maxsize;  
  
    # Traverse for each row and count number of 0s  
    # by finding the index of first 1  
      
    for i in range(R) : 
          
        index = first(mat[i], 0, C - 1);  
  
        cntZeroes = 0;  
  
        # If index = -1, that is there is no 1  
        # in the row, count of zeroes will be C  
        if (index == -1) : 
            cntZeroes = C;  
  
        # Else, count of zeroes will be index  
        # of first 1  
        else : 
            cntZeroes = index;  
  
        # Find max row index  
        if (max < cntZeroes) : 
            max = cntZeroes;  
            max_row_index = i;  
          
        # Find min row index  
        if (min > cntZeroes) : 
            min = cntZeroes;  
            min_row_index = i;  
  
    print("Row with min 0s:",min_row_index + 1);  
    print("Row with max 0s:", max_row_index + 1);  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    mat = [ 
            [ 0, 0, 0, 1 ],  
            [ 0, 1, 1, 1 ],  
            [ 1, 1, 1, 1 ],  
            [ 0, 0, 0, 0 ] 
        ];  
  
    rowWith0s(mat);  
  
    # This code is contributed by AnkitRai01 

