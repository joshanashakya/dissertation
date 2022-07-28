n=int(input())a=list(map(int,input().split()))x=max(a)s=0while(sum(a)>=s):    c=0    for i in a:        c=c+(x-i)    s=c    x=x+1print(x-1)
