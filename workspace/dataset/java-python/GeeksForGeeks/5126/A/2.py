

# Python program to find minimum number 
# of operations to convert a given 
# sequence to an Geometric Progression 
from sys import maxsize as INT_MAX 
  
# Function to print the GP series 
def construct(n: int, ans_pair: tuple): 
  
    # Check for possibility 
    if ans_pair[0] == -1: 
        print("Not possible") 
        return
  
    a1 = ans_pair[0] 
    a2 = ans_pair[1] 
    r = a2 / a1 
  
    print("The resultant sequence is") 
    for i in range(1, n + 1): 
        ai = a1 * pow(r, i - 1) 
        print(int(ai), end=" ") 
  
# Function for getting the Arithmetic Progression 
def findMinimumOperations(a: list, n: int): 
    ans = INT_MAX 
  
    # The array c describes all the given set of 
    # possible operations. 
    c = [-1, 0, 1] 
  
    # Size of c 
    possibilities = 3
  
    # candidate answer 
    pos1 = -1
    pos2 = -1
  
    # loop through all the permutations of the first two 
    # elements. 
    for i in range(possibilities): 
        for j in range(possibilities): 
  
            # a1 and a2 are the candidate first two elements 
            # of the possible GP. 
            a1 = a[1] + c[i] 
            a2 = a[2] + c[j] 
  
            # temp stores the current answer, including the 
            # modification of the first two elements. 
            temp = abs(a1 - a[1]) + abs(a2 - a[2]) 
  
            if a1 == 0 or a2 == 0: 
                continue
  
            # common ratio of the possible GP 
            r = a2 / a1 
  
            # To check if the chosen set is valid, and id yes 
            # find the number of operations it takes. 
            for pos in range(3, n + 1): 
  
                # ai is value of a[i] according to the assumed 
                # first two elements a1, a2 
                # ith element of an GP = a1*((a2-a1)^(i-1)) 
                ai = a1 * pow(r, pos - 1) 
  
                # Check for the "proposed" element to be only 
                # differing by one 
                if a[pos] == ai: 
                    continue
                elif a[pos] + 1 == ai or a[pos] - 1 == ai: 
                    temp += 1
                else: 
                    temp = INT_MAX # set the temporary ans 
                    break # to infinity and break 
  
            # update answer 
            if temp < ans: 
                ans = temp 
                pos1 = a1 
                pos2 = a2 
    if ans == -1: 
        print("-1") 
        return
  
    print("Minimum number of Operations are", ans) 
    ans_pair = (pos1, pos2) 
  
    # Calling function to print the sequence 
    construct(n, ans_pair) 
  
# Driver Code 
if __name__ == "__main__": 
  
    # array is 1-indexed, with a[0] = 0 
    # for the sake of simplicity 
    a = [0, 7, 20, 49, 125] 
    n = len(a) 
  
    # Function to print the minimum operations 
    # and the sequence of elements 
    findMinimumOperations(a, n - 1) 
  
# This code is contributed by 
# sanjeev2552 

