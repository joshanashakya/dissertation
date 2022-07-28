def ans(n):    if(n==0):        return 1    if(n<=9):        return n    return max(n%10 * ans(n//10),9*ans(n//10-1))n=int(input())print(ans(n))
