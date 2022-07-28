t=int(input())for _ in range(t):    n=int(input())    x=list(map(int,input().split()))    s=sum(x)    if s%n==0:        k=s//n    else:        k=s//n+1    print(k)
