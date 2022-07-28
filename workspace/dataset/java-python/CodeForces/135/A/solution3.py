a=int(input())b=list(map(int,input().split()))z=max(b)if z==1:b[b.index(z)]=2else:b[b.index(z)]=1print(*sorted(b))
