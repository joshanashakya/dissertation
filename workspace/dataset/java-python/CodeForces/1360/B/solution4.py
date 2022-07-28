n = int(input())for i in range(n):    x = int(input())    l = list(map(int, input().split()))    l.sort()    s = [None] * (x-1)    for i in range(x-1):        s[i] = (l[i+1] - l[i])    print(min(s))
