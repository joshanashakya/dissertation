

# Python3 code to Find the integer points (x, y)  
# with Manhattan distance atleast N  
  
# function to find all possible point  
def FindPoints(n) : 
  
    v = [];  
  
    # Find all 4 corners of the square  
    # whose side length is n  
    v.append([ 0, 0 ]);  
    v.append([ 0, n ]);  
    v.append([ n, 0 ]);  
    v.append([ n, n ]);  
  
    # If n is even then the middle point  
    # of the square will be an integer,  
    # so we will take that point  
    if (n % 2 == 0) : 
        v.append([ n // 2, n // 2 ]);  
  
    return v;  
  
# Driver Code  
if __name__ == "__main__" :  
  
    N = 8;  
  
    v = FindPoints(N);  
  
    # Printing all possible points  
    for element in v : 
        print("(", element[0],  
              ",", element[1], ")", end = " ");  
  
# This code is contributed by AnkitRai01 

