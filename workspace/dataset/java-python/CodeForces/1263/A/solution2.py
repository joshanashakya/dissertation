t = int(input())for _ in range(t):    l = list(map(int,input().split()))    l.sort()    print(min(l[0]+l[1],sum(l)//2))
