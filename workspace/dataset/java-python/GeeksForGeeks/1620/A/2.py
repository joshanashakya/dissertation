

# Python3 implementation of the approach  
  
# Function to print the required matrix  
def printMatrix(n, m) :  
  
    # Impossible to generate  
    # the required matrix  
    if (n < 5 or m < 5) :  
        print(-1,end = " ");  
        return;  
      
  
    # Store all the vowels  
    s = "aeiou";  
    s = list(s); 
  
    # Print the matrix  
    for i in range(n) : 
          
        # Print vowels for every index  
        for j in range(m) : 
            print(s[j % 5],end= " ");  
      
        print()  
        c = s[0];  
  
        # Shift the vowels by one  
        for i in range(4) : 
            s[i] = s[i + 1];  
          
        s[4] = c;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 5; m = 5;  
  
    printMatrix(n, m);  
  
# This code is contributed by AnkitRai01 

