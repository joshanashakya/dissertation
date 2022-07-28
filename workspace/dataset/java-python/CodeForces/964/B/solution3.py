n,a,b,c,t=map(int,input().split())ar=list(map(int,input().split()))an=n*aif c-b>0:    for j in range(n):        an=an+(t-ar[j])*(c-b)print(an)
