

# Python3 implementation of the approach  
  
m = 6;  
n = 4;  
  
# Function that compares both the arrays  
# and returns -1, 0 and 1 accordingly  
def compareRow(a1, a2) :  
  
    for i in range(n) : 
  
        # Return 1 if mid row is less than arr[]  
        if (a1[i] < a2[i]) : 
            return 1;  
  
        # Return 1 if mid row is greater than arr[]  
        elif (a1[i] > a2[i]) : 
            return -1;  
      
    # Both the arrays are equal  
    return 0;  
  
  
# Function to find a row in the  
# given matrix using binary search  
def binaryCheck(ar, arr) :  
  
    l = 0; r = m - 1;  
      
    while (l <= r) : 
          
        mid = (l + r) // 2;  
        temp = compareRow(ar[mid], arr);  
  
        # If current row is equal to the given  
        # array then return the row number  
        if (temp == 0) : 
            return mid + 1;  
  
        # If arr[] is greater, ignore left half  
        elif (temp == 1) : 
            l = mid + 1;  
  
        # If arr[] is smaller, ignore right half  
        else : 
            r = mid - 1;  
  
    # No valid row found  
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
      
    print(binaryCheck(mat, row));  
  
# This code is contributed by AnkitRai01 

