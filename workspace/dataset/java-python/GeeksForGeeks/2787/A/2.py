

# Python3 program to find the N-th number whose 
# digital root is X 
import sys 
  
# Function to find the digital root of 
# a number 
def findDigitalRoot(num): 
    sum = sys.maxsize; 
    tempNum = num; 
  
    while (sum >= 10): 
        sum = 0; 
  
        while (tempNum > 0): 
            sum += tempNum % 10; 
            tempNum //= 10; 
  
        tempNum = sum; 
  
    return sum; 
  
# Function to find the Nth number with 
# digital root as X 
def findAnswer(X, N): 
      
    # Counter variable to keep the 
    # count of valid numbers 
    counter = 0; 
    i = 0; 
    while (counter < N): 
        i += 1; 
          
        # Find digital root 
        digitalRoot = findDigitalRoot(i); 
          
        # Check if is required answer or not 
        if (digitalRoot == X): 
            counter += 1; 
          
        # Print the answer if you have found it 
        # and breakout of the loop 
        if (counter == N): 
            print(i); 
            break; 
  
# Driver Code 
if __name__ == '__main__': 
    X = 1; 
    N = 3; 
  
    findAnswer(X, N); 
  
# This code is contributed by 29AjayKumar 

