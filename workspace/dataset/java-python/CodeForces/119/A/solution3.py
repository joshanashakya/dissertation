import math*a,n=map(int,input().split())i=0while n>=0:	n-=math.gcd(a[i],n)	i=1-iprint(i)
