

# python3 program to Create an array 
# of size N consisting of distinct 
# elements where sum of odd elements 
# is equal to sum of even elements 
  
# Function to construct the required array 
def arrayConstruct(N): 
  
    # To construct first half, 
    # distinct even numbers 
    for i in range(2, N + 1, 2): 
        print(i,end=" ") 
  
    # To construct second half, 
    # distinct odd numbers 
    for i in range(1, N - 1, 2): 
        print(i, end=" ") 
  
    # Calculate the last number of second half 
    # so as to make both the halves equal 
    print(N - 1 + (N // 2)) 
  
# Function to construct the required array 
def createArray(N): 
  
    # check if size is multiple of 4 
    # then array exist 
    if (N % 4 == 0): 
  
        # function call to construct array 
        arrayConstruct(N) 
  
    else: 
        cout << -1 << endl 
  
# Driver code 
if __name__ == '__main__': 
  
    N = 8
  
    createArray(N) 
  
# This code is contributed by mohit kumar 29 

