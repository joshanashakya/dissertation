

# Python3 program to check whether the given  
# number N is the perfect cube or not  
  
# Function to check if a number  
# is a perfect Cube or not  
def perfectCube(N) :  
  
    cube = 0;  
  
    # Iterate from 1-N  
    for i in range(N + 1) : 
  
        # Find the cube of  
        # every number  
        cube = i * i * i;  
  
        # Check if cube equals  
        # N or not  
        if (cube == N) :  
            print("Yes");  
            return;  
      
        elif (cube > N) : 
            print("NO");  
            return;  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 216;  
  
    # Function call  
    perfectCube(N);  
  
# This code is contributed  by Yash_R 

