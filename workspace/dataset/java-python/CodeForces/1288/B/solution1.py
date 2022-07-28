t = int(input())for _ in range(t):    n,m = map(int,input().split())    m = str(m)    if len(set(m))==1 and m[-1]=='9':        print(n*(len(m)))    else:        print(n*(len(m)-1))
