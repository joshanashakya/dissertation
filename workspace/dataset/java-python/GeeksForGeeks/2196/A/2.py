

# Python program to find the largest 
# and smallest N-digit numbers 
# in Octal Number System 
  
# Function to return the largest 
# N-digit number in Octal 
# Number System 
def findLargest(N): 
  
    # Append '7' N times 
    largest = strings(N, '7'); 
    return largest; 
  
# Function to return the smallest 
# N-digit number in Octal 
# Number System 
def findSmallest(N): 
  
    # Append '0' (N - 1) times to 1 
    smallest = "1" + strings((N - 1), '0'); 
    return smallest; 
  
def strings(N, c): 
    temp = ""; 
    for i in range(N): 
        temp += c; 
    return temp; 
  
# Function to prthe largest and 
# smallest N-digit Octal number 
def printLargestSmallest(N): 
    print("Largest: ",findLargest(N)); 
    print("Smallest: ",findSmallest(N)); 
  
# Driver code 
if __name__ == '__main__': 
    N = 4; 
  
    # Function Call 
    printLargestSmallest(N); 
  
# This code is contributed by sapnasingh4991 

