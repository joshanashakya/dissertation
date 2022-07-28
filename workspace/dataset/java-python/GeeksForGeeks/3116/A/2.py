

# Python3 program to find x such that  
# X + sumOfDigits(X) = N  
  
# Computing the sum of digits of x  
def sumOfDigits(x):  
  
    sum = 0;  
    while (x > 0): 
        sum += (x % 10);  
        x = int(x / 10);  
    return sum;  
  
# Checks for 100 numbers on both left  
# and right side of the given number  
# to find such numbers X such that  
# X + sumOfDigits(X) = N and prints  
# solution.  
def compute(n):  
  
    answer = [];  
    pos = 0;  
  
    # Checking for all possibilities  
    # of the answer in the given range  
    for i in range(101): 
  
        # Evaluating the value on the  
        # left side of the given number  
        valueOnLeft = (abs(n - i) + 
                       sumOfDigits(abs(n - i)));  
  
        # Evaluating the value on the right  
        # side of the given number  
        valueOnRight = (n + i) + sumOfDigits(n + i);  
  
        if (valueOnRight == n):  
            answer.append(n + i);  
        if (valueOnLeft == n):  
            answer.append(abs(n - i));  
  
    if (len(answer)== 0):  
        print(-1);  
    else: 
        for i in range(len(answer)):  
            print("X =", answer[i]); 
              
# Driver Code  
N = 100000001;  
compute(N);  
  
# This code is contributed  
# by mits 

