# some math vladp,q=map(int,input().split())n=int(input())a=list(map(int,input().split()))x,y=a[n-1],1for i in range(n-1)[::-1]:x,y=a[i]*x+y,xprint (['NO','YES'][p*y==q*x])
