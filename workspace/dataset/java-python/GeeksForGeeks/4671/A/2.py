

# Python3 program to find maximum number  
# of lines which can pass through a  
# single point 
import sys 
# function to find maximum lines  
# which passes through a single point 
def maxLines(n, x1, y1, x2, y2): 
  
    s = []; 
  
    slope=sys.maxsize; 
    for i in range(n): 
        if (x1[i] == x2[i]): 
            slope = sys.maxsize; 
        else: 
            slope = (y2[i] - y1[i]) * 1.0 /(x2[i] - x1[i]) * 1.0; 
  
        s.append(slope); 
  
    return len(s); 
  
# Driver Code 
n = 2; 
x1 = [ 1, 2 ]; 
y1 = [1, 2]; 
x2 = [2, 4]; 
y2 = [2, 10]; 
print(maxLines(n, x1, y1, x2, y2)); 
  
# This code is contributed by mits 

