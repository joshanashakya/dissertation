n,k=map(int,input().split())p=n//2p=min(p,k)s=0for j in range(p*2):    s=s+n-1    n=n-1print(s)
