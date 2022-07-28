I=lambda:list(map(int,input().split()))R=range(I()[0])a=I()b=I()c=I()print(min(c[i]+c[j]+sum(a[:i]+a[:j]+b[i:]+b[j:])for i in R for j in R if i!=j))
