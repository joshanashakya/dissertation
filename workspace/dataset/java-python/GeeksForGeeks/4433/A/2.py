

# Python3 program to find the number of  
# steps required to reach (x, y) from  
# (0, 0) following a zig-zag path  
    
# Function to return the required position  
def countSteps(x, y):  
   
    if x < y: 
        return x + y + 2 * ((y - x) // 2)  
       
    else: 
        return x + y + 2 * (((x - y) + 1) // 2)  
  
# Driver Code  
if __name__ == "__main__":  
   
    x, y = 4, 3 
    print(countSteps(x, y))  
    
# This code is contributed by Rituraj Jain 

