

# Python3 implementation to make an  
# array decreasing  
  
# Function to find the  
# minimum steps required  
def minSteps(arr,  N) :  
  
    s = [];  
      
    s.append(( 0, -1 ));  
      
    # Minimum steps  
    maxStepsToeliminate = -1;  
      
    # Loop to iterate  
    # over the array  
    for i in range(1, N) : 
      
        stepsToeliminate = 1;  
          
        # Traversing the stack until  
        # it is not empty  
        while (len(s) != 0) :  
  
            # Condition if the top of the  
            # stack is greater than the  
            # current element  
            if (arr[s[-1][0]] >= arr[i]) : 
                stepsToeliminate = max(stepsToeliminate, s[-1][1] + 1); 
                s.pop();  
          
            else : 
              
                break;  
      
        # Condition if no previous  
        # elements value less than  
        # this element then steps is -1  
        if (len(s) == 0) :  
          
            stepsToeliminate = -1;  
      
      
        maxStepsToeliminate = max( maxStepsToeliminate, stepsToeliminate );  
          
        s.append(( i, stepsToeliminate ));  
      
    print(  0 if (maxStepsToeliminate < 0 ) else  maxStepsToeliminate );  
  
  
# Driver Code  
if __name__ == "__main__" :  
  
    arr = [3, 2, 1, 7, 5];  
      
    size = len(arr);  
      
    minSteps(arr, size);  
      
# This code is contributed by AnkitRai01 

