def func1(n, x): # Solve and output    """    Solve and output    Given a 2D array of size nxn.    aij = i*j, 1 based counting     find number of cells with value 'x'    edge case if (x>(n-1)^2) no occurrence.     lets reframe the question.    We need to find the factors of x.    occurences = factors, ij and ji     Approach 1    So simple factor finding algorithm.    Simple check from 1 to j. count factors.    TC -  O(n) solution     Is this the best solution?     Now, suppose there is some k, for which x <= k*k     So you'll go like this and record factors.    (1, x), (2, x/2) ... (k, k) ... (x/2, 2), (x, 1), where k = floor(int(x**0.5))     Except, (k, k) all others are present on both sides.    We need to check only O(k**0.5) numbers.    x = k*k is possible only for perfect squares. And it is not repeated.     So algorithm:    for 1 to k, including k:        count factors, add 2 each time    if x is a perfect square and x**0.5 <=n        factor-=1, already conuted 2 above     Caveat:    1. What if x==1, yes, there shouldn't be any repetition. For loop will handle this case    2. What is n*n = x, there'll be only one. So we can optimize. Only exception    """    if n*n==x:        print(1)    else:        factors = 0        for i in range(1, 1+int(x**0.5//1)):            if x%i==0 and x/i <=n:                factors+=2        if int(x**0.5)**2==x and int(x**0.5)<=n:            factors-=1        print(factors)    pass if __name__ == '__main__':    cases = 1 ; #cases = int(input())    for i in range(cases):        n, x, _, *_ = [*map(int, filter(len, input().split(' '))), None]        func1(n, x)