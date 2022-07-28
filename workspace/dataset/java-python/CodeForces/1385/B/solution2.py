t = int(input())for i in range(t):    a = int(input())    x = list(map(int, input().split()))    u = []    for k in x:        if k not in u:            u.append(k)    print(*u)
