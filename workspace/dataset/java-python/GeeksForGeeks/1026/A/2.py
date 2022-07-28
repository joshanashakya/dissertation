

# Python3 implementation of the approach  
  
status = [0]*100000;  
  
# Function to return the required  
# number of steps  
def countSteps(val, n) : 
      
    sol = 0;  
    vec = [1, 0];  
    status[0] = -1;  
  
    # Compute the number of steps  
    for i in range(n) : 
  
        # Current status is to  
        # delete in first step  
        status[i] = 0;  
  
        # Pop the indices while  
        # condition is satisfied  
        while (len(vec) > 0
            and val[vec[len(vec)-1]] >= val[i]) :  
  
            # Inserting the correct  
            # step no to delete  
            status[i] = max(status[i],  
                            status[len(vec)-1] + 1);  
            vec.pop();  
          
        if (len(vec) == 0) : 
  
            # Status changed to not delete  
            status[i] = -1;  
          
  
        # Pushing a new index in the vector  
        vec.append(i);  
  
        # Build the solution from  
        # smaller to larger size  
        sol = max(sol, status[i] + 1);  
      
    return sol;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    val = [ 6, 5, 8, 4, 7, 10, 9 ];  
    n = len(val);  
  
    print(countSteps(val, n));  
      
# This code is contributed by AnkitRai01 

