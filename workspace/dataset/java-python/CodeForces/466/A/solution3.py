n,m,a,b=map(int,input().split())l=[]for i in range(0,n*2):    l.append(i*b+((n-m*i)*a if n-m*i>0 else 0))print(min(l))
