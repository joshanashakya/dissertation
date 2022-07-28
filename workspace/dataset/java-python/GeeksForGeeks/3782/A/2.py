

# Python 3 program to count the number of segments 
# in which all elements are greater than X 
  
# Function to count number of segments 
def countSegments(a, n, x): 
    flag = False
  
    count = 0
  
    # Iterate in the array 
    for i in range(n): 
          
        # check if array element greater  
        # then X or not 
        if (a[i] > x): 
            flag = True
          
        else: 
              
            # if flag is true 
            if (flag): 
                count += 1
  
            flag = False
      
    # After iteration complete 
    # check for the last segment 
    if (flag): 
        count += 1
  
    return count 
  
# Driver Code 
if __name__ == '__main__': 
    a = [8, 25, 10, 19, 19, 18, 20, 11, 18] 
    n = len(a) 
    x = 13
    print(countSegments(a, n, x)) 
  
# This code is contributed by 
# Sanjit_Prasad 

