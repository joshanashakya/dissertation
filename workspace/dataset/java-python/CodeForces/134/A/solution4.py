n=int(input())ar=list(map(int,input().split()))sm=sum(ar)if(sm//n*n!=sm):    print(0)else:    vl=sm//n    print(ar.count(vl))    print(*[x+1 for x in range(n) if ar[x]==vl])
