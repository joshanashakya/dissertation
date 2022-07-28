n,m=map(int,input().split())l=[]for i in range(n):    a,b=map(int,input().split())    l.append(m*(a/b))print(min(l))
