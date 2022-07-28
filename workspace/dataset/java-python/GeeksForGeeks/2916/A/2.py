

# Python3 program to find the Nth term  
# in series 12, 35, 81, 173, 357, ...  
  
# Function to find Nth term  
def nthTerm(N) : 
  
    nth = 0; first_term = 12;  
  
    # Nth term  
    nth = (first_term * (pow(2, N - 1))) + \ 
            11 * ((pow(2, N - 1)) - 1);  
  
    return nth;  
  
# Driver Method  
if __name__ == "__main__" :  
  
    N = 5;  
    print(nthTerm(N)) ;  
  
# This code is contributed by AnkitRai01 

