def func(n,a):        i=1    while 1:        if i not in a:            return i            break        i+=1 n=int(input())    a = list(map(int,input().split()))    print(func(n,a))
