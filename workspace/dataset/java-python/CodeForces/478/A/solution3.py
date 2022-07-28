x=list(map(int, input().split()))s=sum(x)if s%5==0 and s/5!=0:    print(int(s/5))else:    print(-1)
