

# Python3 code to calculate the  
# number of equilateral triangles 
  
# fucntion to calculate number  
# of traingles in Nth step 
def numberOfTriangles (n) : 
    answer = [None] * (n + 1); 
    answer[0] = 1; 
    i = 1
    while i <= n:  
        answer[i] = answer[i - 1] * 3 + 2; 
        i = i + 1
      
    return answer[n]; 
  
# Driver code 
n = 2
print(numberOfTriangles(n)) 
  
# This code is contributed by "rishabh_jain". 

