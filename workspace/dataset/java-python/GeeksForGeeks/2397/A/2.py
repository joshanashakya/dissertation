

# Python3 implementation of the approach  
  
N = 2
M = 2
  
# Function to generate and  
# print the required matrix  
def Matrix(a) :  
    ch = '1';  
  
    for i in range(N) : 
        for j in range(M) : 
  
            # Replace the '.'  
            if (a[i][j] == '.') : 
                a[i][j] = ch;  
  
            # Toggle number  
            if (ch == '1') : 
                ch == '0'
            else : 
                ch = '1'
  
            print(a[i][j],end = " ");  
              
        print()  
  
        # For each row, change  
        # the starting number  
        if (i % 2 == 0) : 
            ch = '0';  
        else : 
            ch = '1';  
  
# Driver code  
if __name__ == "__main__" :  
  
    a = [ 
            [ '.', '_' ],  
            [ '_', '.' ], 
        ] 
  
    Matrix(a);  
      
# This code is contributed by AnkitRai01 

