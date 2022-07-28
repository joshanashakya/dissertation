

# Python3 progarm to find the number  
# of lines which are formed from  
# given N points and not parallel  
# to X or Y axis  
  
# Function to find the number of lines  
# which are formed from given N points  
# and not parallel to X or Y axis  
def NotParallel(p, n) :  
  
    # This will store the number of points has  
    # same x or y coordinates using the map as  
    # the value of coordinate can be very large  
    x_axis  = {}; y_axis = {};  
  
    for i in range(n) : 
  
        # Counting frequency of each x and y  
        # coordinates  
        if p[i][0] not in x_axis : 
            x_axis[p[i][0]] = 0; 
              
        x_axis[p[i][0]] += 1;  
  
        if p[i][1] not in y_axis : 
            y_axis[p[i][1]] = 0; 
          
        y_axis[p[i][1]] += 1;  
  
    # Total number of pairs can be formed  
    total = (n * (n - 1)) // 2;  
  
    for i in x_axis : 
        c =  x_axis[i];  
  
        # We can not choose pairs from these as  
        # they have same x coordinatethus they  
        # will result line segment  
        # parallel to y axis  
        total -= (c * (c - 1)) // 2;  
  
    for i in y_axis :  
        c = y_axis[i];  
  
        # we can not choose pairs from these as  
        # they have same y coordinate thus they  
        # will result line segment  
        # parallel to x-axis  
        total -= (c * (c - 1)) // 2;  
      
    # Return the required answer  
    return total;  
  
  
# Driver Code  
if __name__ == "__main__" :  
  
    p = [ [ 1, 2 ],  
            [1, 5 ],  
            [1, 15 ],  
            [ 2, 10 ] ];  
  
    n = len(p);  
  
    # Function call  
    print(NotParallel(p, n));  
  
    # This code is contributed by AnkitRai01  

