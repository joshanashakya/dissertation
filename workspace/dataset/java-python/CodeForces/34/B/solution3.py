import math def solve():    a,b=list(map(int,input().split()))        arr=[int(i) for i in input().split()]    arr.sort()     sum=0     for i in range(b):        if arr[i]>0:            break        sum+=-1*arr[i]     return sum    print(solve())
