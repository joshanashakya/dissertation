

# Python3 code to calculate the  
# number of equilateral triangles 
  
# fucntion to calculate number 
# of traingles in Nth step 
def numberOfTriangles (n) : 
    ans = 2 * (pow(3, n)) - 1; 
    return ans; 
  
# Driver code 
n = 2
print (numberOfTriangles(n)) 
  
# This code is contributed by "rishabh_jain". 

