

# Python3 program to find Nth term  
# of the series 2, 3, 10, 15, 26....  
  
# Function to find Nth term  
def nthTerm(N) :  
    nth = 0;  
  
    # Nth term  
    if (N % 2 == 1) : 
        nth = (N * N) + 1;  
    else : 
        nth = (N * N) - 1;  
  
    return nth;  
  
# Driver Method  
if __name__ == "__main__" :  
    N = 5;  
    print(nthTerm(N)) ;  
  
# This code is contributed by AnkitRai01 

