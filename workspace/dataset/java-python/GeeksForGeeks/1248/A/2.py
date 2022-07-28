

# Python3 program to find the largest  
# and smallest N-digit numbers  
# in Hexa-Decimal Number System  
  
# Function to return the largest  
# N-digit number in Hexa-Decimal  
# Number System  
def findLargest(N) :  
  
    # Append 'F' N times  
    largest = 'F'*N 
  
    return largest;  
  
# Function to return the smallest  
# N-digit number in Hexa-Decimal  
# Number System  
def findSmallest(N) :  
  
    # Append '0' (N - 1) times to 1  
    smallest = '1' + '0'*(N - 1) 
  
    return smallest;  
  
# Function to print the largest and smallest  
# N-digit Hexa-Decimal number  
def printAns(largest) : 
  
    print("Largest: " , findLargest(largest));  
    print("Smallest: " , findSmallest(largest));  
  
# Driver code  
if __name__ == "__main__" :  
  
    N = 4;  
    printAns(N);  
  
# This code is contributed by AnkitRai01 

