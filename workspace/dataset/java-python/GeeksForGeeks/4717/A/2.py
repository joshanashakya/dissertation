

# Python3 program to find the sum of all  
# perfect cubes in the given range  
  
# Array to precompute the sum of cubes  
# from 1 to 100010 so that for every  
# query, the answer can be returned in O(1).  
pref = [0]*100010;  
  
# Function to check if a number is  
# a perfect Cube or not  
def isPerfectCube(x) :  
  
    # Find floating point value of  
    # cube root of x.  
    cr = round(x**(1/3));  
  
    # If cube root of x is cr  
    # return the x, else 0  
    rslt = x if (cr * cr * cr == x) else 0;  
    return rslt; 
  
# Function to precompute the perfect  
# Cubes upto 100000.  
def compute() : 
    for i in range(1, 100001) :  
        pref[i] = pref[i - 1] + isPerfectCube(i);  
  
# Function to print the sum for each query  
def printSum(L, R) :  
  
    sum = pref[R] - pref[L - 1];  
    print(sum ,end= " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    # To calculate the precompute function  
    compute();  
  
    Q = 4;  
    arr= [ [ 1, 10 ],  
            [ 1, 100 ],  
            [ 2, 25 ],  
            [ 4, 50 ] ];  
  
    # Calling the printSum function  
    # for every query  
    for i in range(Q) : 
        printSum(arr[i][0], arr[i][1]);  
  
# This code is contributed by AnkitRai01 

