n,s,t =map(int,input().split())P=list(map(int,input().split()))operations=0L=list(range(1,n+1))for i in range(n):    if s==t:        print(i)        exit()    s=P[s-1]print(-1)    
