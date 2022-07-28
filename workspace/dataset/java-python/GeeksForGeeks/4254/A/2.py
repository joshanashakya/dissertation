

# Python3 program to check whether the 
# Rows of Binary Matrix become unique 
# After Deleting a column. 
  
# Function to check whether rows of 
# Binary matrix become unique after 
# Deleting a column of from matrix. 
def uniqueRows(s, m, n): 
      
    # Initialize variable count that 
    # stores the count of duplicate rows. 
    i, j, count = 0, 0, 0
  
    # Take two nested loop and 
    # check weather rows already 
    # get seen then increment 
    # count by 1 then break the loop. 
    for i in range(n): 
        for j in range(i): 
            if (s[i] == s[j]): 
                count += 1
                break
  
    # Check if count>=1 then prNo 
    # Else prYes. 
    if (count >= 1): 
        print("No" ) 
    else: 
        print("Yes") 
  
# Driver code. 
m = 3
n = 3
s = [[ 1, 0, 1 ], 
     [ 0, 0, 0 ], 
     [ 1, 0, 0 ]] 
  
uniqueRows(s, m, n) 
  
# This code is contributed by Mohit Kumar 

