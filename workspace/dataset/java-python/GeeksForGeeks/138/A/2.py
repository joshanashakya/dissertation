

# Python3 program to count pairs (i, j)  
# such that arr[i] * arr[j] = arr[i] + arr[j]  
  
# Function to return the count of pairs(i, j)  
# such that arr[i] * arr[j] = arr[i] + arr[j]  
def countPairs(arr, n):  
  
    countZero = 0;  
    countTwo = 0;  
  
    # Count number of 0's and 2's in the array  
    for i in range(n) :  
        if (arr[i] == 0) : 
            countZero += 1;  
  
        elif (arr[i] == 2) : 
            countTwo += 1; 
  
    # Total pairs due to occurence of 0's  
    pair0 = (countZero * (countZero - 1)) // 2;  
  
    # Total pairs due to occurence of 2's  
    pair2 = (countTwo * (countTwo - 1)) // 2;  
  
    # Return count of all pairs  
    return pair0 + pair2;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 2, 0, 3, 2, 0 ];  
    n = len(arr);  
  
    # Get and print count of pairs  
    print(countPairs(arr, n));  
  
# This code is contributed by AnkitRai01 

