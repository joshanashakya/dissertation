

# Python3 program to find the sum of all  
# perfect squares in the given range  
from math import sqrt, floor 
  
# Array to precompute the sum of squares  
# from 1 to 100010 so that for every  
# query, the answer can be returned in O(1).  
pref = [0]*100010;  
  
# Function to check if a number is  
# a perfect square or not  
def isPerfectSquare(x) : 
      
    # Find floating point value of 
    # square root of x. 
    sr = sqrt(x); 
      
    # If square root is an integer 
    rslt = x if (sr - floor(sr) == 0) else 0; 
    return rslt;  
  
# Function to precompute the perfect  
# squares upto 100000.  
def compute() : 
  
    for i in range(1 , 100001) : 
        pref[i] = pref[i - 1] + isPerfectSquare(i);  
  
# Function to print the sum for each query  
def printSum( L, R) :  
  
    sum = pref[R] - pref[L - 1];  
    print(sum ,end= " ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    # To calculate the precompute function  
    compute();  
  
    Q = 4;  
    arr = [ [ 1, 10 ],  
            [ 1, 100 ],  
            [ 2, 25 ],  
            [ 4, 50 ] ];  
  
    # Calling the printSum function  
    # for every query  
    for i in range(Q) : 
        printSum(arr[i][0], arr[i][1]);  
  
# This code is contributed by AnkitRai01 

