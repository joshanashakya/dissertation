def f(l):    n,a = l    return (a+1)//2 if a%2>0 else (n+2-a)//2 l = list(map(int,input().split()))print(f(l))
