# 90Afrom math import ceilr,g,b=map(int,input().split())r1=ceil(r/2)g1=ceil(g/2)b1=ceil(b/2)ans=0n=max(r1,g1,b1)if n==b1:	ans=3*n-1elif n==g1:	ans=3*n-2else:	ans=3*n-3print(ans+30)
