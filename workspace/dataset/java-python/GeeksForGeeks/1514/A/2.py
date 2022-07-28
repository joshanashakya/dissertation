

# Python3 program for the Optimal Solution  
  
# Function to calculate the maximum points  
# earned by making an optimal selection on  
# the given array  
def findOptimalSolution(a, N) : 
          
    # Sorting the array  
    a.sort()   
      
    # Variable to store the total points earned  
    points = 0 
    
    for i in range(0, N): 
        points += a[i] * i  
       
    return points  
    
      
if __name__ == "__main__": 
      
    a = [1, 4, 2, 3, 9]  
    N = len(a)  
    print(findOptimalSolution(a, N))  

