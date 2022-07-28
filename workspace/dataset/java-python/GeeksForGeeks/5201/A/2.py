

# Python3 implementation of the above approach.  
  
# Function to check if all  
# elements can be equal or not  
def checkEqualMatrix(arr, n, m, k) : 
  
    c = 0; cnt1 = 0; cnt2 = 0;  
  
    # Iterate over the matrix  
    for i in range(n) : 
        for j in range(m) : 
            if (c % 2 == 0) : 
                  
                # Update the counter for odd values  
                # if array element at that position is k  
                if (arr[i][j] == k) : 
                    cnt1 += 1;  
              
            else :  
  
                # Update the counter for even values  
                # if array element at that position is k  
                if (arr[i][j] == k) : 
                    cnt2 += 1;  
  
            c = c + 1;  
  
    # To check if there is at least one  
    # element at both even and odd indices.  
    if (cnt1 >= 1 and cnt2 >= 1) : 
        print("Yes");  
    else :  
        print("No");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [  
            [ 1, 8, 3 ],  
            [ 1, 2, 2 ],  
            [ 4, 1, 9 ]  
            ];  
              
    k = 2;  
      
    # Function calling  
    checkEqualMatrix(arr, 3, 3, k);  
  
# This code is contributed by AnkitRai01 

