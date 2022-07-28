

# Python program to check whether the given 
# number N is the perfect cube or not 
  
# Function to check if a number is 
# a perfect Cube using inbuilt function 
def perfectCube(N) : 
  
    cube_root = round(N**(1/3)); 
  
    # If cube of cube_root is equals to N, 
    # then print Yes Else print No 
    if cube_root * cube_root * cube_root == N : 
        print("Yes"); 
        return; 
  
    else : 
        print("NO"); 
        return; 
  
# Driver's code 
if __name__ == "__main__" : 
    N = 125; 
  
    # Function call to check 
    # N is cube or not 
    perfectCube(N); 
  
# This code is contributed by AnkitRai01 

