

# Python 3 implementation of the approach 
n = 3
m = 3
  
# Function that returns true if matrix1 
# can be converted to matrix2 
# with the given operation 
def check(a, b): 
      
    # Traverse all the diagonals 
    # starting at first column 
    for i in range(n): 
        v1 = [] 
        v2 = [] 
        r = i 
        col = 0
  
        # Traverse in diagonal 
        while (r >= 0 and col < m): 
              
            # Store the diagonal elements 
            v1.append(a[r][col]) 
            v2.append(b[r][col]) 
  
            # Move up 
            r -= 1
            col += 1
  
        # Sort the elements 
        v1.sort(reverse = False) 
        v2.sort(reverse = False) 
  
        # Check if they are same 
        for i in range(len(v1)): 
            if (v1[i] != v2[i]): 
                return False
  
    # Traverse all the diagonals 
    # starting at last row 
    for j in range(1, m): 
        v1 = [] 
        v2 = [] 
        r = n - 1
        col = j 
  
        # Traverse in the diagonal 
        while (r >= 0 and col < m): 
              
            # Store diagonal elements 
            v1.append(a[r][col]) 
            v2.append(b[r][col]) 
            r -= 1
            col += 1
  
        # Sort all elements 
        v1.sort(reverse = False) 
        v2.sort(reverse = False) 
  
        # Check for same 
        for i in range(len(v1)): 
            if (v1[i] != v2[i]): 
                return False
                  
    # If every element matches 
    return True
  
# Driver code 
if __name__ == '__main__': 
    a = [[1, 2, 3], [4, 5, 6], [7, 8, 9]] 
    b = [[1, 4, 7], [2, 5, 6], [3, 8, 9]] 
  
    if (check(a, b)): 
        print("Yes") 
    else: 
        print("No") 
  
# This code is contributed by 
# Surendra_Gangwar 

