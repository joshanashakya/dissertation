

# Python3 program to find maximum  
# number moves possible  
N = 1000005
  
# To store number of prime  
# factors of each number  
primeFactors = [0] * N;  
  
# Function to find number of prime  
# factors of each number  
def findPrimeFactors() : 
      
    for i in range(2, N) :  
          
        # if i is a prime number  
        if (primeFactors[i] == 0) : 
            for j in range(i, N, i) : 
                  
                # increase value by one from  
                # it's preveious multiple  
                primeFactors[j] = primeFactors[j // i] + 1;  
  
    # make prefix sum this will be  
    # helpful for multiple test cases  
    for i in range(1, N) : 
        primeFactors[i] += primeFactors[i - 1];  
  
# Driver Code  
if __name__ == "__main__" : 
      
    # Generate primeFactors array  
    findPrimeFactors();  
  
    a = 6; b = 3;  
  
    # required answer  
    print(primeFactors[a] - primeFactors[b]);  
  
# This code is contributed by Ryuga 

