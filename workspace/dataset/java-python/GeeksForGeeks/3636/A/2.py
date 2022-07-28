

# Python3 program find the distance 
# between two parallel lines 
  
# Function to find the distance  
# between parallel lines  
def dist(m, b1, b2): 
    d = abs(b2 - b1) / ((m * m) - 1); 
    return d; 
  
# Driver Code 
def main(): 
    m, b1, b2 =2,4, 3; 
    print(dist(m, b1, b2)); 
if __name__ == '__main__': 
    main() 
  
# This code contributed by PrinciRaj1992 

