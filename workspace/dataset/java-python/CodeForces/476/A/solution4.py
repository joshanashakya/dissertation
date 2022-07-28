n,m=map(int,input().split())t=(n//2)+(n%2)print(-1) if n<m else print(t+((m-(t%m))%m))
