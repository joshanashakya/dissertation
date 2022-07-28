n,m=list(map(int,input().split()))print(*([n//m]*(m-n%m)+[n//m+1]*(n%m)))
