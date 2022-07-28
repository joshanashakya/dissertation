

# Python3 implementation of the approach  
MAX = 1000000000;  
  
# Function to find the traingle  
# with area = (S / 2)  
def findTriangle(S) :  
  
    # Fix the two pairs of coordinates  
    X1 = 0; Y1 = 0;  
    X2 = MAX; Y2 = 1;  
  
    # Find (X3, Y3) with integer coordinates  
    X3 = (MAX - S % MAX) % MAX;  
    Y3 = (S + X3) / MAX;  
  
    print("(", X1, ",", Y1, ")");  
    print("(", X2, ",", Y2, ")");  
    print("(", X3, ",", Y3, ")");  
  
# Driver code  
if __name__ == "__main__" :  
  
    S = 4;  
  
    findTriangle(S);  
  
# This code is contributed by kanugargng 

