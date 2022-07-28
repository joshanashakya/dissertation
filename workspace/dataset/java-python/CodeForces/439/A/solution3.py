n,d=map(int,input().split())l=list(map(int,input().split()))s=sum(l)+(n-1)*10 if(s>d):    print(-1)else:    x=(n-1)*2    x+=(d-s)//5    print(x)
