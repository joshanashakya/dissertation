

# Python 3 program to find the number of indices pair 
# such that pair sum from first Array 
# is greater than second Array 
import bisect  
  
# Function to get the number of pairs of indices 
# {i, j} in the given two arrays A and B such that 
# A[i] + A[j] > B[i] + B[j] 
def getPairs(A,  B, n): 
  
    # Intitializing the difference array D 
    D = [0]*(n) 
   
    # Computing the difference between the 
    # elements at every index and storing 
    # it in the array D 
    for i in range(n): 
        D[i] = A[i] - B[i] 
   
    # Sort the array D 
    D.sort() 
   
    # Variable to store the total 
    # number of pairs that satisfy 
    # the given condition 
    total = 0
   
    # Loop to iterate through the difference 
    # array D and find the total number 
    # of pairs of indices that follow the 
    # given condition 
    for i in range(n - 1, -1, -1): 
   
        # If the value at the index i is positive, 
        # then it remains positive for any pairs 
        # with j such that j > i. 
        if (D[i] > 0): 
            total += n - i - 1
   
        # If the value at that index is negative 
        # then we need to find the index of the 
        # value just greater than -D[i] 
        else: 
            k = bisect.bisect_right(D, -D[i], 0, len(D)) 
            total += n - k 
    return total 
   
# Driver code 
if __name__ == "__main__": 
      
    n = 5
    A = [] 
    B = [] 
   
    A.append(4); 
    A.append(8); 
    A.append(2); 
    A.append(6); 
    A.append(2); 
   
    B.append(4); 
    B.append(5); 
    B.append(4); 
    B.append(1); 
    B.append(3); 
   
    print(getPairs(A, B, n)) 
  
# This code is contributed by chitranayal 

