n,a=map(int,input().split())x=list(map(int,input().split()))x.sort()print(0 if n == 1 else min(abs(a-x[1])+x[n-1]-x[1],abs(a-x[n-1])+x[n-1]-x[1],abs(a-x[0])+x[n-2]-x[0],abs(a-x[n-2])+x[n-2]-x[0]))
