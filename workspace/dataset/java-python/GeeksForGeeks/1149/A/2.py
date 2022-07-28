

# Python3 program to check if it is possible to 
# choose a subarray that contains exactly 
# K even integers 
  
# Function to check if it is possible to 
# choose a subarray that contains exactly 
# K even integers 
def isPossible(A, n, k): 
      
    # Variable to store the count of 
    # even numbers 
    countOfTwo = 0
    for i in range(n): 
        if (A[i] % 2 == 0): 
            countOfTwo += 1
  
    # If we have to select 0 even numbers 
    # but there is all odd numbers in the array 
    if (k == 0 and countOfTwo == n): 
        print("NO\n") 
  
    # If the count of even numbers is greater than 
    # or equal to K then we can select a 
    # subarray with exactly K even integers 
    elif (countOfTwo >= k): 
        print("Yes\n") 
  
    # If the count of even numbers is less than K 
    # then we cannot select any subarray with 
    # exactly K even integers 
    else: 
        print("No\n") 
  
# Driver code 
if __name__ == '__main__': 
    arr=[1, 2, 4, 5] 
    K = 2
    N = len(arr) 
  
    isPossible(arr, N, K) 
  
# This code is contributed by mohit kumar 29 

