n=int(input())x=list(map(int,input().split()))c=x.copy()c.sort()print(x.index(max(x))+1, c[-2] )
