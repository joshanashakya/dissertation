

# Python3 implementation of the approach  
  
# Function to return the count  
# of possible triplets  
def countTriplets(n, points) : 
      
    pts = []  
    ct = 0;  
  
    # Insert all the points in a set  
    for i in range(n) : 
        pts.append(points[i]);  
  
    for i in range(n) : 
        for j in range(i + 1, n) :  
            x = points[i][0] + points[j][0];  
            y = points[i][1] + points[j][1];  
  
            # If the mid point exists in the set  
            if (x % 2 == 0 and y % 2 == 0) : 
                if [x // 2, y // 2] in pts : 
                    ct += 1
                      
    # Return the count of valid triplets  
    return ct  
  
# Driver code  
if __name__ == "__main__" : 
      
    points = [[ 1, 1 ], [ 2, 2 ], [ 3, 3 ]] 
    n = len(points)  
    print(countTriplets(n, points)) 
  
# This code is contributed by Ryuga 

