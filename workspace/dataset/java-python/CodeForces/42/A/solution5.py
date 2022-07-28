n,v=map(int,input().split())ar=list(map(int,input().split()))br=list(map(int,input().split()))x=min([br[i]/ar[i] for i in range(n)])sm=min(v,sum(ar)*x)print(sm)
