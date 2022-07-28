n,m=map(int,input().split())d={}for _ in range(n):    s=list(input().split())    d[s[1]]=s[0]for _ in range(m):    x=list(input().split())    print(x[0]+" "+x[1]+" #"+d[x[1][:-1]])
