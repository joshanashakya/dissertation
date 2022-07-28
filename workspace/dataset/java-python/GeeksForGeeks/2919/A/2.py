

# Python3 program to find Nth term  
# of the series 4, 2, 2, 3, 6, ...  
  
# Function to find Nth term  
def nthTerm(N) :  
  
    nth = 0; first_term = 4;  
  
    pi = 1; po = 1;  
    n = N;  
    while (n > 1) : 
        pi *= n - 1;  
        n -= 1;  
        po *= 2;  
  
    # Nth term  
    nth = (first_term * pi) // po;  
  
    return nth;  
  
# Driver code  
if __name__ == "__main__" :  
    N = 5;  
    print(nthTerm(N)) ;  
  
# This code is contributed by AnkitRai01 

