

# Python3 implementation of the approach  
  
# Function to print the  
# required matrix  
def printMatrix(n, k) : 
  
    for i in range(n) : 
        for j in range(n) :  
  
            # Print k for the left  
            # diagonal elements  
            if (i == j) : 
                print(k, end = " ");  
  
            # Print 0 for the rest  
            else: 
                print("0", end = " ");  
                  
        print();  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 3; k = 7;  
  
    printMatrix(n, k);  
  
# This code is contributed by AnkitRai01 

