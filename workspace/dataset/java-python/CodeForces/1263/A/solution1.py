for _ in range(int(input())):    l=list(map(int,input().split()))    l.sort()    print(min(l[0]+l[1],sum(l)//2))
